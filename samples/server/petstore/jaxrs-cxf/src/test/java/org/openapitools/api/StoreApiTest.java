/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import java.util.Map;
import org.openapitools.model.Order;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API tests for StoreApi
 */
public class StoreApiTest {


    private StoreApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("http://petstore.swagger.io:80/v2", StoreApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderTest() {
        String orderId = null;
        //api.deleteOrder(orderId);
        
        // TODO: test validations


    }
    
    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInventoryTest() {
        //Map<String, Integer> response = api.getInventory();
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderByIdTest() {
        Long orderId = null;
        //Order response = api.getOrderById(orderId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Place an order for a pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void placeOrderTest() {
        Order body = null;
        //Order response = api.placeOrder(body);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}