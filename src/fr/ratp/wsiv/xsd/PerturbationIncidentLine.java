
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
 * <p>Java class for PerturbationIncidentLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerturbationIncidentLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consequence" type="{http://wsiv.ratp.fr/xsd}PerturbationConsequence" minOccurs="0"/>
 *         &lt;element name="line" type="{http://wsiv.ratp.fr/xsd}Line" minOccurs="0"/>
 *         &lt;element name="messageLarge" type="{http://wsiv.ratp.fr/xsd}PerturbationMessage" minOccurs="0"/>
 *         &lt;element name="messageMedium" type="{http://wsiv.ratp.fr/xsd}PerturbationMessage" minOccurs="0"/>
 *         &lt;element name="messageShort" type="{http://wsiv.ratp.fr/xsd}PerturbationMessage" minOccurs="0"/>
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
@XmlType(name = "PerturbationIncidentLine", propOrder = {
    "consequence",
    "line",
    "messageLarge",
    "messageMedium",
    "messageShort",
    "stations"
})
public class PerturbationIncidentLine {

    @XmlElementRef(name = "consequence", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PerturbationConsequence> consequence;
    @XmlElementRef(name = "line", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Line> line;
    @XmlElementRef(name = "messageLarge", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PerturbationMessage> messageLarge;
    @XmlElementRef(name = "messageMedium", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PerturbationMessage> messageMedium;
    @XmlElementRef(name = "messageShort", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PerturbationMessage> messageShort;
    @XmlElement(nillable = true)
    protected List<Station> stations;

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
     * Gets the value of the messageLarge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}
     *     
     */
    public JAXBElement<PerturbationMessage> getMessageLarge() {
        return messageLarge;
    }

    /**
     * Sets the value of the messageLarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}
     *     
     */
    public void setMessageLarge(JAXBElement<PerturbationMessage> value) {
        this.messageLarge = value;
    }

    /**
     * Gets the value of the messageMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}
     *     
     */
    public JAXBElement<PerturbationMessage> getMessageMedium() {
        return messageMedium;
    }

    /**
     * Sets the value of the messageMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}
     *     
     */
    public void setMessageMedium(JAXBElement<PerturbationMessage> value) {
        this.messageMedium = value;
    }

    /**
     * Gets the value of the messageShort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}
     *     
     */
    public JAXBElement<PerturbationMessage> getMessageShort() {
        return messageShort;
    }

    /**
     * Sets the value of the messageShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}
     *     
     */
    public void setMessageShort(JAXBElement<PerturbationMessage> value) {
        this.messageShort = value;
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
