
package net.webservicex.bible;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.webservicex.bible package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _String_QNAME = new QName("http://www.webserviceX.NET", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.webservicex.bible
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBibleWordsbyKeyWord }
     * 
     */
    public GetBibleWordsbyKeyWord createGetBibleWordsbyKeyWord() {
        return new GetBibleWordsbyKeyWord();
    }

    /**
     * Create an instance of {@link GetBookTitles }
     * 
     */
    public GetBookTitles createGetBookTitles() {
        return new GetBookTitles();
    }

    /**
     * Create an instance of {@link GetBookTitlesResponse }
     * 
     */
    public GetBookTitlesResponse createGetBookTitlesResponse() {
        return new GetBookTitlesResponse();
    }

    /**
     * Create an instance of {@link GetBibleWordsByChapterAndVerse }
     * 
     */
    public GetBibleWordsByChapterAndVerse createGetBibleWordsByChapterAndVerse() {
        return new GetBibleWordsByChapterAndVerse();
    }

    /**
     * Create an instance of {@link GetBibleWordsByBookTitleAndChapter }
     * 
     */
    public GetBibleWordsByBookTitleAndChapter createGetBibleWordsByBookTitleAndChapter() {
        return new GetBibleWordsByBookTitleAndChapter();
    }

    /**
     * Create an instance of {@link GetBibleWordsByBookTitleAndChapterResponse }
     * 
     */
    public GetBibleWordsByBookTitleAndChapterResponse createGetBibleWordsByBookTitleAndChapterResponse() {
        return new GetBibleWordsByBookTitleAndChapterResponse();
    }

    /**
     * Create an instance of {@link GetBibleWordsByChapterAndVerseResponse }
     * 
     */
    public GetBibleWordsByChapterAndVerseResponse createGetBibleWordsByChapterAndVerseResponse() {
        return new GetBibleWordsByChapterAndVerseResponse();
    }

    /**
     * Create an instance of {@link GetBibleWordsbyKeyWordResponse }
     * 
     */
    public GetBibleWordsbyKeyWordResponse createGetBibleWordsbyKeyWordResponse() {
        return new GetBibleWordsbyKeyWordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserviceX.NET", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
