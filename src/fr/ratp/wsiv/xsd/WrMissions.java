
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
 * <p>Java class for WrMissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WrMissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ambiguityMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ambiguousDirections" type="{http://wsiv.ratp.fr/xsd}Direction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ambiguousLines" type="{http://wsiv.ratp.fr/xsd}Line" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ambiguousStations" type="{http://wsiv.ratp.fr/xsd}Station" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="argumentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="argumentDirection" type="{http://wsiv.ratp.fr/xsd}Direction" minOccurs="0"/>
 *         &lt;element name="argumentLine" type="{http://wsiv.ratp.fr/xsd}Line" minOccurs="0"/>
 *         &lt;element name="argumentStation" type="{http://wsiv.ratp.fr/xsd}Station" minOccurs="0"/>
 *         &lt;element name="missions" type="{http://wsiv.ratp.fr/xsd}Mission" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="perturbations" type="{http://wsiv.ratp.fr/xsd}Perturbation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrMissions", propOrder = {
    "ambiguityMessage",
    "ambiguousDirections",
    "ambiguousLines",
    "ambiguousStations",
    "argumentDate",
    "argumentDirection",
    "argumentLine",
    "argumentStation",
    "missions",
    "perturbations"
})
public class WrMissions {

    @XmlElementRef(name = "ambiguityMessage", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ambiguityMessage;
    @XmlElement(nillable = true)
    protected List<Direction> ambiguousDirections;
    @XmlElement(nillable = true)
    protected List<Line> ambiguousLines;
    @XmlElement(nillable = true)
    protected List<Station> ambiguousStations;
    @XmlElementRef(name = "argumentDate", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> argumentDate;
    @XmlElementRef(name = "argumentDirection", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Direction> argumentDirection;
    @XmlElementRef(name = "argumentLine", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Line> argumentLine;
    @XmlElementRef(name = "argumentStation", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Station> argumentStation;
    @XmlElement(nillable = true)
    protected List<Mission> missions;
    @XmlElement(nillable = true)
    protected List<Perturbation> perturbations;

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
     * Gets the value of the ambiguousDirections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ambiguousDirections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmbiguousDirections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direction }
     * 
     * 
     */
    public List<Direction> getAmbiguousDirections() {
        if (ambiguousDirections == null) {
            ambiguousDirections = new ArrayList<Direction>();
        }
        return this.ambiguousDirections;
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
     * Gets the value of the ambiguousStations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ambiguousStations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmbiguousStations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Station }
     * 
     * 
     */
    public List<Station> getAmbiguousStations() {
        if (ambiguousStations == null) {
            ambiguousStations = new ArrayList<Station>();
        }
        return this.ambiguousStations;
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
     * Gets the value of the argumentStation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Station }{@code >}
     *     
     */
    public JAXBElement<Station> getArgumentStation() {
        return argumentStation;
    }

    /**
     * Sets the value of the argumentStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Station }{@code >}
     *     
     */
    public void setArgumentStation(JAXBElement<Station> value) {
        this.argumentStation = value;
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

}
