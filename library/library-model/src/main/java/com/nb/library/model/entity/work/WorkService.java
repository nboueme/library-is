
package com.nb.library.model.entity.work;

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
@WebServiceClient(name = "WorkService", targetNamespace = "work.entity.model.library.nb.com", wsdlLocation = "http://localhost:8080/library/WorkService?wsdl")
public class WorkService
    extends Service
{

    private final static URL WORKSERVICE_WSDL_LOCATION;
    private final static WebServiceException WORKSERVICE_EXCEPTION;
    private final static QName WORKSERVICE_QNAME = new QName("work.entity.model.library.nb.com", "WorkService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/library/WorkService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WORKSERVICE_WSDL_LOCATION = url;
        WORKSERVICE_EXCEPTION = e;
    }

    public WorkService() {
        super(__getWsdlLocation(), WORKSERVICE_QNAME);
    }

    public WorkService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WORKSERVICE_QNAME, features);
    }

    public WorkService(URL wsdlLocation) {
        super(wsdlLocation, WORKSERVICE_QNAME);
    }

    public WorkService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WORKSERVICE_QNAME, features);
    }

    public WorkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WorkService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WorkClient
     */
    @WebEndpoint(name = "WorkPort")
    public WorkClient getWorkPort() {
        return super.getPort(new QName("work.entity.model.library.nb.com", "WorkPort"), WorkClient.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkClient
     */
    @WebEndpoint(name = "WorkPort")
    public WorkClient getWorkPort(WebServiceFeature... features) {
        return super.getPort(new QName("work.entity.model.library.nb.com", "WorkPort"), WorkClient.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WORKSERVICE_EXCEPTION!= null) {
            throw WORKSERVICE_EXCEPTION;
        }
        return WORKSERVICE_WSDL_LOCATION;
    }

}
