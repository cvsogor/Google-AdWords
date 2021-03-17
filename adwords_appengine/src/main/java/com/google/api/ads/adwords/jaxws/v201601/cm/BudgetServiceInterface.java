
package com.google.api.ads.adwords.jaxws.v201601.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Budget Service to get/mutate budgets.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BudgetServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BudgetServiceInterface {


    /**
     * 
     *         Returns a list of budgets that match the selector.
     *         
     *         @return List of budgets specified by the selector.
     *         @throws com.google.ads.api.services.common.error.ApiException if problems
     *         occurred while retrieving results.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.BudgetPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.BudgetServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.BudgetServiceInterfacegetResponse")
    public BudgetPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations.
     *         
     *         @param operations The operations to apply.
     *         @return The modified list of Budgets, returned in the same order as <code>operations</code>.
     *         @throws ApiException
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.BudgetReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.BudgetServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.BudgetServiceInterfacemutateResponse")
    public BudgetReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        List<BudgetOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of budgets that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @returns A list of Budget
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.BudgetPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.BudgetServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.BudgetServiceInterfacequeryResponse")
    public BudgetPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        String query)
        throws ApiException_Exception
    ;

}
