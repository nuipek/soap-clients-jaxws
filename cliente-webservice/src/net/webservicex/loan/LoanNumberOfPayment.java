
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
 *         &lt;element name="LoanAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MonthlyPayment" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "loanAmount",
    "interestRate",
    "monthlyPayment"
})
@XmlRootElement(name = "LoanNumberOfPayment")
public class LoanNumberOfPayment {

    @XmlElement(name = "LoanAmount")
    protected double loanAmount;
    @XmlElement(name = "InterestRate")
    protected double interestRate;
    @XmlElement(name = "MonthlyPayment")
    protected double monthlyPayment;

    /**
     * Obtiene el valor de la propiedad loanAmount.
     * 
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * Define el valor de la propiedad loanAmount.
     * 
     */
    public void setLoanAmount(double value) {
        this.loanAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad interestRate.
     * 
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Define el valor de la propiedad interestRate.
     * 
     */
    public void setInterestRate(double value) {
        this.interestRate = value;
    }

    /**
     * Obtiene el valor de la propiedad monthlyPayment.
     * 
     */
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    /**
     * Define el valor de la propiedad monthlyPayment.
     * 
     */
    public void setMonthlyPayment(double value) {
        this.monthlyPayment = value;
    }

}
