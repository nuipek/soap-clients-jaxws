
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
 *         &lt;element name="LoanMonthlyPaymentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "loanMonthlyPaymentResult"
})
@XmlRootElement(name = "LoanMonthlyPaymentResponse")
public class LoanMonthlyPaymentResponse {

    @XmlElement(name = "LoanMonthlyPaymentResult")
    protected double loanMonthlyPaymentResult;

    /**
     * Obtiene el valor de la propiedad loanMonthlyPaymentResult.
     * 
     */
    public double getLoanMonthlyPaymentResult() {
        return loanMonthlyPaymentResult;
    }

    /**
     * Define el valor de la propiedad loanMonthlyPaymentResult.
     * 
     */
    public void setLoanMonthlyPaymentResult(double value) {
        this.loanMonthlyPaymentResult = value;
    }

}
