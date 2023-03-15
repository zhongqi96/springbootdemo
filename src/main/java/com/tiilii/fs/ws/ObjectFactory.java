
package com.tiilii.fs.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tiilii.fs.ws package. 
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

    private final static QName _TiifsUpload_QNAME = new QName("http://ws.fs.tiilii.com/", "tiifsUpload");
    private final static QName _TiifsSelectResponse_QNAME = new QName("http://ws.fs.tiilii.com/", "tiifsSelectResponse");
    private final static QName _TiifsSelect_QNAME = new QName("http://ws.fs.tiilii.com/", "tiifsSelect");
    private final static QName _TiifsUploadResponse_QNAME = new QName("http://ws.fs.tiilii.com/", "tiifsUploadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tiilii.fs.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TiifsUploadResponse }
     * 
     */
    public TiifsUploadResponse createTiifsUploadResponse() {
        return new TiifsUploadResponse();
    }

    /**
     * Create an instance of {@link TiifsSelect }
     * 
     */
    public TiifsSelect createTiifsSelect() {
        return new TiifsSelect();
    }

    /**
     * Create an instance of {@link TiifsSelectResponse }
     * 
     */
    public TiifsSelectResponse createTiifsSelectResponse() {
        return new TiifsSelectResponse();
    }

    /**
     * Create an instance of {@link TiifsUpload }
     * 
     */
    public TiifsUpload createTiifsUpload() {
        return new TiifsUpload();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiifsUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fs.tiilii.com/", name = "tiifsUpload")
    public JAXBElement<TiifsUpload> createTiifsUpload(TiifsUpload value) {
        return new JAXBElement<TiifsUpload>(_TiifsUpload_QNAME, TiifsUpload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiifsSelectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fs.tiilii.com/", name = "tiifsSelectResponse")
    public JAXBElement<TiifsSelectResponse> createTiifsSelectResponse(TiifsSelectResponse value) {
        return new JAXBElement<TiifsSelectResponse>(_TiifsSelectResponse_QNAME, TiifsSelectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiifsSelect }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fs.tiilii.com/", name = "tiifsSelect")
    public JAXBElement<TiifsSelect> createTiifsSelect(TiifsSelect value) {
        return new JAXBElement<TiifsSelect>(_TiifsSelect_QNAME, TiifsSelect.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiifsUploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fs.tiilii.com/", name = "tiifsUploadResponse")
    public JAXBElement<TiifsUploadResponse> createTiifsUploadResponse(TiifsUploadResponse value) {
        return new JAXBElement<TiifsUploadResponse>(_TiifsUploadResponse_QNAME, TiifsUploadResponse.class, null, value);
    }

}
