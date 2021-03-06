
package com.nb.library.client.editor;

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
@WebServiceClient(name = "EditorService", targetNamespace = "editor.client.library.nb.com", wsdlLocation = "http://web-service:8080/library/EditorService?wsdl")
public class EditorService
    extends Service
{

    private final static URL EDITORSERVICE_WSDL_LOCATION;
    private final static WebServiceException EDITORSERVICE_EXCEPTION;
    private final static QName EDITORSERVICE_QNAME = new QName("editor.client.library.nb.com", "EditorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://web-service:8080/library/EditorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EDITORSERVICE_WSDL_LOCATION = url;
        EDITORSERVICE_EXCEPTION = e;
    }

    public EditorService() {
        super(__getWsdlLocation(), EDITORSERVICE_QNAME);
    }

    public EditorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EDITORSERVICE_QNAME, features);
    }

    public EditorService(URL wsdlLocation) {
        super(wsdlLocation, EDITORSERVICE_QNAME);
    }

    public EditorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EDITORSERVICE_QNAME, features);
    }

    public EditorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EditorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EditorClient
     */
    @WebEndpoint(name = "EditorPort")
    public EditorClient getEditorPort() {
        return super.getPort(new QName("editor.client.library.nb.com", "EditorPort"), EditorClient.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EditorClient
     */
    @WebEndpoint(name = "EditorPort")
    public EditorClient getEditorPort(WebServiceFeature... features) {
        return super.getPort(new QName("editor.client.library.nb.com", "EditorPort"), EditorClient.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EDITORSERVICE_EXCEPTION!= null) {
            throw EDITORSERVICE_EXCEPTION;
        }
        return EDITORSERVICE_WSDL_LOCATION;
    }

}
