
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidateCardNumberResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validateCardNumberResult"
})
@XmlRootElement(name = "ValidateCardNumberResponse")
public class ValidateCardNumberResponse {

    @XmlElement(name = "ValidateCardNumberResult")
    protected String validateCardNumberResult;

    /**
     * Obtiene el valor de la propiedad validateCardNumberResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateCardNumberResult() {
        return validateCardNumberResult;
    }

    /**
     * Define el valor de la propiedad validateCardNumberResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateCardNumberResult(String value) {
        this.validateCardNumberResult = value;
    }

}
