
package net.webservicex.loan;

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
 *         &lt;element name="APRResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "aprResult"
})
@XmlRootElement(name = "APRResponse")
public class APRResponse {

    @XmlElement(name = "APRResult")
    protected double aprResult;

    /**
     * Obtiene el valor de la propiedad aprResult.
     * 
     */
    public double getAPRResult() {
        return aprResult;
    }

    /**
     * Define el valor de la propiedad aprResult.
     * 
     */
    public void setAPRResult(double value) {
        this.aprResult = value;
    }

}
