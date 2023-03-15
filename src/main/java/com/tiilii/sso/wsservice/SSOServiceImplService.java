
package com.tiilii.sso.wsservice;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import org.apache.log4j.Logger;

import com.tiilii.config.WebServiceWSDLConstants;
import com.tiilii.util.ConfigPropertiesUtil;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SSOServiceImplService", targetNamespace = "http://wsService.sso.tiilii.com/")
public class SSOServiceImplService
    extends Service
{

    private final static URL SSOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SSOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName SSOSERVICEIMPLSERVICE_QNAME = new QName("http://wsService.sso.tiilii.com/", "SSOServiceImplService");

    private static Logger logger = Logger.getLogger(SSOServiceImplService.class);
    static {
        URL url = null;
        WebServiceException e = null;
        String wsdl = null;
        try {
        	wsdl = (String) ConfigPropertiesUtil.proName("wsdl.properties").getProperty("sso_wsdl");
            url = new URL(wsdl);
            logger.info("--------------sso wsdl: " + wsdl);
        } catch (MalformedURLException | UnsupportedEncodingException ex) {
            e = new WebServiceException(ex);
        }
        SSOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        SSOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public SSOServiceImplService() {
        super(__getWsdlLocation(), SSOSERVICEIMPLSERVICE_QNAME);
    }

    public SSOServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SSOSERVICEIMPLSERVICE_QNAME, features);
    }

    public SSOServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SSOSERVICEIMPLSERVICE_QNAME);
    }

    public SSOServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SSOSERVICEIMPLSERVICE_QNAME, features);
    }

    public SSOServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SSOServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ISSOService
     */
    @WebEndpoint(name = "SSOServiceImplPort")
    public ISSOService getSSOServiceImplPort() {
        return super.getPort(new QName("http://wsService.sso.tiilii.com/", "SSOServiceImplPort"), ISSOService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISSOService
     */
    @WebEndpoint(name = "SSOServiceImplPort")
    public ISSOService getSSOServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsService.sso.tiilii.com/", "SSOServiceImplPort"), ISSOService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SSOSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw SSOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return SSOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}