
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
 * <p>Java class for Mission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://wsiv.ratp.fr/xsd}Direction" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line" type="{http://wsiv.ratp.fr/xsd}Line" minOccurs="0"/>
 *         &lt;element name="perturbations" type="{http://wsiv.ratp.fr/xsd}Perturbation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stationEndLine" type="{http://wsiv.ratp.fr/xsd}Station" minOccurs="0"/>
 *         &lt;element name="stations" type="{http://wsiv.ratp.fr/xsd}Station" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stationsDates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stationsMessages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stationsPlatforms" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stationsStops" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mission", propOrder = {
    "code",
    "direction",
    "id",
    "line",
    "perturbations",
    "stationEndLine",
    "stations",
    "stationsDates",
    "stationsMessages",
    "stationsPlatforms",
    "stationsStops"
})
public class Mission {

    @XmlElementRef(name = "code", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "direction", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Direction> direction;
    @XmlElementRef(name = "id", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "line", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Line> line;
    @XmlElement(nillable = true)
    protected List<Perturbation> perturbations;
    @XmlElementRef(name = "stationEndLine", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Station> stationEndLine;
    @XmlElement(nillable = true)
    protected List<Station> stations;
    @XmlElement(nillable = true)
    protected List<String> stationsDates;
    @XmlElement(nillable = true)
    protected List<String> stationsMessages;
    @XmlElement(nillable = true)
    protected List<String> stationsPlatforms;
    @XmlElement(nillable = true)
    protected List<Boolean> stationsStops;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
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
     * Gets the value of the perturbations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perturbations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerturbations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Perturbation }
     * 
     * 
     */
    public List<Perturbation> getPerturbations() {
        if (perturbations == null) {
            perturbations = new ArrayList<Perturbation>();
        }
        return this.perturbations;
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

    /**
     * Gets the value of the stationsDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationsDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationsDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStationsDates() {
        if (stationsDates == null) {
            stationsDates = new ArrayList<String>();
        }
        return this.stationsDates;
    }

    /**
     * Gets the value of the stationsMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationsMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationsMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStationsMessages() {
        if (stationsMessages == null) {
            stationsMessages = new ArrayList<String>();
        }
        return this.stationsMessages;
    }

    /**
     * Gets the value of the stationsPlatforms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationsPlatforms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationsPlatforms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStationsPlatforms() {
        if (stationsPlatforms == null) {
            stationsPlatforms = new ArrayList<String>();
        }
        return this.stationsPlatforms;
    }

    /**
     * Gets the value of the stationsStops property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationsStops property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationsStops().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getStationsStops() {
        if (stationsStops == null) {
            stationsStops = new ArrayList<Boolean>();
        }
        return this.stationsStops;
    }
    
    @Override
    public String toString() {
    	String s = "";
    	try {
    		s+="direction:"+this.getDirection().getValue().toString()+"\t";
    	}catch(Exception e) {}
    	try {
    		s+="code:"+this.getCode().getValue()+"\t";
    	}catch(Exception e) {}
    	try {
    		s+="id:"+this.getId().getValue()+"\t";
    	}catch(Exception e) {}
    	try {
    		s+="line:"+this.getLine().getValue()+"\t";
    	}catch(Exception e) {}
    	try {
    		String ss = "";
    		for(Perturbation p:this.getPerturbations())
    			ss+=p.toString();
    		if(!ss.equals(""))
    			s+="perturbation:"+ss+"\t";
    	}catch(Exception e) {}
    	
    	try {
    		String ss = "";
    		for(Station p:this.getStations())
    			ss+=p.toString()+" ";
    		if(!ss.equals(""))
    			s+="station:"+ss+"\t";
    	}catch(Exception e) {}
    	try {
    		s+="stationEndLine:"+this.getStationEndLine().getValue()+"\t";
    	}catch(Exception e) {}
    	try {
    		String ss = "";
    		for(String p:this.getStationsDates())
    			ss+=p+" ";
    		if(!ss.equals(""))
    			s+="stationDates:"+ss+"\t";
    	}catch(Exception e) {}
    	try {
    		String ss = "";
    		for(String p:this.getStationsMessages())
    			ss+=p.toString()+" ";
    		if(!ss.equals(""))
    			s+="stationMessages:"+ss+"\t";
    	}catch(Exception e) {}
    	try {
    		String ss = "";
    		for(String p:this.getStationsPlatforms())
    			ss+=p.toString()+ " ";
    		if(!ss.equals(""))
    			s+="stationPlatforms:"+ss+"\t";
    	}catch(Exception e) {}
    	return s;
    }
}
