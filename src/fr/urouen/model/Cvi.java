//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.04.12 à 02:48:54 PM CEST 
//


package fr.urouen.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nom" type="{http://univ.fr/cvi}upperLetters"/>
 *                   &lt;element name="prenom" type="{http://univ.fr/cvi}upperAndLowersLetters"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="objectif">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="emploi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="prof" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="expe">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="datedeb" type="{http://univ.fr/cvi}dateTimeFormat"/>
 *                             &lt;element name="datefin" type="{http://univ.fr/cvi}dateTimeFormat" minOccurs="0"/>
 *                             &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="competences">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="diplome">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="date" type="{http://univ.fr/cvi}dateTimeFormat"/>
 *                             &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="institut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="niveau" type="{http://univ.fr/cvi}niveauDiplome" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="certif" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="datedeb" type="{http://univ.fr/cvi}dateTimeFormat"/>
 *                             &lt;element name="datefin" type="{http://univ.fr/cvi}dateTimeFormat" minOccurs="0"/>
 *                             &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="lv">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="iso" type="{http://univ.fr/cvi}langues" />
 *                           &lt;attribute name="cert" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="nivs" type="{http://univ.fr/cvi}niveauCertif" />
 *                           &lt;attribute name="nivi" type="{http://univ.fr/cvi}valeurToeic" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="info">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="langage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="niveau" type="{http://univ.fr/cvi}niveauInfo"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="divers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identite",
    "objectif",
    "prof",
    "competences",
    "divers"
})
@XmlRootElement(name = "cvi")
public class Cvi {

    @XmlElement(required = true)
    protected Cvi.Identite identite;
    @XmlElement(required = true)
    protected Cvi.Objectif objectif;
    protected Cvi.Prof prof;
    @XmlElement(required = true)
    protected Cvi.Competences competences;
    protected Cvi.Divers divers;

    
    
    
    /**
     * Obtient la valeur de la propriété identite.
     * 
     * @return
     *     possible object is
     *     {@link Cvi.Identite }
     *     
     */
    public Cvi.Identite getIdentite() {
        return identite;
    }

    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competences == null) ? 0 : competences.hashCode());
		result = prime * result + ((divers == null) ? 0 : divers.hashCode());
		result = prime * result + ((identite == null) ? 0 : identite.hashCode());
		result = prime * result + ((objectif == null) ? 0 : objectif.hashCode());
		result = prime * result + ((prof == null) ? 0 : prof.hashCode());
		return result;
	}

    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cvi other = (Cvi) obj;
		if (competences == null) {
			if (other.competences != null)
				return false;
		} else if (!competences.equals(other.competences))
			return false;
		if (divers == null) {
			if (other.divers != null)
				return false;
		} else if (!divers.equals(other.divers))
			return false;
		if (identite == null) {
			if (other.identite != null)
				return false;
		} else if (!identite.equals(other.identite))
			return false;
		if (objectif == null) {
			if (other.objectif != null)
				return false;
		} else if (!objectif.equals(other.objectif))
			return false;
		if (prof == null) {
			if (other.prof != null)
				return false;
		} else if (!prof.equals(other.prof))
			return false;
		return true;
	}

	/**
     * Définit la valeur de la propriété identite.
     * 
     * @param value
     *     allowed object is
     *     {@link Cvi.Identite }
     *     
     */
    public void setIdentite(Cvi.Identite value) {
        this.identite = value;
    }

    /**
     * Obtient la valeur de la propriété objectif.
     * 
     * @return
     *     possible object is
     *     {@link Cvi.Objectif }
     *     
     */
    public Cvi.Objectif getObjectif() {
        return objectif;
    }

    /**
     * Définit la valeur de la propriété objectif.
     * 
     * @param value
     *     allowed object is
     *     {@link Cvi.Objectif }
     *     
     */
    public void setObjectif(Cvi.Objectif value) {
        this.objectif = value;
    }

    /**
     * Obtient la valeur de la propriété prof.
     * 
     * @return
     *     possible object is
     *     {@link Cvi.Prof }
     *     
     */
    public Cvi.Prof getProf() {
        return prof;
    }

    /**
     * Définit la valeur de la propriété prof.
     * 
     * @param value
     *     allowed object is
     *     {@link Cvi.Prof }
     *     
     */
    public void setProf(Cvi.Prof value) {
        this.prof = value;
    }

    /**
     * Obtient la valeur de la propriété competences.
     * 
     * @return
     *     possible object is
     *     {@link Cvi.Competences }
     *     
     */
    public Cvi.Competences getCompetences() {
        return competences;
    }

    /**
     * Définit la valeur de la propriété competences.
     * 
     * @param value
     *     allowed object is
     *     {@link Cvi.Competences }
     *     
     */
    public void setCompetences(Cvi.Competences value) {
        this.competences = value;
    }

    /**
     * Obtient la valeur de la propriété divers.
     * 
     * @return
     *     possible object is
     *     {@link Cvi.Divers }
     *     
     */
    public Cvi.Divers getDivers() {
        return divers;
    }

    /**
     * Définit la valeur de la propriété divers.
     * 
     * @param value
     *     allowed object is
     *     {@link Cvi.Divers }
     *     
     */
    public void setDivers(Cvi.Divers value) {
        this.divers = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="diplome">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="date" type="{http://univ.fr/cvi}dateTimeFormat"/>
     *                   &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="institut" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="niveau" type="{http://univ.fr/cvi}niveauDiplome" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="certif" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="datedeb" type="{http://univ.fr/cvi}dateTimeFormat"/>
     *                   &lt;element name="datefin" type="{http://univ.fr/cvi}dateTimeFormat" minOccurs="0"/>
     *                   &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="lv">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="iso" type="{http://univ.fr/cvi}langues" />
     *                 &lt;attribute name="cert" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="nivs" type="{http://univ.fr/cvi}niveauCertif" />
     *                 &lt;attribute name="nivi" type="{http://univ.fr/cvi}valeurToeic" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="info">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="langage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="niveau" type="{http://univ.fr/cvi}niveauInfo"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "diplome",
        "certif",
        "lv",
        "info"
    })
    public static class Competences {

        @XmlElement(required = true)
        protected Cvi.Competences.Diplome diplome;
        protected Cvi.Competences.Certif certif;
        @XmlElement(required = true)
        protected Cvi.Competences.Lv lv;
        @XmlElement(required = true)
        protected Cvi.Competences.Info info;

        
        @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((certif == null) ? 0 : certif.hashCode());
			result = prime * result + ((diplome == null) ? 0 : diplome.hashCode());
			result = prime * result + ((info == null) ? 0 : info.hashCode());
			result = prime * result + ((lv == null) ? 0 : lv.hashCode());
			return result;
		}

        
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Competences other = (Competences) obj;
			if (certif == null) {
				if (other.certif != null)
					return false;
			} else if (!certif.equals(other.certif))
				return false;
			if (diplome == null) {
				if (other.diplome != null)
					return false;
			} else if (!diplome.equals(other.diplome))
				return false;
			if (info == null) {
				if (other.info != null)
					return false;
			} else if (!info.equals(other.info))
				return false;
			if (lv == null) {
				if (other.lv != null)
					return false;
			} else if (!lv.equals(other.lv))
				return false;
			return true;
		}

		/**
         * Obtient la valeur de la propriété diplome.
         * 
         * @return
         *     possible object is
         *     {@link Cvi.Competences.Diplome }
         *     
         */
        public Cvi.Competences.Diplome getDiplome() {
            return diplome;
        }

        /**
         * Définit la valeur de la propriété diplome.
         * 
         * @param value
         *     allowed object is
         *     {@link Cvi.Competences.Diplome }
         *     
         */
        public void setDiplome(Cvi.Competences.Diplome value) {
            this.diplome = value;
        }

        /**
         * Obtient la valeur de la propriété certif.
         * 
         * @return
         *     possible object is
         *     {@link Cvi.Competences.Certif }
         *     
         */
        public Cvi.Competences.Certif getCertif() {
            return certif;
        }

        /**
         * Définit la valeur de la propriété certif.
         * 
         * @param value
         *     allowed object is
         *     {@link Cvi.Competences.Certif }
         *     
         */
        public void setCertif(Cvi.Competences.Certif value) {
            this.certif = value;
        }

        /**
         * Obtient la valeur de la propriété lv.
         * 
         * @return
         *     possible object is
         *     {@link Cvi.Competences.Lv }
         *     
         */
        public Cvi.Competences.Lv getLv() {
            return lv;
        }

        /**
         * Définit la valeur de la propriété lv.
         * 
         * @param value
         *     allowed object is
         *     {@link Cvi.Competences.Lv }
         *     
         */
        public void setLv(Cvi.Competences.Lv value) {
            this.lv = value;
        }

        /**
         * Obtient la valeur de la propriété info.
         * 
         * @return
         *     possible object is
         *     {@link Cvi.Competences.Info }
         *     
         */
        public Cvi.Competences.Info getInfo() {
            return info;
        }

        /**
         * Définit la valeur de la propriété info.
         * 
         * @param value
         *     allowed object is
         *     {@link Cvi.Competences.Info }
         *     
         */
        public void setInfo(Cvi.Competences.Info value) {
            this.info = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="datedeb" type="{http://univ.fr/cvi}dateTimeFormat"/>
         *         &lt;element name="datefin" type="{http://univ.fr/cvi}dateTimeFormat" minOccurs="0"/>
         *         &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "datedeb",
            "datefin",
            "descript"
        })
        public static class Certif {

            @XmlElement(required = true)
            protected String datedeb;
            protected String datefin;
            @XmlElement(required = true)
            protected String descript;
            
            
            @Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((datedeb == null) ? 0 : datedeb.hashCode());
				result = prime * result + ((datefin == null) ? 0 : datefin.hashCode());
				result = prime * result + ((descript == null) ? 0 : descript.hashCode());
				return result;
			}

            
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Certif other = (Certif) obj;
				if (datedeb == null) {
					if (other.datedeb != null)
						return false;
				} else if (!datedeb.equals(other.datedeb))
					return false;
				if (datefin == null) {
					if (other.datefin != null)
						return false;
				} else if (!datefin.equals(other.datefin))
					return false;
				if (descript == null) {
					if (other.descript != null)
						return false;
				} else if (!descript.equals(other.descript))
					return false;
				return true;
			}

			/**
             * Obtient la valeur de la propriété datedeb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatedeb() {
                return datedeb;
            }

            /**
             * Définit la valeur de la propriété datedeb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatedeb(String value) {
                this.datedeb = value;
            }

            /**
             * Obtient la valeur de la propriété datefin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatefin() {
                return datefin;
            }

            /**
             * Définit la valeur de la propriété datefin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatefin(String value) {
                this.datefin = value;
            }

            /**
             * Obtient la valeur de la propriété descript.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescript() {
                return descript;
            }

            /**
             * Définit la valeur de la propriété descript.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescript(String value) {
                this.descript = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="date" type="{http://univ.fr/cvi}dateTimeFormat"/>
         *         &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="institut" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="niveau" type="{http://univ.fr/cvi}niveauDiplome" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "date",
            "descript",
            "institut"
        })
        public static class Diplome {

            @XmlElement(required = true)
            protected String date;
            @XmlElement(required = true)
            protected String descript;
            @XmlElement(required = true)
            protected String institut;
            @XmlAttribute(name = "niveau")
            protected NiveauDiplome niveau;

            
            @Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((date == null) ? 0 : date.hashCode());
				result = prime * result + ((descript == null) ? 0 : descript.hashCode());
				result = prime * result + ((institut == null) ? 0 : institut.hashCode());
				result = prime * result + ((niveau == null) ? 0 : niveau.hashCode());
				return result;
			}
            
            
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Diplome other = (Diplome) obj;
				if (date == null) {
					if (other.date != null)
						return false;
				} else if (!date.equals(other.date))
					return false;
				if (descript == null) {
					if (other.descript != null)
						return false;
				} else if (!descript.equals(other.descript))
					return false;
				if (institut == null) {
					if (other.institut != null)
						return false;
				} else if (!institut.equals(other.institut))
					return false;
				if (niveau != other.niveau)
					return false;
				return true;
			}

			/**
             * Obtient la valeur de la propriété date.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * Définit la valeur de la propriété date.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
            }

            /**
             * Obtient la valeur de la propriété descript.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescript() {
                return descript;
            }

            /**
             * Définit la valeur de la propriété descript.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescript(String value) {
                this.descript = value;
            }

            /**
             * Obtient la valeur de la propriété institut.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInstitut() {
                return institut;
            }

            /**
             * Définit la valeur de la propriété institut.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInstitut(String value) {
                this.institut = value;
            }

            /**
             * Obtient la valeur de la propriété niveau.
             * 
             * @return
             *     possible object is
             *     {@link NiveauDiplome }
             *     
             */
            public NiveauDiplome getNiveau() {
                return niveau;
            }

            /**
             * Définit la valeur de la propriété niveau.
             * 
             * @param value
             *     allowed object is
             *     {@link NiveauDiplome }
             *     
             */
            public void setNiveau(NiveauDiplome value) {
                this.niveau = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="langage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="niveau" type="{http://univ.fr/cvi}niveauInfo"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "langage"
        })
        public static class Info {

            @XmlElement(required = true)
            protected Cvi.Competences.Info.Langage langage;

            
            @Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((langage == null) ? 0 : langage.hashCode());
				return result;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Info other = (Info) obj;
				if (langage == null) {
					if (other.langage != null)
						return false;
				} else if (!langage.equals(other.langage))
					return false;
				return true;
			}

			/**
             * Obtient la valeur de la propriété langage.
             * 
             * @return
             *     possible object is
             *     {@link Cvi.Competences.Info.Langage }
             *     
             */
            public Cvi.Competences.Info.Langage getLangage() {
                return langage;
            }

            /**
             * Définit la valeur de la propriété langage.
             * 
             * @param value
             *     allowed object is
             *     {@link Cvi.Competences.Info.Langage }
             *     
             */
            public void setLangage(Cvi.Competences.Info.Langage value) {
                this.langage = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="niveau" type="{http://univ.fr/cvi}niveauInfo"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nom",
                "niveau"
            })
            public static class Langage {

                @XmlElement(required = true)
                protected String nom;
                protected int niveau;

                
                @Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + niveau;
					result = prime * result + ((nom == null) ? 0 : nom.hashCode());
					return result;
				}

                
				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					Langage other = (Langage) obj;
					if (niveau != other.niveau)
						return false;
					if (nom == null) {
						if (other.nom != null)
							return false;
					} else if (!nom.equals(other.nom))
						return false;
					return true;
				}

				/**
                 * Obtient la valeur de la propriété nom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNom() {
                    return nom;
                }

                /**
                 * Définit la valeur de la propriété nom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNom(String value) {
                    this.nom = value;
                }

                /**
                 * Obtient la valeur de la propriété niveau.
                 * 
                 */
                public int getNiveau() {
                    return niveau;
                }

                /**
                 * Définit la valeur de la propriété niveau.
                 * 
                 */
                public void setNiveau(int value) {
                    this.niveau = value;
                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="iso" type="{http://univ.fr/cvi}langues" />
         *       &lt;attribute name="cert" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="nivs" type="{http://univ.fr/cvi}niveauCertif" />
         *       &lt;attribute name="nivi" type="{http://univ.fr/cvi}valeurToeic" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Lv {

            @XmlAttribute(name = "iso")
            protected Langues iso;
            @XmlAttribute(name = "cert")
            protected String cert;
            @XmlAttribute(name = "nivs")
            protected NiveauCertif nivs;
            @XmlAttribute(name = "nivi")
            protected Integer nivi;

            
            @Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((cert == null) ? 0 : cert.hashCode());
				result = prime * result + ((iso == null) ? 0 : iso.hashCode());
				result = prime * result + ((nivi == null) ? 0 : nivi.hashCode());
				result = prime * result + ((nivs == null) ? 0 : nivs.hashCode());
				return result;
			}

            
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Lv other = (Lv) obj;
				if (cert == null) {
					if (other.cert != null)
						return false;
				} else if (!cert.equals(other.cert))
					return false;
				if (iso != other.iso)
					return false;
				if (nivi == null) {
					if (other.nivi != null)
						return false;
				} else if (!nivi.equals(other.nivi))
					return false;
				if (nivs != other.nivs)
					return false;
				return true;
			}

			/**
             * Obtient la valeur de la propriété iso.
             * 
             * @return
             *     possible object is
             *     {@link Langues }
             *     
             */
            public Langues getIso() {
                return iso;
            }

            /**
             * Définit la valeur de la propriété iso.
             * 
             * @param value
             *     allowed object is
             *     {@link Langues }
             *     
             */
            public void setIso(Langues value) {
                this.iso = value;
            }

            /**
             * Obtient la valeur de la propriété cert.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCert() {
                return cert;
            }

            /**
             * Définit la valeur de la propriété cert.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCert(String value) {
                this.cert = value;
            }

            /**
             * Obtient la valeur de la propriété nivs.
             * 
             * @return
             *     possible object is
             *     {@link NiveauCertif }
             *     
             */
            public NiveauCertif getNivs() {
                return nivs;
            }

            /**
             * Définit la valeur de la propriété nivs.
             * 
             * @param value
             *     allowed object is
             *     {@link NiveauCertif }
             *     
             */
            public void setNivs(NiveauCertif value) {
                this.nivs = value;
            }

            /**
             * Obtient la valeur de la propriété nivi.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNivi() {
                return nivi;
            }

            /**
             * Définit la valeur de la propriété nivi.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNivi(Integer value) {
                this.nivi = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descript"
    })
    public static class Divers {

        @XmlElement(required = true)
        protected String descript;
        
        
        @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((descript == null) ? 0 : descript.hashCode());
			return result;
		}

        
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Divers other = (Divers) obj;
			if (descript == null) {
				if (other.descript != null)
					return false;
			} else if (!descript.equals(other.descript))
				return false;
			return true;
		}

		/**
         * Obtient la valeur de la propriété descript.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescript() {
            return descript;
        }

        /**
         * Définit la valeur de la propriété descript.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescript(String value) {
            this.descript = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nom" type="{http://univ.fr/cvi}upperLetters"/>
     *         &lt;element name="prenom" type="{http://univ.fr/cvi}upperAndLowersLetters"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nom",
        "prenom"
    })
    public static class Identite {

        @XmlElement(required = true)
        protected String nom;
        @XmlElement(required = true)
        protected String prenom;

        
        @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nom == null) ? 0 : nom.hashCode());
			result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
			return result;
		}
        
        
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Identite other = (Identite) obj;
			if (nom == null) {
				if (other.nom != null)
					return false;
			} else if (!nom.equals(other.nom))
				return false;
			if (prenom == null) {
				if (other.prenom != null)
					return false;
			} else if (!prenom.equals(other.prenom))
				return false;
			return true;
		}

		/**
         * Obtient la valeur de la propriété nom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNom() {
            return nom;
        }

        /**
         * Définit la valeur de la propriété nom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNom(String value) {
            this.nom = value;
        }

        /**
         * Obtient la valeur de la propriété prenom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrenom() {
            return prenom;
        }

        /**
         * Définit la valeur de la propriété prenom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrenom(String value) {
            this.prenom = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="emploi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stage",
        "emploi"
    })
    public static class Objectif {

        protected String stage;
        protected String emploi;

        
        @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((emploi == null) ? 0 : emploi.hashCode());
			result = prime * result + ((stage == null) ? 0 : stage.hashCode());
			return result;
		}

        
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Objectif other = (Objectif) obj;
			if (emploi == null) {
				if (other.emploi != null)
					return false;
			} else if (!emploi.equals(other.emploi))
				return false;
			if (stage == null) {
				if (other.stage != null)
					return false;
			} else if (!stage.equals(other.stage))
				return false;
			return true;
		}

		/**
         * Obtient la valeur de la propriété stage.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStage() {
            return stage;
        }

        /**
         * Définit la valeur de la propriété stage.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStage(String value) {
            this.stage = value;
        }

        /**
         * Obtient la valeur de la propriété emploi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploi() {
            return emploi;
        }

        /**
         * Définit la valeur de la propriété emploi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploi(String value) {
            this.emploi = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="expe">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="datedeb" type="{http://univ.fr/cvi}dateTimeFormat"/>
     *                   &lt;element name="datefin" type="{http://univ.fr/cvi}dateTimeFormat" minOccurs="0"/>
     *                   &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "expe"
    })
    public static class Prof {

        @XmlElement(required = true)
        protected Cvi.Prof.Expe expe;

        
        @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((expe == null) ? 0 : expe.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Prof other = (Prof) obj;
			if (expe == null) {
				if (other.expe != null)
					return false;
			} else if (!expe.equals(other.expe))
				return false;
			return true;
		}

		/**
         * Obtient la valeur de la propriété expe.
         * 
         * @return
         *     possible object is
         *     {@link Cvi.Prof.Expe }
         *     
         */
        public Cvi.Prof.Expe getExpe() {
            return expe;
        }

        /**
         * Définit la valeur de la propriété expe.
         * 
         * @param value
         *     allowed object is
         *     {@link Cvi.Prof.Expe }
         *     
         */
        public void setExpe(Cvi.Prof.Expe value) {
            this.expe = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="datedeb" type="{http://univ.fr/cvi}dateTimeFormat"/>
         *         &lt;element name="datefin" type="{http://univ.fr/cvi}dateTimeFormat" minOccurs="0"/>
         *         &lt;element name="descript" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "datedeb",
            "datefin",
            "descript"
        })
        public static class Expe {

            @XmlElement(required = true)
            protected String datedeb;
            protected String datefin;
            @XmlElement(required = true)
            protected String descript;
            
            
            @Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((datedeb == null) ? 0 : datedeb.hashCode());
				result = prime * result + ((datefin == null) ? 0 : datefin.hashCode());
				result = prime * result + ((descript == null) ? 0 : descript.hashCode());
				return result;
			}

            
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Expe other = (Expe) obj;
				if (datedeb == null) {
					if (other.datedeb != null)
						return false;
				} else if (!datedeb.equals(other.datedeb))
					return false;
				if (datefin == null) {
					if (other.datefin != null)
						return false;
				} else if (!datefin.equals(other.datefin))
					return false;
				if (descript == null) {
					if (other.descript != null)
						return false;
				} else if (!descript.equals(other.descript))
					return false;
				return true;
			}

			/**
             * Obtient la valeur de la propriété datedeb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatedeb() {
                return datedeb;
            }

            /**
             * Définit la valeur de la propriété datedeb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatedeb(String value) {
                this.datedeb = value;
            }

            /**
             * Obtient la valeur de la propriété datefin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatefin() {
                return datefin;
            }

            /**
             * Définit la valeur de la propriété datefin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatefin(String value) {
                this.datefin = value;
            }

            /**
             * Obtient la valeur de la propriété descript.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescript() {
                return descript;
            }

            /**
             * Définit la valeur de la propriété descript.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescript(String value) {
                this.descript = value;
            }

        }

    }

}
