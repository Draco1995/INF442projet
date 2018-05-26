
package fr.ratp.wsiv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.ratp.wsiv.xsd.GeoPoint;


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
 *         &lt;element name="gp" type="{http://wsiv.ratp.fr/xsd}GeoPoint" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "gp",
    "limit"
})
@XmlRootElement(name = "getGeoPoints")
public class GetGeoPoints {

    @XmlElementRef(name = "gp", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoPoint> gp;
    protected Integer limit;

    /**
     * Gets the value of the gp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public JAXBElement<GeoPoint> getGp() {
        return gp;
    }

    /**
     * Sets the value of the gp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public void setGp(JAXBElement<GeoPoint> value) {
        this.gp = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

}
