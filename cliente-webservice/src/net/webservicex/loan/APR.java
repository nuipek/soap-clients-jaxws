
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
 *         &lt;element name="ExtraCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Months" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "extraCost",
    "interestRate",
    "months"
})
@XmlRootElement(name = "APR")
public class APR {

    @XmlElement(name = "LoanAmount")
    protected double loanAmount;
    @XmlElement(name = "ExtraCost")
    protected double extraCost;
    @XmlElement(name = "InterestRate")
    protected double interestRate;
    @XmlElement(name = "Months")
    protected double months;

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
     * Obtiene el valor de la propiedad extraCost.
     * 
     */
    public double getExtraCost() {
        return extraCost;
    }

    /**
     * Define el valor de la propiedad extraCost.
     * 
     */
    public void setExtraCost(double value) {
        this.extraCost = value;
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
     * Obtiene el valor de la propiedad months.
     * 
     */
    public double getMonths() {
        return months;
    }

    /**
     * Define el valor de la propiedad months.
     * 
     */
    public void setMonths(double value) {
        this.months = value;
    }

}
