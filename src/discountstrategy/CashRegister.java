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
public class CashRegister {

    private Receipt receipt;

    public void startSale(String custId) {
        receipt = new Receipt(custId);
    }

    public void addProduct(String prodId, int qty) {
        receipt.addItem(prodId, qty);
    }

    public void endSale() {
        receipt.printReceipt();

    }

}
