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
public class Receipt implements ReceiptStrategy {
    
    private LineItem[] lineItems;
    private double subTotal;
    private double totalSale;
    private double totalDiscount;
    private Customer customer;
    private date date = new Date();
    private ReceiptDataAccessStrategy data;
    
    public Receipt(ReceiptDataAccessStrategy data) {
        this.data = data;
    }
   

    @Override
    public void addCustomer(String custId) {
        this.customer = (Customer) findCustomer(custId);
    }
    
    private ICustomer findCustomer(String custId) {
        return data.findCustomer(custId);
    }
    
    private Product findProduct(String prodId) {
        return data.findProduct(prodId);
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @Override
    public double getTotalDiscount() {
        return totalDiscount;
    }

    @Override
    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    @Override
    public double getTotalSale() {
         return totalSale;
    }

    @Override
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public double getSubTotal() {
         return subTotal;
    }

    @Override
    public void setLineItems(LineItem[] lineItems) {
       this.lineItems = lineItems;
    }

    @Override
    public LineItem[] getLineItems() {
        return lineItems;
    }

    @Override
    public void addLineItem(String prodId, int qty) {
        LineItem item = new LineItem(findProduct(prodId), qty);
        addItemToArray(item);
    }

    @Override
    public void addItemToArray(LineItem lineItem) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = lineItem;
        lineItems = tempItems;
    }

    @Override
    public void printReceipt() {
        System.out.println(customer.getName() + " " + customer.getCustId());
        for (LineItem lineItem : lineItems) {
            subTotal += lineItem.getItemTotal();
            System.out.format(lineItem.getProdId() + "\t       " + lineItem.getProdName()
                    + "\t     " + lineItem.getQty() + "\t     " + lineItem.getProdPrice()
                    + "\t     " + lineItem.getDiscount() + "\t\t" + subTotal);
            totalDiscount += lineItem.getDiscount();
            System.out.println("");
        }
        totalSale = subTotal;
        
        System.out.println("total discount" + totalDiscount);
        System.out.println("grand total" + totalSale);
    }
    
}
