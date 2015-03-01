/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author sawyer
 */
public interface ReceiptDataAccessStrategy {

    /**
     * Tries to find a Customer by customer id.
     * @param custId - must not be null or empty
     * @return found Customer or null if not found or bad argument
     */
    ICustomer findCustomer(String custId);

    /**
     * Tries to find a Proudct by product id.
     * @param prodId - must not be null or empty
     * @return found Product or null if not found or bad argument
     */
    Product findProduct(String prodId);
    
}
