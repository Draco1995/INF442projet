
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
 * <p>Java class for WrMission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WrMission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ambiguityMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ambiguousLines" type="{http://wsiv.ratp.fr/xsd}Line" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="argumentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="argumentLine" type="{http://wsiv.ratp.fr/xsd}Line" minOccurs="0"/>
 *         &lt;element name="mission" type="{http://wsiv.ratp.fr/xsd}Mission" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrMission", propOrder = {
    "ambiguityMessage",
    "ambiguousLines",
    "argumentDate",
    "argumentLine",
    "mission"
})
public class WrMission {

    @XmlElementRef(name = "ambiguityMessage", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ambiguityMessage;
    @XmlElement(nillable = true)
    protected List<Line> ambiguousLines;
    @XmlElementRef(name = "argumentDate", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> argumentDate;
    @XmlElementRef(name = "argumentLine", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Line> argumentLine;
    @XmlElementRef(name = "mission", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Mission> mission;

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
     * Gets the value of the mission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Mission }{@code >}
     *     
     */
    public JAXBElement<Mission> getMission() {
        return mission;
    }

    /**
     * Sets the value of the mission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Mission }{@code >}
     *     
     */
    public void setMission(JAXBElement<Mission> value) {
        this.mission = value;
    }

}
