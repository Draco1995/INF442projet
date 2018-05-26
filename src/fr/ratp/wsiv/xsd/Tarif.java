
package fr.ratp.wsiv.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tarif complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tarif">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="demiTarif" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pleinTarif" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="viaLine" type="{http://wsiv.ratp.fr/xsd}Line" minOccurs="0"/>
 *         &lt;element name="viaReseau" type="{http://wsiv.ratp.fr/xsd}Reseau" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tarif", propOrder = {
    "demiTarif",
    "pleinTarif",
    "viaLine",
    "viaReseau"
})
public class Tarif {

    protected Float demiTarif;
    protected Float pleinTarif;
    @XmlElementRef(name = "viaLine", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Line> viaLine;
    @XmlElementRef(name = "viaReseau", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Reseau> viaReseau;

    /**
     * Gets the value of the demiTarif property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDemiTarif() {
        return demiTarif;
    }

    /**
     * Sets the value of the demiTarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDemiTarif(Float value) {
        this.demiTarif = value;
    }

    /**
     * Gets the value of the pleinTarif property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPleinTarif() {
        return pleinTarif;
    }

    /**
     * Sets the value of the pleinTarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPleinTarif(Float value) {
        this.pleinTarif = value;
    }

    /**
     * Gets the value of the viaLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Line }{@code >}
     *     
     */
    public JAXBElement<Line> getViaLine() {
        return viaLine;
    }

    /**
     * Sets the value of the viaLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Line }{@code >}
     *     
     */
    public void setViaLine(JAXBElement<Line> value) {
        this.viaLine = value;
    }

    /**
     * Gets the value of the viaReseau property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Reseau }{@code >}
     *     
     */
    public JAXBElement<Reseau> getViaReseau() {
        return viaReseau;
    }

    /**
     * Sets the value of the viaReseau property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Reseau }{@code >}
     *     
     */
    public void setViaReseau(JAXBElement<Reseau> value) {
        this.viaReseau = value;
    }

}
