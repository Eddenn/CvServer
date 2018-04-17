//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.04.12 à 02:48:54 PM CEST 
//


package fr.urouen.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour niveauDiplome.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="niveauDiplome">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="IV"/>
 *     &lt;enumeration value="III"/>
 *     &lt;enumeration value="II"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "niveauDiplome")
@XmlEnum
public enum NiveauDiplome {

    V,
    IV,
    III,
    II,
    I;

    public String value() {
        return name();
    }

    public static NiveauDiplome fromValue(String v) {
        return valueOf(v);
    }

}
