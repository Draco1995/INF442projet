
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
 * <p>Java class for Station complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Station">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://wsiv.ratp.fr/xsd}Direction" minOccurs="0"/>
 *         &lt;element name="geoPointA" type="{http://wsiv.ratp.fr/xsd}GeoPoint" minOccurs="0"/>
 *         &lt;element name="geoPointR" type="{http://wsiv.ratp.fr/xsd}GeoPoint" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idsNextA" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idsNextR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="line" type="{http://wsiv.ratp.fr/xsd}Line" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationArea" type="{http://wsiv.ratp.fr/xsd}StationArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Station", propOrder = {
    "direction",
    "geoPointA",
    "geoPointR",
    "id",
    "idsNextA",
    "idsNextR",
    "line",
    "name",
    "stationArea"
})

public class Station {

    @XmlElementRef(name = "direction", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Direction> direction;
    @XmlElementRef(name = "geoPointA", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoPoint> geoPointA;
    @XmlElementRef(name = "geoPointR", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoPoint> geoPointR;
    @XmlElementRef(name = "id", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElement(nillable = true)
    protected List<String> idsNextA;
    @XmlElement(nillable = true)
    protected List<String> idsNextR;
    @XmlElementRef(name = "line", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Line> line;
    @XmlElementRef(name = "name", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "stationArea", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<StationArea> stationArea;
    @Override
    public String toString() {
    	String s="";
    	try {
    		s=s+"Direction: "+direction.getValue().toString()+"\t";
    	}catch(Exception e) {}
    	try {
    		s=s+"GeoPointA: "+geoPointA.getValue().toString()+"\t";
    	}catch(Exception e) {}
    	try {
    		s=s+"GeoPointR: "+geoPointR.toString().toString()+"\t";
    	}catch(Exception e) {}
    	
    	try {
    		s=s+"StationId: "+id.getValue()+"\t";
    	}catch(Exception e) {}
    	try {
    		for(String i: idsNextA) {
    			s+="idsNextA: "+i+'\t';
    		}
    	}catch(Exception e) {}
    	try {
    		for(String i: idsNextR) {
    			s+="idsNextR: "+i+'\t';
    		}
    	}catch(Exception e) {}
    	try {
    		s+="Line: "+ line.getValue().toString()+"\t";
    	}catch(Exception e) {}
    	try {
    		s+="Name: "+name.getValue().toString()+"\t";
    	}catch(Exception e) {}
 
    	try {
    		s+="StationArea: "+stationArea.getValue().toString()+"\t";
    	}catch(Exception e) {}
    	return s;
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
     * Gets the value of the geoPointA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public JAXBElement<GeoPoint> getGeoPointA() {
        return geoPointA;
    }

    /**
     * Sets the value of the geoPointA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public void setGeoPointA(JAXBElement<GeoPoint> value) {
        this.geoPointA = value;
    }

    /**
     * Gets the value of the geoPointR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public JAXBElement<GeoPoint> getGeoPointR() {
        return geoPointR;
    }

    /**
     * Sets the value of the geoPointR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     *     
     */
    public void setGeoPointR(JAXBElement<GeoPoint> value) {
        this.geoPointR = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the idsNextA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idsNextA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdsNextA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdsNextA() {
        if (idsNextA == null) {
            idsNextA = new ArrayList<String>();
        }
        return this.idsNextA;
    }

    /**
     * Gets the value of the idsNextR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idsNextR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdsNextR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdsNextR() {
        if (idsNextR == null) {
            idsNextR = new ArrayList<String>();
        }
        return this.idsNextR;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Line }{@code >}
     *     
     */
    public JAXBElement<Line> getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Line }{@code >}
     *     
     */
    public void setLine(JAXBElement<Line> value) {
        this.line = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the stationArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StationArea }{@code >}
     *     
     */
    public JAXBElement<StationArea> getStationArea() {
        return stationArea;
    }

    /**
     * Sets the value of the stationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StationArea }{@code >}
     *     
     */
    public void setStationArea(JAXBElement<StationArea> value) {
        this.stationArea = value;
    }

}
