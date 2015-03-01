
package discountstrategy;


public class Product {  
    private String prodId;
    private String name;
    private double price;

    public Product() {     
    }
    
    public Product(String prodId, String name, double price) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
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
    
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("OMG");
        product.setProdId("WTF");
        product.setPrice(666);
        
        System.out.println(product.getProdId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());

    }
}