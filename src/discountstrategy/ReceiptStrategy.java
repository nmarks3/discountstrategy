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
public interface ReceiptStrategy {
    
    void addCustomer(String custId);
    Customer getCustomer();
    void setTotalDiscount(double totalDiscount);
    double getTotalDiscount();
    void setTotalSale(double totalSale);
    double getTotalSale();
    void setSubTotal(double subTotal);
    double getSubTotal();
    void setLineItems(LineItem[] lineItems);
    LineItem[] getLineItems();
    void addLineItem(String prodId, int qty);
    void addItemToArray(LineItem lineItem);
    void printReceipt();
    
}
