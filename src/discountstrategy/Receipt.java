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

public class Receipt {
    
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    private ReceiptOutputStrategy receiptOutput; 
    private ReceiptDataAccessStrategy db;
    
    public Receipt(String custId, ReceiptDataAccessStrategy db) {
        this.customer = db.findCustomer(custId);
    }
    
    public void printReceipt() {
        System.out.println(customer.getName());
        for (LineItem lineItem : lineItems ) {
            System.out.println(lineItem.getProdPrice());
            
        }
    }
   
   
    public double getTotalDiscount() {
        double total = 0;
        for(LineItem item : lineItems) {
            total += item.getDiscount();
        }
        return total;
    }
    
    public void addItem(String prodId, int qty){
        LineItem item = new LineItem(findProduct(prodId), qty);
        addItemToArray(item);
    }
    
    private Product findProduct(String prodId){
        return db.findProduct(prodId);
        
    }
    
    public void addItemToArray(LineItem item) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[lineItems.length] = item;
        lineItems = temp;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public LineItem[] getLineItems() {
        return lineItems;
    }
    
    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
    
    public ReceiptOutputStrategy getReceiptOutput() {
        return receiptOutput;
    }
    
    public void setReceiptOutput(ReceiptOutputStrategy receiptOutput) {
        this.receiptOutput = receiptOutput;
    }


}
