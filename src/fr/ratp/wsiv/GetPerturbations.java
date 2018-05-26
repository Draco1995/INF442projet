
package fr.ratp.wsiv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.ratp.wsiv.xsd.Perturbation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="perturbation" type="{http://wsiv.ratp.fr/xsd}Perturbation" minOccurs="0"/>
 *         &lt;element name="isXmlText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "perturbation",
    "isXmlText"
})
@XmlRootElement(name = "getPerturbations")
public class GetPerturbations {

    @XmlElementRef(name = "perturbation", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<Perturbation> perturbation;
    protected Boolean isXmlText;

    /**
     * Gets the value of the perturbation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Perturbation }{@code >}
     *     
     */
    public JAXBElement<Perturbation> getPerturbation() {
        return perturbation;
    }

    /**
     * Sets the value of the perturbation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Perturbation }{@code >}
     *     
     */
    public void setPerturbation(JAXBElement<Perturbation> value) {
        this.perturbation = value;
    }

    /**
     * Gets the value of the isXmlText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsXmlText() {
        return isXmlText;
    }

    /**
     * Sets the value of the isXmlText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsXmlText(Boolean value) {
        this.isXmlText = value;
    }

}
