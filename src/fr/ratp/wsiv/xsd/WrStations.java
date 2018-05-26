
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
 * <p>Java class for WrStations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WrStations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ambiguityMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ambiguousGeoPoints" type="{http://wsiv.ratp.fr/xsd}GeoPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ambiguousLines" type="{http://wsiv.ratp.fr/xsd}Line" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="argumentDirection" type="{http://wsiv.ratp.fr/xsd}Direction" minOccurs="0"/>
 *         &lt;element name="argumentGeoPoint" type="{http://wsiv.ratp.fr/xsd}GeoPoint" minOccurs="0"/>
 *         &lt;element name="argumentLine" type="{http://wsiv.ratp.fr/xsd}Line" minOccurs="0"/>
 *         &lt;element name="distances" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stations" type="{http://wsiv.ratp.fr/xsd}Station" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrStations", propOrder = {
    "ambiguityMessage",
    "ambiguousGeoPoints",
    "ambiguousLines",
    "argumentDirection",
    "argumentGeoPoint",
    "argumentLine",
    "distances",
    "stations"
})
public class WrStations {

    @XmlElementRef(name = "ambiguityMessage", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ambiguityMessage;
    @XmlElement(nillable = true)
    protected List<GeoPoint> ambiguousGeoPoints;
    @XmlElement(nillable = true)
    protected List<Line> ambiguousLines;
    @XmlElementRef(name = "argumentDirection", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Direction> argumentDirection;
    @XmlElementRef(name = "argumentGeoPoint", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoPoint> argumentGeoPoint;
    @XmlElementRef(name = "argumentLine", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Line> argumentLine;
    @XmlElement(nillable = true)
    protected List<Integer> distances;
    @XmlElement(nillable = true)
    protected List<Station> stations;

    /**
     * Gets the value of the ambiguityMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmbiguityMessage() {
        return ambiguityMessage;
    }

    /**
     * Sets the value of the ambiguityMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmbiguityMessage(JAXBElement<String> value) {
        this.ambiguityMessage = value;
    }

    /**
     * Gets the value of the ambiguousGeoPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ambiguousGeoPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmbiguousGeoPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoPoint }
     * 
     * 
     */
    public List<GeoPoint> getAmbiguousGeoPoints() {
        if (ambiguousGeoPoints == null) {
            ambiguousGeoPoints = new ArrayList<GeoPoint>();
        }
        return this.ambiguousGeoPoints;
    }

    /**
     * Gets the value of the ambiguousLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ambiguousLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmbiguousLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     * 
     * 
     */
    public List<Line> getAmbiguousLines() {
        if (ambiguousLines == null) {
            ambiguousLines = new ArrayList<Line>();
        }
        return this.ambiguousLines;
    }

    /**
     * Gets the value of the argumentDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Direction }{@code >}
     *     
     */
    public JAXBElement<Direction> getArgumentDirection() {
        return argumentDirection;
    }

    /**
     * Sets the value of the argumentDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Direction }{@code >}
     *     
     */
    public void setArgumentDirection(JAXBElement<Direction> value) {
        this.argumentDirection = value;
    }

    /**
     * Gets the value of the argumentGeoPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public JAXBElement<GeoPoint> getArgumentGeoPoint() {
        return argumentGeoPoint;
    }

    /**
     * Sets the value of the argumentGeoPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public void setArgumentGeoPoint(JAXBElement<GeoPoint> value) {
        this.argumentGeoPoint = value;
    }

    /**
     * Gets the value of the argumentLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Line }{@code >}
     *     
     */
    public JAXBElement<Line> getArgumentLine() {
        return argumentLine;
    }

    /**
     * Sets the value of the argumentLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Line }{@code >}
     *     
     */
    public void setArgumentLine(JAXBElement<Line> value) {
        this.argumentLine = value;
    }

    /**
     * Gets the value of the distances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDistances() {
        if (distances == null) {
            distances = new ArrayList<Integer>();
        }
        return this.distances;
    }

    /**
     * Gets the value of the stations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Station }
     * 
     * 
     */
    public List<Station> getStations() {
        if (stations == null) {
            stations = new ArrayList<Station>();
        }
        return this.stations;
    }

}
