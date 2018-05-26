
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
 * <p>Java class for Itinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Itinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durationsTransit" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geoPointEnd" type="{http://wsiv.ratp.fr/xsd}GeoPoint" minOccurs="0"/>
 *         &lt;element name="geoPointStart" type="{http://wsiv.ratp.fr/xsd}GeoPoint" minOccurs="0"/>
 *         &lt;element name="missions" type="{http://wsiv.ratp.fr/xsd}Mission" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tarif" type="{http://wsiv.ratp.fr/xsd}Tarif" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {
    "dateEnd",
    "dateStart",
    "durationsTransit",
    "geoPointEnd",
    "geoPointStart",
    "missions",
    "tarif"
})
public class Itinerary {

    @XmlElementRef(name = "dateEnd", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateEnd;
    @XmlElementRef(name = "dateStart", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateStart;
    @XmlElement(nillable = true)
    protected List<Integer> durationsTransit;
    @XmlElementRef(name = "geoPointEnd", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoPoint> geoPointEnd;
    @XmlElementRef(name = "geoPointStart", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoPoint> geoPointStart;
    @XmlElement(nillable = true)
    protected List<Mission> missions;
    @XmlElementRef(name = "tarif", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Tarif> tarif;

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateEnd(JAXBElement<String> value) {
        this.dateEnd = value;
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
     * Gets the value of the durationsTransit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the durationsTransit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDurationsTransit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDurationsTransit() {
        if (durationsTransit == null) {
            durationsTransit = new ArrayList<Integer>();
        }
        return this.durationsTransit;
    }

    /**
     * Gets the value of the geoPointEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public JAXBElement<GeoPoint> getGeoPointEnd() {
        return geoPointEnd;
    }

    /**
     * Sets the value of the geoPointEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public void setGeoPointEnd(JAXBElement<GeoPoint> value) {
        this.geoPointEnd = value;
    }

    /**
     * Gets the value of the geoPointStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public JAXBElement<GeoPoint> getGeoPointStart() {
        return geoPointStart;
    }

    /**
     * Sets the value of the geoPointStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public void setGeoPointStart(JAXBElement<GeoPoint> value) {
        this.geoPointStart = value;
    }

    /**
     * Gets the value of the missions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mission }
     * 
     * 
     */
    public List<Mission> getMissions() {
        if (missions == null) {
            missions = new ArrayList<Mission>();
        }
        return this.missions;
    }

    /**
     * Gets the value of the tarif property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Tarif }{@code >}
     *     
     */
    public JAXBElement<Tarif> getTarif() {
        return tarif;
    }

    /**
     * Sets the value of the tarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Tarif }{@code >}
     *     
     */
    public void setTarif(JAXBElement<Tarif> value) {
        this.tarif = value;
    }

}
