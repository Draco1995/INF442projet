
package fr.ratp.wsiv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="stationEndLine" type="{http://wsiv.ratp.fr/xsd}Station" minOccurs="0"/>
 *         &lt;element name="stationEnd" type="{http://wsiv.ratp.fr/xsd}Station" minOccurs="0"/>
 *         &lt;element name="datesStart" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datesEnd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "stationEndLine",
    "stationEnd",
    "datesStart",
    "datesEnd"
})
@XmlRootElement(name = "getMissionsFrequency")
public class GetMissionsFrequency {

    @XmlElementRef(name = "station", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<Station> station;
    @XmlElementRef(name = "direction", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<Direction> direction;
    @XmlElementRef(name = "stationEndLine", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<Station> stationEndLine;
    @XmlElementRef(name = "stationEnd", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<Station> stationEnd;
    @XmlElement(nillable = true)
    protected List<String> datesStart;
    @XmlElement(nillable = true)
    protected List<String> datesEnd;

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
     * Gets the value of the stationEndLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Station }{@code >}
     *     
     */
    public JAXBElement<Station> getStationEndLine() {
        return stationEndLine;
    }

    /**
     * Sets the value of the stationEndLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Station }{@code >}
     *     
     */
    public void setStationEndLine(JAXBElement<Station> value) {
        this.stationEndLine = value;
    }

    /**
     * Gets the value of the stationEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Station }{@code >}
     *     
     */
    public JAXBElement<Station> getStationEnd() {
        return stationEnd;
    }

    /**
     * Sets the value of the stationEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Station }{@code >}
     *     
     */
    public void setStationEnd(JAXBElement<Station> value) {
        this.stationEnd = value;
    }

    /**
     * Gets the value of the datesStart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datesStart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatesStart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDatesStart() {
        if (datesStart == null) {
            datesStart = new ArrayList<String>();
        }
        return this.datesStart;
    }

    /**
     * Gets the value of the datesEnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datesEnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatesEnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDatesEnd() {
        if (datesEnd == null) {
            datesEnd = new ArrayList<String>();
        }
        return this.datesEnd;
    }

}
