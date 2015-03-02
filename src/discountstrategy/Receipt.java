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
    
    
    public void printReceipt() {
        System.out.println(customer.getName());
        System.out.println(getTotalDiscount)
    }
    
    public Receipt(String custId, ReceiptDataAccessStrategy db) {
        this.customer = db.findCustomer(custId);
    }
   
   
    public double getTotalDiscount() {
        double total = 0;
        for(LineItem item : lineItems) {
            total += item.getDiscount();
        }
        return total;
    }
    
    public void addItem(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty);
        addItemToArray(item);
    }
    
    public void addItemToArray(LineItem item) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[lineItems.length] = item;
        lineItems = temp;
    }
    
    private double getTotalPreDiscount() {
        double total = 0;
        for (LineItem items : lineItems) {
            total = total + items.getItemTotal();
        }
        return total;
    }
    
    private double getTotalPostDiscount(){
        double total = 0;
        for(LineItem items: lineItems) {
            total = total + items.getDiscount();
        }
        return total;
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

//public class Receipt implements ReceiptStrategy {
//    
//    private LineItem[] lineItems;
//    private double subTotal;
//    private double totalSale;
//    private double totalDiscount;
//    private Customer customer;
//    //private date date = new Date();
//    private ReceiptDataAccessStrategy data;
//    
//    public Receipt(ReceiptDataAccessStrategy data) {
//        this.data = data;
//    }
//   
//
//    @Override
//    public void addCustomer(String custId) {
//        this.customer = (Customer) findCustomer(custId);
//    }
//    
//    private ICustomer findCustomer(String custId) {
//        return data.findCustomer(custId);
//    }
//    
//    private Product findProduct(String prodId) {
//        return data.findProduct(prodId);
//    }
//
//    @Override
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    @Override
//    public void setTotalDiscount(double totalDiscount) {
//        this.totalDiscount = totalDiscount;
//    }
//
//    @Override
//    public double getTotalDiscount() {
//        return totalDiscount;
//    }
//
//    @Override
//    public void setTotalSale(double totalSale) {
//        this.totalSale = totalSale;
//    }
//
//    @Override
//    public double getTotalSale() {
//         return totalSale;
//    }
//
//    @Override
//    public void setSubTotal(double subTotal) {
//        this.subTotal = subTotal;
//    }
//
//    @Override
//    public double getSubTotal() {
//         return subTotal;
//    }
//
//    @Override
//    public void setLineItems(LineItem[] lineItems) {
//       this.lineItems = lineItems;
//    }
//
//    @Override
//    public LineItem[] getLineItems() {
//        return lineItems;
//    }
//
//    @Override
//    public void addLineItem(String prodId, int qty) {
//        LineItem item = new LineItem(findProduct(prodId), qty);
//        addItemToArray(item);
//    }
//
//    @Override
//    public void addItemToArray(LineItem lineItem) {
//        LineItem[] tempItems = new LineItem[lineItems.length + 1];
//        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
//        tempItems[lineItems.length] = lineItem;
//        lineItems = tempItems;
//    }
//
//    @Override
//    public void printReceipt() {
//        System.out.println(customer.getName() + " " + customer.getCustId());
//        for (LineItem lineItem : lineItems) {
//            subTotal += lineItem.getItemTotal();
//            System.out.format(lineItem.getProdId() + "\t       " + lineItem.getProdName()
//                    + "\t     " + lineItem.getQty() + "\t     " + lineItem.getProdPrice()
//                    + "\t     " + lineItem.getDiscount() + "\t\t" + subTotal);
//            totalDiscount += lineItem.getDiscount();
//            System.out.println("");
//        }
//        totalSale = subTotal;
//        
//        System.out.println("total discount" + totalDiscount);
//        System.out.println("grand total" + totalSale);
//    }
//    
//}
