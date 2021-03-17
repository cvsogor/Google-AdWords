
package com.google.api.ads.adwords.jaxws.v201601.express;

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
@WebServiceClient(name = "BudgetSuggestionService", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601", wsdlLocation = "https://adwords.google.com/api/adwords/express/v201601/BudgetSuggestionService?wsdl")
public class BudgetSuggestionService
    extends Service
{

    private final static URL BUDGETSUGGESTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException BUDGETSUGGESTIONSERVICE_EXCEPTION;
    private final static QName BUDGETSUGGESTIONSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201601", "BudgetSuggestionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/express/v201601/BudgetSuggestionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BUDGETSUGGESTIONSERVICE_WSDL_LOCATION = url;
        BUDGETSUGGESTIONSERVICE_EXCEPTION = e;
    }

    public BudgetSuggestionService() {
        super(__getWsdlLocation(), BUDGETSUGGESTIONSERVICE_QNAME);
    }

    public BudgetSuggestionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns BudgetSuggestionServiceInterface
     */
    @WebEndpoint(name = "BudgetSuggestionServiceInterfacePort")
    public BudgetSuggestionServiceInterface getBudgetSuggestionServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/express/v201601", "BudgetSuggestionServiceInterfacePort"), BudgetSuggestionServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BudgetSuggestionServiceInterface
     */
    @WebEndpoint(name = "BudgetSuggestionServiceInterfacePort")
    public BudgetSuggestionServiceInterface getBudgetSuggestionServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/express/v201601", "BudgetSuggestionServiceInterfacePort"), BudgetSuggestionServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BUDGETSUGGESTIONSERVICE_EXCEPTION!= null) {
            throw BUDGETSUGGESTIONSERVICE_EXCEPTION;
        }
        return BUDGETSUGGESTIONSERVICE_WSDL_LOCATION;
    }

}
