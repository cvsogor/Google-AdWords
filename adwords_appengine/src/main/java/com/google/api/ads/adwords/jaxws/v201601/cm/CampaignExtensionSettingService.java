
package com.google.api.ads.adwords.jaxws.v201601.cm;

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
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CampaignExtensionSettingService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201601/CampaignExtensionSettingService?wsdl")
public class CampaignExtensionSettingService
    extends Service
{

    private final static URL CAMPAIGNEXTENSIONSETTINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAMPAIGNEXTENSIONSETTINGSERVICE_EXCEPTION;
    private final static QName CAMPAIGNEXTENSIONSETTINGSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignExtensionSettingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201601/CampaignExtensionSettingService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMPAIGNEXTENSIONSETTINGSERVICE_WSDL_LOCATION = url;
        CAMPAIGNEXTENSIONSETTINGSERVICE_EXCEPTION = e;
    }

    public CampaignExtensionSettingService() {
        super(__getWsdlLocation(), CAMPAIGNEXTENSIONSETTINGSERVICE_QNAME);
    }

    public CampaignExtensionSettingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CampaignExtensionSettingServiceInterface
     */
    @WebEndpoint(name = "CampaignExtensionSettingServiceInterfacePort")
    public CampaignExtensionSettingServiceInterface getCampaignExtensionSettingServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignExtensionSettingServiceInterfacePort"), CampaignExtensionSettingServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CampaignExtensionSettingServiceInterface
     */
    @WebEndpoint(name = "CampaignExtensionSettingServiceInterfacePort")
    public CampaignExtensionSettingServiceInterface getCampaignExtensionSettingServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignExtensionSettingServiceInterfacePort"), CampaignExtensionSettingServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMPAIGNEXTENSIONSETTINGSERVICE_EXCEPTION!= null) {
            throw CAMPAIGNEXTENSIONSETTINGSERVICE_EXCEPTION;
        }
        return CAMPAIGNEXTENSIONSETTINGSERVICE_WSDL_LOCATION;
    }

}
