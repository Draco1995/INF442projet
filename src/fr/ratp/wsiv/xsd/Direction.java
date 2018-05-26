
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
 * <p>Java class for Direction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Direction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://wsiv.ratp.fr/xsd}Line" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sens" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationsEndLine" type="{http://wsiv.ratp.fr/xsd}Station" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direction", propOrder = {
    "line",
    "name",
    "sens",
    "stationsEndLine"
})
public class Direction {

    @XmlElementRef(name = "line", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Line> line;
    @XmlElementRef(name = "name", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "sens", namespace = "http://wsiv.ratp.fr/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sens;
    @XmlElement(nillable = true)
    protected List<Station> stationsEndLine;

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
     * Gets the value of the sens property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSens() {
        return sens;
    }

    /**
     * Sets the value of the sens property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSens(JAXBElement<String> value) {
        this.sens = value;
    }

    /**
     * Gets the value of the stationsEndLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationsEndLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationsEndLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Station }
     * 
     * 
     */
    public List<Station> getStationsEndLine() {
        if (stationsEndLine == null) {
            stationsEndLine = new ArrayList<Station>();
        }
        return this.stationsEndLine;
    }

}
