//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.17 at 05:30:16 PM IST 
//


package com.gp.cybersource.common.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmvRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmvRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="combinedTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aidAndDFname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmvRequest", propOrder = {
    "combinedTags",
    "cardSequenceNumber",
    "aidAndDFname"
})
public class EmvRequest {

    protected String combinedTags;
    protected String cardSequenceNumber;
    protected String aidAndDFname;

    /**
     * Gets the value of the combinedTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinedTags() {
        return combinedTags;
    }

    /**
     * Sets the value of the combinedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinedTags(String value) {
        this.combinedTags = value;
    }

    /**
     * Gets the value of the cardSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Sets the value of the cardSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSequenceNumber(String value) {
        this.cardSequenceNumber = value;
    }

    /**
     * Gets the value of the aidAndDFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAidAndDFname() {
        return aidAndDFname;
    }

    /**
     * Sets the value of the aidAndDFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAidAndDFname(String value) {
        this.aidAndDFname = value;
    }

}
