
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
 * <p>Java class for Perturbation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Perturbation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cause" type="{http://wsiv.ratp.fr/xsd}PerturbationCause" minOccurs="0"/>
 *         &lt;element name="consequence" type="{http://wsiv.ratp.fr/xsd}PerturbationConsequence" minOccurs="0"/>
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidents" type="{http://wsiv.ratp.fr/xsd}PerturbationIncident" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line" type="{http://wsiv.ratp.fr/xsd}Line" minOccurs="0"/>
 *         &lt;element name="media" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://wsiv.ratp.fr/xsd}PerturbationMessage" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="station" type="{http://wsiv.ratp.fr/xsd}Station" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Perturbation", propOrder = {
    "cause",
    "consequence",
    "dateEnd",
    "dateStart",
    "id",
    "incidents",
    "level",
    "line",
    "media",
    "message",
    "source",
    "station",
    "status",
    "timeEnd",
    "timeStart",
    "title"
})
public class Perturbation {

    @XmlElementRef(name = "cause", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PerturbationCause> cause;
    @XmlElementRef(name = "consequence", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PerturbationConsequence> consequence;
    @XmlElementRef(name = "dateEnd", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateEnd;
    @XmlElementRef(name = "dateStart", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateStart;
    @XmlElementRef(name = "id", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElement(nillable = true)
    protected List<PerturbationIncident> incidents;
    @XmlElementRef(name = "level", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level;
    @XmlElementRef(name = "line", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Line> line;
    @XmlElementRef(name = "media", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> media;
    @XmlElementRef(name = "message", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PerturbationMessage> message;
    @XmlElementRef(name = "source", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> source;
    @XmlElementRef(name = "station", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Station> station;
    @XmlElementRef(name = "status", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "timeEnd", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeEnd;
    @XmlElementRef(name = "timeStart", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeStart;
    @XmlElementRef(name = "title", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerturbationCause }{@code >}
     *     
     */
    public JAXBElement<PerturbationCause> getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerturbationCause }{@code >}
     *     
     */
    public void setCause(JAXBElement<PerturbationCause> value) {
        this.cause = value;
    }

    /**
     * Gets the value of the consequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerturbationConsequence }{@code >}
     *     
     */
    public JAXBElement<PerturbationConsequence> getConsequence() {
        return consequence;
    }

    /**
     * Sets the value of the consequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerturbationConsequence }{@code >}
     *     
     */
    public void setConsequence(JAXBElement<PerturbationConsequence> value) {
        this.consequence = value;
    }

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
     * Gets the value of the incidents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incidents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncidents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerturbationIncident }
     * 
     * 
     */
    public List<PerturbationIncident> getIncidents() {
        if (incidents == null) {
            incidents = new ArrayList<PerturbationIncident>();
        }
        return this.incidents;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel(JAXBElement<String> value) {
        this.level = value;
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
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMedia(JAXBElement<String> value) {
        this.media = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}
     *     
     */
    public JAXBElement<PerturbationMessage> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}
     *     
     */
    public void setMessage(JAXBElement<PerturbationMessage> value) {
        this.message = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSource(JAXBElement<String> value) {
        this.source = value;
    }

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeEnd() {
        return timeEnd;
    }

    /**
     * Sets the value of the timeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeEnd(JAXBElement<String> value) {
        this.timeEnd = value;
    }

    /**
     * Gets the value of the timeStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeStart() {
        return timeStart;
    }

    /**
     * Sets the value of the timeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeStart(JAXBElement<String> value) {
        this.timeStart = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }
    
    @Override
    public String toString() {
    	String s="";
    	try {
    		s+="id:"+this.id.getValue()+"\t";
    	}catch(Exception e) {}
    	try {
    		s+=this.cause.getValue().toString()+"\t";
    	}catch(Exception e) {}
    	try {
    		s+=this.consequence.toString()+"\t";
    	}catch(Exception e) {}
    	try {
    		s+="dateStart:"+this.dateStart.getValue()+"\t";
    	}catch(Exception e) {}
    	try {
    		s+="dateEnd:"+this.dateEnd.getValue()+"\t";
    	}catch(Exception e) {}
    	try {
    		String ss = "";
    		for(PerturbationIncident p:this.incidents)
    			ss+=p+" ";
    		if(!ss.equals(""))
    			s+="incidents:"+ss+"\t";
    	}catch(Exception e) {}
    	try {
    		s+="level:"+this.level.getValue()+"\t";
    	}catch(Exception e) {}
    	return s;
    }
}
