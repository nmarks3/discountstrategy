
package discountstrategy;


public class Product {  
    private String prodId;
    private String name;
    private double price;
    private DiscountStrategy discountStrategy;
    
    
    public Product(String prodId, String name, double price, DiscountStrategy discountStrategy) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
    }
    
    public double getDiscountPrice(int qty) {
        return discountStrategy.getDiscountPrice(price, qty);
    }
    
    public double getDiscountAmt(int qty) {
        return discountStrategy.getDiscountAmt(price, qty);
    }
    
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        if(prodId == null || prodId.isEmpty()){
            // warning message needed
        } 
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            this.name = "Not Provided";
        } else {
        this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0) {
            this.price = 0;
        } else {
        this.price = price;
        }
    }
    
    
}
