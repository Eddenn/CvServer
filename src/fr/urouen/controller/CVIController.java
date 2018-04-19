package fr.urouen.controller;

import java.io.*;
import java.net.ConnectException;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.http.HTTPException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import fr.urouen.model.Cvi;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
@RestController
public class CVIController {

	private Map<UUID,Cvi> bdd;
	private Connection connection;
    private PreparedStatement delete_query;
    private PreparedStatement insert_query;
    private PreparedStatement update_query;


    public CVIController() throws SQLException {
	    bdd = new HashMap<>();
        connection = getConnection();
        DatabaseMetaData dbm = connection.getMetaData();
        // check si "cvi" table est présente
        //ResultSet tables = dbm.getTables(null, null, "CVI", null);

        createTable();
        getAllCviFromTable();

        delete_query = connection.prepareStatement("DELETE FROM CVI WHERE UUID = ?;");
        insert_query = connection.prepareStatement("INSERT INTO CVI (UUID,XML) VALUES (?, ?);");
        update_query = connection.prepareStatement("UPDATE CVI SET XML=? WHERE UUID=?;");
    }

    @PreDestroy
    public void cleanUp() throws Exception {
        connection.close();
    }

    private Connection getConnection() throws SQLException {
	    //Récupère l'url en fonction de l'environnement (sur Heroku)
        String dbUrl = System.getenv("JDBC_DATABASE_URL");
        return DriverManager.getConnection(dbUrl);
        //Sinon choisir l'url ici. (si localhost)
        //return DriverManager.getConnection(DB_URL);
    }

    private void createTable() throws SQLException {
        Statement stmt = connection.createStatement();
        String sql ="CREATE TABLE IF NOT EXISTS CVI " +
                    "(UUID CHAR(50) PRIMARY KEY NOT NULL," +
                    " XML TEXT NOT NULL)";
        stmt.executeUpdate(sql);
        stmt.close();
    }

    private void getAllCviFromTable() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * FROM CVI;" );
        while ( rs.next() ) {
            String uuid = rs.getString("UUID").trim();
            String xml = rs.getString("XML");
            try {
                bdd.put(UUID.fromString(uuid),unmarshal(xml));
            } catch (JAXBException e) {
                System.err.println("Can't unmarshall a CVI from table.");
            }
        }
        rs.close();
        stmt.close();
    }

    private void insertCviFromTable(UUID uuid, String xml) throws SQLException {
        insert_query.setString(1,uuid.toString());
        insert_query.setString(2,xml);
        insert_query.executeUpdate();
    }

    private void removeCviFromTable(UUID uuid) throws SQLException {
        delete_query.setString(1,uuid.toString());
        delete_query.executeUpdate();
    }

    private void updateCviFromTable(UUID uuid, String xml) throws SQLException {
        update_query.setString(1,xml);
        update_query.setString(2,uuid.toString());
        update_query.executeUpdate();
    }

    private static String generateMessage(String id, OperationStatus status, String description) {
        String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        sRet += "<response>";

        sRet += "<id>"+id+"</id>";
        sRet += "<status>"+status.name()+"</status>";
        sRet += "<description>"+description+"</description>";

        sRet += "</response>";
        return sRet;
    }

    private static String generateMessage(String id, OperationStatus status) {
	    String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
	    sRet += "<response>";

	    sRet += "<id>"+id+"</id>";
	    sRet += "<status>"+status.name()+"</status>";

	    sRet += "</response>";
	    return sRet;
    }

    private static String generateMessage(OperationStatus status, String description) {
        String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        sRet += "<response>";

        sRet += "<status>"+status.name()+"</status>";
        sRet += "<description>"+description+"</description>";

        sRet += "</response>";
        return sRet;
    }

    private String generateMessage(OperationStatus status) {
        String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        sRet += "<response>";

        sRet += "<status>"+status.name()+"</status>";

        sRet += "</response>";
        return sRet;
    }
	
	@RequestMapping(value = "/resume", method = RequestMethod.GET, produces = "application/xml; charset=utf-8")
	public @ResponseBody String getResume() {
		String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
		sRet += "<cvlist>";
		
		for( Entry<UUID, Cvi> entry : bdd.entrySet()) {
			sRet += "<cv>";
			sRet += "<id>" +entry.getKey()+"</id>";
			sRet += "<nom>" + entry.getValue().getIdentite().getNom() + "</nom>";
			sRet += "<prenom>" + entry.getValue().getIdentite().getPrenom() + "</prenom>";
			if(entry.getValue().getObjectif().getStage() != null) {
				sRet += "<stage>" + entry.getValue().getObjectif().getStage() + "</stage>";
			} else {
				sRet += "<emploi>" + entry.getValue().getObjectif().getEmploi() + "</emploi>";
			}
			sRet += "</cv>";
		}

		sRet += "</cvlist>";
		return sRet;
	}
	
	@RequestMapping(value = "/resume/{id}", method = RequestMethod.GET, produces = "application/xml; charset=utf-8")
	public @ResponseBody String getResumeCvId(@PathVariable("id") String id) {
		UUID uuid = null;
		String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
		sRet += "<cv>";

		try {
			uuid = UUID.fromString(id);
		} catch (IllegalArgumentException e) {
			return generateMessage(id,OperationStatus.ERROR,"Bad UUID format.");
		}
		
		if(bdd.get(uuid) != null) {
            try {
                sRet += "<id>"+uuid+"</id>";
                String marshalResult = marshal(bdd.get(uuid));
                sRet += marshalResult.substring(marshalResult.indexOf('\n'));
            } catch (JAXBException e) {
                return generateMessage(id,OperationStatus.ERROR,"Cannot marshal Cvi into xml.");
            }
        } else {
            return generateMessage(id,OperationStatus.ERROR,"Cvi not found.");
        }

        sRet += "</cv>";
		return sRet;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/xml; charset=utf-8")
	public @ResponseBody String deleteCvId(@PathVariable("id") String id) {
		UUID uuid;
		
		try {
			uuid = UUID.fromString(id);
		} catch (IllegalArgumentException e) {
            return generateMessage(OperationStatus.ERROR,"Bad UUID format.");
		}
		
		if(bdd.get(uuid) != null) {
			bdd.remove(uuid);
            try {
                removeCviFromTable(uuid);
            } catch (SQLException e) {
                return generateMessage(OperationStatus.ERROR,"Cannot remove cvi of BDD.");
            }
		} else {
            return generateMessage(OperationStatus.ERROR,"Cvi not found.");
        }

		return generateMessage(id,OperationStatus.DELETED);
	}

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/xml; charset=utf-8")
	public @ResponseBody String updateCvId(@PathVariable("id") String id, @RequestBody String xml) {
		UUID uuid;
		
		try {
			uuid = UUID.fromString(id);
		} catch (IllegalArgumentException e) {
            return generateMessage(OperationStatus.ERROR,"Bad UUID format.");
		}
        //Validating
        SimpleHandlerError handler = new SimpleHandlerError();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setValidating(false);
        factory.setNamespaceAware(true);

        SchemaFactory schemaFactory =
                SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); //https://www.w3.org/2009/XMLSchema/XMLSchema.xsd  // https://www.w3.org/2001/XMLSchema

        try {
            String xsdFile = getClass().getResource("/ProjetFileXSD.xsd").getFile();
            factory.setSchema(schemaFactory.newSchema(new Source[] {new StreamSource(xsdFile)}));
            javax.xml.parsers.SAXParser parser = factory.newSAXParser();
            XMLReader reader = parser.getXMLReader();
            reader.setErrorHandler(handler);
            InputSource input = new InputSource( new StringReader( xml ) );
            reader.parse(input);
            if (handler.hasError()) {
                return generateMessage(OperationStatus.ERROR,"Xml does not respect the xsd schema : "+handler.getErrors());
            }
        } catch (Exception e) {
            //e.printStackTrace();
            return generateMessage(OperationStatus.ERROR,"Bad initialization of parser.");
        }

		//Unmarshal
		if(bdd.get(uuid) != null) {
			Cvi cvi;
			try {
				cvi = unmarshal(xml);
				bdd.replace(uuid , cvi);
                try {
                    updateCviFromTable(uuid,xml);
                } catch (SQLException e) {
                    return generateMessage(OperationStatus.ERROR,"Cannot update into BDD.");
                }
                return generateMessage(id,OperationStatus.UPDATED);
			} catch (JAXBException e) {
                return generateMessage(OperationStatus.ERROR,"Cannot unmarshal xml into Cvi.");
			}
		} else {
            return generateMessage(OperationStatus.ERROR,"Cvi not found.");
        }
	}

	@RequestMapping(value = "/help")
	public RedirectView getHelp() {
		return new RedirectView("help.jsp");
	}

	@RequestMapping(value = "/")
	public RedirectView getIndex() {
		return new RedirectView("index.jsp");
	}
	
	

	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/xml; charset=utf-8")
	public @ResponseBody String insert(@RequestBody String xml) {
	    //Validating
		SimpleHandlerError handler = new SimpleHandlerError();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setValidating(false);
        factory.setNamespaceAware(true);

        SchemaFactory schemaFactory = 
            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); //https://www.w3.org/2009/XMLSchema/XMLSchema.xsd  // https://www.w3.org/2001/XMLSchema

		try {
            String xsdFile = getClass().getResource("/ProjetFileXSD.xsd").getFile();
			factory.setSchema(schemaFactory.newSchema(new Source[] {new StreamSource(xsdFile)}));
			javax.xml.parsers.SAXParser parser = factory.newSAXParser();
			XMLReader reader = parser.getXMLReader();
			reader.setErrorHandler(handler);
			InputSource input = new InputSource( new StringReader( xml ) );
			reader.parse(input);
			if (handler.hasError()) {
                return generateMessage(OperationStatus.ERROR,"Xml does not respect the xsd schema : "+handler.getErrors());
			}
		} catch (Exception e) {
		    //e.printStackTrace();
            return generateMessage(OperationStatus.ERROR,"Bad initialization of parser.");
		}
        
		//Unmarshall
		Cvi cvi;
		try {
			cvi = unmarshal(xml);
			UUID uuid = getUnusedUUID();
			bdd.put( uuid , cvi);
            try {
                insertCviFromTable(uuid,xml);
            } catch (SQLException e) {
                return generateMessage(OperationStatus.ERROR,"Cannot insert into BDD.");
            }
            return generateMessage(uuid.toString(),OperationStatus.INSERTED);
		} catch (JAXBException e) {
		    e.printStackTrace();
            return generateMessage(OperationStatus.ERROR,"Cannot unmarshal xml into Cvi.");
		}
	}
	
	private UUID getUnusedUUID() {
		UUID uuid;
		do {
			uuid = UUID.randomUUID();
		} while(bdd.containsKey(uuid));
		return uuid;
	}

	private Cvi unmarshal(String xml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Cvi.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Cvi) unmarshaller.unmarshal(new StreamSource(new StringReader(xml)));  
    }
	
	private String marshal(Cvi cv) throws JAXBException {
        StringWriter stringWriter = new StringWriter();

        JAXBContext jaxbContext = JAXBContext.newInstance(Cvi.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
            true);

        QName qName = new QName("", "cvi");
        JAXBElement<Cvi> root = new JAXBElement<Cvi>(qName, Cvi.class, cv);

        jaxbMarshaller.marshal(root, stringWriter);

        return stringWriter.toString();
	}

    public static void main(String[] args) throws ServletException, LifecycleException {
        String webappDirLocation = "src/main/webapp/";
        Tomcat tomcat = new Tomcat();

        //The port that we should run on can be set into an environment variable
        //Look for that variable and default to 8080 if it isn't there.
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            webPort = "80";
        }

        tomcat.setPort(Integer.valueOf(webPort));

        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        // Declare an alternative location for your "WEB-INF/classes" dir
        // Servlet 3.0 annotation will work
        File additionWebInfClasses = new File("target/classes");
        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",
                additionWebInfClasses.getAbsolutePath(), "/"));
        ctx.setResources(resources);

        tomcat.start();
        tomcat.getServer().await();
    }
}