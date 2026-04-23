
package com.cts.webservice;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cts.webservice package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _DivisionException_QNAME = new QName("http://webservice.cts.com/", "DivisionException");
    private static final QName _Addition_QNAME = new QName("http://webservice.cts.com/", "addition");
    private static final QName _AdditionResponse_QNAME = new QName("http://webservice.cts.com/", "additionResponse");
    private static final QName _Division_QNAME = new QName("http://webservice.cts.com/", "division");
    private static final QName _DivisionResponse_QNAME = new QName("http://webservice.cts.com/", "divisionResponse");
    private static final QName _Sub_QNAME = new QName("http://webservice.cts.com/", "sub");
    private static final QName _SubResponse_QNAME = new QName("http://webservice.cts.com/", "subResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cts.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DivisionException }
     * 
     * @return
     *     the new instance of {@link DivisionException }
     */
    public DivisionException createDivisionException() {
        return new DivisionException();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     * @return
     *     the new instance of {@link Addition }
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     * @return
     *     the new instance of {@link AdditionResponse }
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link Division }
     * 
     * @return
     *     the new instance of {@link Division }
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     * @return
     *     the new instance of {@link DivisionResponse }
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Sub }
     * 
     * @return
     *     the new instance of {@link Sub }
     */
    public Sub createSub() {
        return new Sub();
    }

    /**
     * Create an instance of {@link SubResponse }
     * 
     * @return
     *     the new instance of {@link SubResponse }
     */
    public SubResponse createSubResponse() {
        return new SubResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionException }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.cts.com/", name = "DivisionException")
    public JAXBElement<DivisionException> createDivisionException(DivisionException value) {
        return new JAXBElement<>(_DivisionException_QNAME, DivisionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.cts.com/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.cts.com/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.cts.com/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.cts.com/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.cts.com/", name = "sub")
    public JAXBElement<Sub> createSub(Sub value) {
        return new JAXBElement<>(_Sub_QNAME, Sub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.cts.com/", name = "subResponse")
    public JAXBElement<SubResponse> createSubResponse(SubResponse value) {
        return new JAXBElement<>(_SubResponse_QNAME, SubResponse.class, null, value);
    }

}
