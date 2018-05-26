
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
import fr.ratp.wsiv.xsd.GeoPoint;
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
 *         &lt;element name="gp" type="{http://wsiv.ratp.fr/xsd}GeoPoint" minOccurs="0"/>
 *         &lt;element name="distances" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sortAlpha" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "gp",
    "distances",
    "limit",
    "sortAlpha"
})
@XmlRootElement(name = "getStations")
public class GetStations {

    @XmlElementRef(name = "station", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<Station> station;
    @XmlElementRef(name = "gp", namespace = "http://wsiv.ratp.fr", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoPoint> gp;
    @XmlElement(type = Integer.class)
    protected List<Integer> distances;
    protected Integer limit;
    protected Boolean sortAlpha;

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

    /**
     * Gets the value of the sortAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortAlpha() {
        return sortAlpha;
    }

    /**
     * Sets the value of the sortAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortAlpha(Boolean value) {
        this.sortAlpha = value;
    }

}
