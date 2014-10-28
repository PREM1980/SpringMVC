
package com.webservice.demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "contactInfo", propOrder = {
	    "addr1",
	    "addr2",
	    "city",
	    "country",
	    "email",
	    "mobile",
	    "phone",
	    "pin",
	    "state"
	})
	public class ContactInfo {
	
	    protected String addr1;
	    protected String addr2;
	    protected String city;
	    protected String country;
	    protected String email;
	    protected String mobile;
	    protected String phone;
	    protected String pin;
	    protected String state;
	
	    /**
	     * Gets the value of the addr1 property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getAddr1() {
	        return addr1;
	    }
	
	    /**
	     * Sets the value of the addr1 property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setAddr1(String value) {
	        this.addr1 = value;
	    }
	
	    /**
	     * Gets the value of the addr2 property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getAddr2() {
	        return addr2;
	    }
	
	    /**
	     * Sets the value of the addr2 property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setAddr2(String value) {
	        this.addr2 = value;
	    }
	
	    /**
	     * Gets the value of the city property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getCity() {
	        return city;
	    }
	
	    /**
	     * Sets the value of the city property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setCity(String value) {
	        this.city = value;
	    }
	
	    /**
	     * Gets the value of the country property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getCountry() {
	        return country;
	    }
	
	    /**
	     * Sets the value of the country property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setCountry(String value) {
	        this.country = value;
	    }
	
	    /**
	     * Gets the value of the email property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getEmail() {
	        return email;
	    }
	
	    /**
	     * Sets the value of the email property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setEmail(String value) {
	        this.email = value;
	    }
	
	    /**
	     * Gets the value of the mobile property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getMobile() {
	        return mobile;
	    }
	
	    /**
	     * Sets the value of the mobile property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setMobile(String value) {
	        this.mobile = value;
	    }
	
	    /**
	     * Gets the value of the phone property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getPhone() {
	        return phone;
	    }
	
	    /**
	     * Sets the value of the phone property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setPhone(String value) {
	        this.phone = value;
	    }
	
	    /**
	     * Gets the value of the pin property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getPin() {
	        return pin;
	    }
	
	    /**
	     * Sets the value of the pin property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setPin(String value) {
	        this.pin = value;
	    }
	
	    /**
	     * Gets the value of the state property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link String }
	     *     
	     */
	    public String getState() {
	        return state;
	    }
	
	    /**
	     * Sets the value of the state property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link String }
	     *     
	     */
	    public void setState(String value) {
	        this.state = value;
	    }
	
	}
