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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister sale = new CashRegister();
       
        sale.startSale("100", new FakeDatabase());
        sale.addProduct("A101", 5);
        sale.addProduct("B205", 7);
        sale.endSale();
        
        
        
       
        
    }
    
    
    
    
}
