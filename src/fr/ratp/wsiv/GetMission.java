
package fr.ratp.wsiv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.ratp.wsiv.xsd.Mission;


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
 *         &lt;element name="mission" type="{http://wsiv.ratp.fr/xsd}Mission" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="stationSortAlpha" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "mission",
    "date",
    "stationAll",
    "stationSortAlpha"
})
@XmlRootElement(name = "getMission")
public class GetMission {

    @XmlElementRef(name = "mission", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<Mission> mission;
    @XmlElementRef(name = "date", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> date;
    protected Boolean stationAll;
    protected Boolean stationSortAlpha;

    /**
     * Gets the value of the mission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Mission }{@code >}
     *     
     */
    public JAXBElement<Mission> getMission() {
        return mission;
    }

    /**
     * Sets the value of the mission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Mission }{@code >}
     *     
     */
    public void setMission(JAXBElement<Mission> value) {
        this.mission = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDate(JAXBElement<String> value) {
        this.date = value;
    }

    /**
     * Gets the value of the stationAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStationAll() {
        return stationAll;
    }

    /**
     * Sets the value of the stationAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStationAll(Boolean value) {
        this.stationAll = value;
    }

    /**
     * Gets the value of the stationSortAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStationSortAlpha() {
        return stationSortAlpha;
    }

    /**
     * Sets the value of the stationSortAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStationSortAlpha(Boolean value) {
        this.stationSortAlpha = value;
    }

}
