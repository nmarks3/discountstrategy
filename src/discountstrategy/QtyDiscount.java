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
public class QtyDiscount implements DiscountStrategy {
    private double discountRate = 0.15;
    private int qty;
    private int minQty;
    
    public QtyDiscount (int minQty) {
        this.minQty = minQty;
    }
    
    @Override
    public double getDiscountPrice(double price, int qty) {
        return price * qty - getDiscountAmt(price, qty);
    }
        
    
    @Override
    public double getDiscountAmt(double price, int qty) {
        
        if (qty >= getMinQty()) {
            return price * discountRate * qty;
        } else {
            return 0;
        }
    }
    
    @Override
    public double getDiscountRate() {
        return discountRate;
    }
    
    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public int getQty() {
        return qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public int getMinQty() {
        return minQty;
    }
    
    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

    

    
    
}
