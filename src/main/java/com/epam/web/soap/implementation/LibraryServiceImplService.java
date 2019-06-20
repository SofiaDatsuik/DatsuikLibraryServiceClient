
package com.epam.web.soap.implementation;

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
@WebServiceClient(name = "LibraryServiceImplService", targetNamespace = "http://soap.web.epam.com/", wsdlLocation = "http://localhost:8080/LibraryServiceDatsiuk/librarySOAP?wsdl")
public class LibraryServiceImplService
    extends Service
{

    private final static URL LIBRARYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException LIBRARYSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName LIBRARYSERVICEIMPLSERVICE_QNAME = new QName("http://soap.web.epam.com/", "LibraryServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/LibraryServiceDatsiuk/librarySOAP?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIBRARYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        LIBRARYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public LibraryServiceImplService() {
        super(__getWsdlLocation(), LIBRARYSERVICEIMPLSERVICE_QNAME);
    }

    public LibraryServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIBRARYSERVICEIMPLSERVICE_QNAME, features);
    }

    public LibraryServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, LIBRARYSERVICEIMPLSERVICE_QNAME);
    }

    public LibraryServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIBRARYSERVICEIMPLSERVICE_QNAME, features);
    }

    public LibraryServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LibraryServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LibraryService
     */
    @WebEndpoint(name = "LibraryServiceImplPort")
    public LibraryService getLibraryServiceImplPort() {
        return super.getPort(new QName("http://soap.web.epam.com/", "LibraryServiceImplPort"), LibraryService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LibraryService
     */
    @WebEndpoint(name = "LibraryServiceImplPort")
    public LibraryService getLibraryServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.web.epam.com/", "LibraryServiceImplPort"), LibraryService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIBRARYSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw LIBRARYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return LIBRARYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
