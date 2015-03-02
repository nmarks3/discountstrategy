package discountstrategy;

public class FakeDatabase implements ReceiptDataAccessStrategy {

    private Customer[] customers = {
        new Customer("100", "Bill Clinton"),
        new Customer("200", "Madonna"),
        new Customer("300", "Batman")
    };

    private Product[] products = {
        new Product("A101", "Last week's newspaper", 19.95, new PercentDiscount(0.15)),
        new Product("B205", "iPhone 9", 35.50, new QtyDiscount(.10, 5)),
        new Product("C222", "Whopper", 9.50, new NoDiscount())
    };

    @Override
    public final Customer findCustomer(String custId) {
        if (custId == null || custId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findCustomer method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }

        Customer customer = null;
        for (Customer c : customers) {
            if (custId.equals(c.getCustId())) {
                customer = c;
                break;
            }
        }

        return customer;
    }

    @Override
    public Product findProduct(String prodId) {
        if (prodId == null || prodId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }

        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getProdId())) {
                product = p;
                break;
            }
        }

        return product;
    }

}
