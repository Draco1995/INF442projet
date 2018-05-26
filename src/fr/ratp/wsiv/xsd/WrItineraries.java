
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
 * <p>Java class for WrItineraries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WrItineraries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ambiguityMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ambiguousGeoPointsEnd" type="{http://wsiv.ratp.fr/xsd}GeoPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ambiguousGeoPointsStart" type="{http://wsiv.ratp.fr/xsd}GeoPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="argumentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itineraries" type="{http://wsiv.ratp.fr/xsd}Itinerary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrItineraries", propOrder = {
    "ambiguityMessage",
    "ambiguousGeoPointsEnd",
    "ambiguousGeoPointsStart",
    "argumentDate",
    "itineraries"
})
public class WrItineraries {

    @XmlElementRef(name = "ambiguityMessage", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ambiguityMessage;
    @XmlElement(nillable = true)
    protected List<GeoPoint> ambiguousGeoPointsEnd;
    @XmlElement(nillable = true)
    protected List<GeoPoint> ambiguousGeoPointsStart;
    @XmlElementRef(name = "argumentDate", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> argumentDate;
    @XmlElement(nillable = true)
    protected List<Itinerary> itineraries;

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
     * Gets the value of the ambiguousGeoPointsEnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ambiguousGeoPointsEnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmbiguousGeoPointsEnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoPoint }
     * 
     * 
     */
    public List<GeoPoint> getAmbiguousGeoPointsEnd() {
        if (ambiguousGeoPointsEnd == null) {
            ambiguousGeoPointsEnd = new ArrayList<GeoPoint>();
        }
        return this.ambiguousGeoPointsEnd;
    }

    /**
     * Gets the value of the ambiguousGeoPointsStart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ambiguousGeoPointsStart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmbiguousGeoPointsStart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoPoint }
     * 
     * 
     */
    public List<GeoPoint> getAmbiguousGeoPointsStart() {
        if (ambiguousGeoPointsStart == null) {
            ambiguousGeoPointsStart = new ArrayList<GeoPoint>();
        }
        return this.ambiguousGeoPointsStart;
    }

    /**
     * Gets the value of the argumentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArgumentDate() {
        return argumentDate;
    }

    /**
     * Sets the value of the argumentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArgumentDate(JAXBElement<String> value) {
        this.argumentDate = value;
    }

    /**
     * Gets the value of the itineraries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itinerary }
     * 
     * 
     */
    public List<Itinerary> getItineraries() {
        if (itineraries == null) {
            itineraries = new ArrayList<Itinerary>();
        }
        return this.itineraries;
    }

}
