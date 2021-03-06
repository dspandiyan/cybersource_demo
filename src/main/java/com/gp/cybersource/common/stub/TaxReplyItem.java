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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReplyItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxReplyItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cityTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.104}amount" minOccurs="0"/&gt;
 *         &lt;element name="countyTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.104}amount" minOccurs="0"/&gt;
 *         &lt;element name="districtTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.104}amount" minOccurs="0"/&gt;
 *         &lt;element name="stateTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.104}amount" minOccurs="0"/&gt;
 *         &lt;element name="totalTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.104}amount"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReplyItem", propOrder = {
    "cityTaxAmount",
    "countyTaxAmount",
    "districtTaxAmount",
    "stateTaxAmount",
    "totalTaxAmount"
})
public class TaxReplyItem {

    protected String cityTaxAmount;
    protected String countyTaxAmount;
    protected String districtTaxAmount;
    protected String stateTaxAmount;
    @XmlElement(required = true)
    protected String totalTaxAmount;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;

    /**
     * Gets the value of the cityTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTaxAmount() {
        return cityTaxAmount;
    }

    /**
     * Sets the value of the cityTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTaxAmount(String value) {
        this.cityTaxAmount = value;
    }

    /**
     * Gets the value of the countyTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyTaxAmount() {
        return countyTaxAmount;
    }

    /**
     * Sets the value of the countyTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyTaxAmount(String value) {
        this.countyTaxAmount = value;
    }

    /**
     * Gets the value of the districtTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictTaxAmount() {
        return districtTaxAmount;
    }

    /**
     * Sets the value of the districtTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictTaxAmount(String value) {
        this.districtTaxAmount = value;
    }

    /**
     * Gets the value of the stateTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTaxAmount() {
        return stateTaxAmount;
    }

    /**
     * Sets the value of the stateTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateTaxAmount(String value) {
        this.stateTaxAmount = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxAmount(String value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
