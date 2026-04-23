
package com.cts.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for sub complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="sub"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="secondno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sub", propOrder = {
    "firstno",
    "secondno"
})
public class Sub {

    protected int firstno;
    protected int secondno;

    /**
     * Gets the value of the firstno property.
     * 
     */
    public int getFirstno() {
        return firstno;
    }

    /**
     * Sets the value of the firstno property.
     * 
     */
    public void setFirstno(int value) {
        this.firstno = value;
    }

    /**
     * Gets the value of the secondno property.
     * 
     */
    public int getSecondno() {
        return secondno;
    }

    /**
     * Sets the value of the secondno property.
     * 
     */
    public void setSecondno(int value) {
        this.secondno = value;
    }

}
