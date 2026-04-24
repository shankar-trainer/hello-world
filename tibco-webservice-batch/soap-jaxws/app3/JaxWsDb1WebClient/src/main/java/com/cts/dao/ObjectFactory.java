
package com.cts.dao;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cts.dao package. 
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

    private static final QName _Exception_QNAME = new QName("http://dao.cts.com/", "Exception");
    private static final QName _AddCustomer_QNAME = new QName("http://dao.cts.com/", "addCustomer");
    private static final QName _AddCustomerResponse_QNAME = new QName("http://dao.cts.com/", "addCustomerResponse");
    private static final QName _GetAllCustomer_QNAME = new QName("http://dao.cts.com/", "getAllCustomer");
    private static final QName _GetAllCustomerResponse_QNAME = new QName("http://dao.cts.com/", "getAllCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cts.dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     * @return
     *     the new instance of {@link Exception }
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     * @return
     *     the new instance of {@link AddCustomer }
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     * @return
     *     the new instance of {@link AddCustomerResponse }
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomer }
     * 
     * @return
     *     the new instance of {@link GetAllCustomer }
     */
    public GetAllCustomer createGetAllCustomer() {
        return new GetAllCustomer();
    }

    /**
     * Create an instance of {@link GetAllCustomerResponse }
     * 
     * @return
     *     the new instance of {@link GetAllCustomerResponse }
     */
    public GetAllCustomerResponse createGetAllCustomerResponse() {
        return new GetAllCustomerResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     * @return
     *     the new instance of {@link Customer }
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://dao.cts.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://dao.cts.com/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dao.cts.com/", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://dao.cts.com/", name = "getAllCustomer")
    public JAXBElement<GetAllCustomer> createGetAllCustomer(GetAllCustomer value) {
        return new JAXBElement<>(_GetAllCustomer_QNAME, GetAllCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dao.cts.com/", name = "getAllCustomerResponse")
    public JAXBElement<GetAllCustomerResponse> createGetAllCustomerResponse(GetAllCustomerResponse value) {
        return new JAXBElement<>(_GetAllCustomerResponse_QNAME, GetAllCustomerResponse.class, null, value);
    }

}
