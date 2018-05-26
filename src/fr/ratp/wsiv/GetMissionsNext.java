
package fr.ratp.wsiv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.ratp.wsiv.xsd.Direction;
import fr.ratp.wsiv.xsd.Station;


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
 *         &lt;element name="station" type="{http://wsiv.ratp.fr/xsd}Station" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://wsiv.ratp.fr/xsd}Direction" minOccurs="0"/>
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "station",
    "direction",
    "dateStart",
    "limit"
})
@XmlRootElement(name = "getMissionsNext")
public class GetMissionsNext {

    @XmlElementRef(name = "station", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<Station> station;
    @XmlElementRef(name = "direction", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<Direction> direction;
    @XmlElementRef(name = "dateStart", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateStart;
    protected Integer limit;

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Station }{@code >}
     *     
     */
    public JAXBElement<Station> getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Station }{@code >}
     *     
     */
    public void setStation(JAXBElement<Station> value) {
        this.station = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Direction }{@code >}
     *     
     */
    public JAXBElement<Direction> getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Direction }{@code >}
     *     
     */
    public void setDirection(JAXBElement<Direction> value) {
        this.direction = value;
    }

    /**
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateStart(JAXBElement<String> value) {
        this.dateStart = value;
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
