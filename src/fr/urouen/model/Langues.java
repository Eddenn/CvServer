//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.04.12 à 02:48:54 PM CEST 
//


package fr.urouen.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour langues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="langues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="it"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "langues")
@XmlEnum
public enum Langues {

    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("it")
    IT("it");
    private final String value;

    Langues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Langues fromValue(String v) {
        for (Langues c: Langues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
