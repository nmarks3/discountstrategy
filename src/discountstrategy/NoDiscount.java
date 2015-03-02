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
public class NoDiscount implements DiscountStrategy {

    @Override
    public double getDiscountAmt(double price, int qty) {
        return 0;
    }

    @Override
    public double getDiscountPrice(double price, int qty) {
        return price;
    }

    @Override
    public double getDiscountRate() {
        return 0;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        // does nothing
    }

}
