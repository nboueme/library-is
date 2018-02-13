
package com.nb.library.client.borrowing;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BorrowingService", targetNamespace = "borrowing.client.library.nb.com", wsdlLocation = "http://web-service:8080/library/BorrowingService?wsdl")
public class BorrowingService
    extends Service
{

    private final static URL BORROWINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException BORROWINGSERVICE_EXCEPTION;
    private final static QName BORROWINGSERVICE_QNAME = new QName("borrowing.client.library.nb.com", "BorrowingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://web-service:8080/library/BorrowingService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BORROWINGSERVICE_WSDL_LOCATION = url;
        BORROWINGSERVICE_EXCEPTION = e;
    }

    public BorrowingService() {
        super(__getWsdlLocation(), BORROWINGSERVICE_QNAME);
    }

    public BorrowingService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BORROWINGSERVICE_QNAME, features);
    }

    public BorrowingService(URL wsdlLocation) {
        super(wsdlLocation, BORROWINGSERVICE_QNAME);
    }

    public BorrowingService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BORROWINGSERVICE_QNAME, features);
    }

    public BorrowingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BorrowingService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BorrowingClient
     */
    @WebEndpoint(name = "BorrowingPort")
    public BorrowingClient getBorrowingPort() {
        return super.getPort(new QName("borrowing.client.library.nb.com", "BorrowingPort"), BorrowingClient.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BorrowingClient
     */
    @WebEndpoint(name = "BorrowingPort")
    public BorrowingClient getBorrowingPort(WebServiceFeature... features) {
        return super.getPort(new QName("borrowing.client.library.nb.com", "BorrowingPort"), BorrowingClient.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BORROWINGSERVICE_EXCEPTION!= null) {
            throw BORROWINGSERVICE_EXCEPTION;
        }
        return BORROWINGSERVICE_WSDL_LOCATION;
    }

}
