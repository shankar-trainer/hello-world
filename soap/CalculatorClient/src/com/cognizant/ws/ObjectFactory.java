
package com.cognizant.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cognizant.ws package. 
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

    private final static QName _AdditionResponse_QNAME = new QName("http://ws.cognizant.com/", "additionResponse");
    private final static QName _Multiplicaation_QNAME = new QName("http://ws.cognizant.com/", "multiplicaation");
    private final static QName _MultiplicaationResponse_QNAME = new QName("http://ws.cognizant.com/", "multiplicaationResponse");
    private final static QName _Division_QNAME = new QName("http://ws.cognizant.com/", "division");
    private final static QName _DivisionResponse_QNAME = new QName("http://ws.cognizant.com/", "divisionResponse");
    private final static QName _Addition_QNAME = new QName("http://ws.cognizant.com/", "addition");
    private final static QName _Subtraction_QNAME = new QName("http://ws.cognizant.com/", "subtraction");
    private final static QName _SubtractionResponse_QNAME = new QName("http://ws.cognizant.com/", "subtractionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cognizant.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link MultiplicaationResponse }
     * 
     */
    public MultiplicaationResponse createMultiplicaationResponse() {
        return new MultiplicaationResponse();
    }

    /**
     * Create an instance of {@link Multiplicaation }
     * 
     */
    public Multiplicaation createMultiplicaation() {
        return new Multiplicaation();
    }

    /**
     * Create an instance of {@link SubtractionResponse }
     * 
     */
    public SubtractionResponse createSubtractionResponse() {
        return new SubtractionResponse();
    }

    /**
     * Create an instance of {@link Subtraction }
     * 
     */
    public Subtraction createSubtraction() {
        return new Subtraction();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cognizant.com/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicaation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cognizant.com/", name = "multiplicaation")
    public JAXBElement<Multiplicaation> createMultiplicaation(Multiplicaation value) {
        return new JAXBElement<Multiplicaation>(_Multiplicaation_QNAME, Multiplicaation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicaationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cognizant.com/", name = "multiplicaationResponse")
    public JAXBElement<MultiplicaationResponse> createMultiplicaationResponse(MultiplicaationResponse value) {
        return new JAXBElement<MultiplicaationResponse>(_MultiplicaationResponse_QNAME, MultiplicaationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cognizant.com/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cognizant.com/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cognizant.com/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<Addition>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cognizant.com/", name = "subtraction")
    public JAXBElement<Subtraction> createSubtraction(Subtraction value) {
        return new JAXBElement<Subtraction>(_Subtraction_QNAME, Subtraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cognizant.com/", name = "subtractionResponse")
    public JAXBElement<SubtractionResponse> createSubtractionResponse(SubtractionResponse value) {
        return new JAXBElement<SubtractionResponse>(_SubtractionResponse_QNAME, SubtractionResponse.class, null, value);
    }

}
