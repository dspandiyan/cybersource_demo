//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.17 at 05:30:16 PM IST 
//


package com.gp.cybersource.common.stub;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCDCCReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCDCCReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dccSupported" type="{urn:schemas-cybersource-com:transaction-data-1.104}boolean" minOccurs="0"/&gt;
 *         &lt;element name="validHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marginRatePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCDCCReply", propOrder = {
    "reasonCode",
    "dccSupported",
    "validHours",
    "marginRatePercentage",
    "reconciliationID"
})
public class CCDCCReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String dccSupported;
    protected String validHours;
    protected String marginRatePercentage;
    protected String reconciliationID;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the dccSupported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccSupported() {
        return dccSupported;
    }

    /**
     * Sets the value of the dccSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccSupported(String value) {
        this.dccSupported = value;
    }

    /**
     * Gets the value of the validHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidHours() {
        return validHours;
    }

    /**
     * Sets the value of the validHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidHours(String value) {
        this.validHours = value;
    }

    /**
     * Gets the value of the marginRatePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginRatePercentage() {
        return marginRatePercentage;
    }

    /**
     * Sets the value of the marginRatePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginRatePercentage(String value) {
        this.marginRatePercentage = value;
    }

    /**
     * Gets the value of the reconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

}
