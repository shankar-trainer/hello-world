
package org.com.dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.com.dao package. 
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

    private final static QName _RemoveCustomer_QNAME = new QName("http://dao.com.org/", "removeCustomer");
    private final static QName _UpdateCustomer_QNAME = new QName("http://dao.com.org/", "updateCustomer");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://dao.com.org/", "updateCustomerResponse");
    private final static QName _SearchCustomerResponse_QNAME = new QName("http://dao.com.org/", "searchCustomerResponse");
    private final static QName _SearchCustomer_QNAME = new QName("http://dao.com.org/", "searchCustomer");
    private final static QName _RemoveCustomerResponse_QNAME = new QName("http://dao.com.org/", "removeCustomerResponse");
    private final static QName _ShowAllCustomerResponse_QNAME = new QName("http://dao.com.org/", "showAllCustomerResponse");
    private final static QName _AddCustomer_QNAME = new QName("http://dao.com.org/", "addCustomer");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://dao.com.org/", "addCustomerResponse");
    private final static QName _ShowAllCustomer_QNAME = new QName("http://dao.com.org/", "showAllCustomer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.com.dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link RemoveCustomerResponse }
     * 
     */
    public RemoveCustomerResponse createRemoveCustomerResponse() {
        return new RemoveCustomerResponse();
    }

    /**
     * Create an instance of {@link ShowAllCustomerResponse }
     * 
     */
    public ShowAllCustomerResponse createShowAllCustomerResponse() {
        return new ShowAllCustomerResponse();
    }

    /**
     * Create an instance of {@link ShowAllCustomer }
     * 
     */
    public ShowAllCustomer createShowAllCustomer() {
        return new ShowAllCustomer();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link RemoveCustomer }
     * 
     */
    public RemoveCustomer createRemoveCustomer() {
        return new RemoveCustomer();
    }

    /**
     * Create an instance of {@link SearchCustomer }
     * 
     */
    public SearchCustomer createSearchCustomer() {
        return new SearchCustomer();
    }

    /**
     * Create an instance of {@link SearchCustomerResponse }
     * 
     */
    public SearchCustomerResponse createSearchCustomerResponse() {
        return new SearchCustomerResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "removeCustomer")
    public JAXBElement<RemoveCustomer> createRemoveCustomer(RemoveCustomer value) {
        return new JAXBElement<RemoveCustomer>(_RemoveCustomer_QNAME, RemoveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "searchCustomerResponse")
    public JAXBElement<SearchCustomerResponse> createSearchCustomerResponse(SearchCustomerResponse value) {
        return new JAXBElement<SearchCustomerResponse>(_SearchCustomerResponse_QNAME, SearchCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "searchCustomer")
    public JAXBElement<SearchCustomer> createSearchCustomer(SearchCustomer value) {
        return new JAXBElement<SearchCustomer>(_SearchCustomer_QNAME, SearchCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "removeCustomerResponse")
    public JAXBElement<RemoveCustomerResponse> createRemoveCustomerResponse(RemoveCustomerResponse value) {
        return new JAXBElement<RemoveCustomerResponse>(_RemoveCustomerResponse_QNAME, RemoveCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "showAllCustomerResponse")
    public JAXBElement<ShowAllCustomerResponse> createShowAllCustomerResponse(ShowAllCustomerResponse value) {
        return new JAXBElement<ShowAllCustomerResponse>(_ShowAllCustomerResponse_QNAME, ShowAllCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.com.org/", name = "showAllCustomer")
    public JAXBElement<ShowAllCustomer> createShowAllCustomer(ShowAllCustomer value) {
        return new JAXBElement<ShowAllCustomer>(_ShowAllCustomer_QNAME, ShowAllCustomer.class, null, value);
    }

}
