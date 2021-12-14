
package com.abc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WelcomeImplService", targetNamespace = "http://abc.com/", wsdlLocation = "http://localhost:8080/SoapApp1/hello?WSDL")
public class WelcomeImplService
    extends Service
{

    private final static URL WELCOMEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WELCOMEIMPLSERVICE_EXCEPTION;
    private final static QName WELCOMEIMPLSERVICE_QNAME = new QName("http://abc.com/", "WelcomeImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SoapApp1/hello?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WELCOMEIMPLSERVICE_WSDL_LOCATION = url;
        WELCOMEIMPLSERVICE_EXCEPTION = e;
    }

    public WelcomeImplService() {
        super(__getWsdlLocation(), WELCOMEIMPLSERVICE_QNAME);
    }

    public WelcomeImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WELCOMEIMPLSERVICE_QNAME, features);
    }

    public WelcomeImplService(URL wsdlLocation) {
        super(wsdlLocation, WELCOMEIMPLSERVICE_QNAME);
    }

    public WelcomeImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WELCOMEIMPLSERVICE_QNAME, features);
    }

    public WelcomeImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WelcomeImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Welcome
     */
    @WebEndpoint(name = "WelcomeImplPort")
    public Welcome getWelcomeImplPort() {
        return super.getPort(new QName("http://abc.com/", "WelcomeImplPort"), Welcome.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Welcome
     */
    @WebEndpoint(name = "WelcomeImplPort")
    public Welcome getWelcomeImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://abc.com/", "WelcomeImplPort"), Welcome.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WELCOMEIMPLSERVICE_EXCEPTION!= null) {
            throw WELCOMEIMPLSERVICE_EXCEPTION;
        }
        return WELCOMEIMPLSERVICE_WSDL_LOCATION;
    }

}
