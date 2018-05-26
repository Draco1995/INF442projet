
package fr.ratp.wsiv.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WrPerturbations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WrPerturbations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="argumentMedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="argumentSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perturbations" type="{http://wsiv.ratp.fr/xsd}Perturbation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrPerturbations", propOrder = {
    "argumentMedia",
    "argumentSource",
    "perturbations"
})
public class WrPerturbations {

    @XmlElementRef(name = "argumentMedia", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> argumentMedia;
    @XmlElementRef(name = "argumentSource", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> argumentSource;
    @XmlElement(nillable = true)
    protected List<Perturbation> perturbations;

    /**
     * Gets the value of the argumentMedia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgumentMedia() {
        return argumentMedia;
    }

    /**
     * Sets the value of the argumentMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgumentMedia(JAXBElement<String> value) {
        this.argumentMedia = value;
    }

    /**
     * Gets the value of the argumentSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgumentSource() {
        return argumentSource;
    }

    /**
     * Sets the value of the argumentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgumentSource(JAXBElement<String> value) {
        this.argumentSource = value;
    }

    /**
     * Gets the value of the perturbations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perturbations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerturbations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Perturbation }
     * 
     * 
     */
    public List<Perturbation> getPerturbations() {
        if (perturbations == null) {
            perturbations = new ArrayList<Perturbation>();
        }
        return this.perturbations;
    }

}
