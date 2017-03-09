
package net.webservicex.bible;

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
 *         &lt;element name="BookTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chapter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Verse" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "bookTitle",
    "chapter",
    "verse"
})
@XmlRootElement(name = "GetBibleWordsByChapterAndVerse")
public class GetBibleWordsByChapterAndVerse {

    @XmlElement(name = "BookTitle")
    protected String bookTitle;
    protected int chapter;
    @XmlElement(name = "Verse")
    protected int verse;

    /**
     * Obtiene el valor de la propiedad bookTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Define el valor de la propiedad bookTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad chapter.
     * 
     */
    public int getChapter() {
        return chapter;
    }

    /**
     * Define el valor de la propiedad chapter.
     * 
     */
    public void setChapter(int value) {
        this.chapter = value;
    }

    /**
     * Obtiene el valor de la propiedad verse.
     * 
     */
    public int getVerse() {
        return verse;
    }

    /**
     * Define el valor de la propiedad verse.
     * 
     */
    public void setVerse(int value) {
        this.verse = value;
    }

}
