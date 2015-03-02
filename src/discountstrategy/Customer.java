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
public class Customer implements ICustomer {
    private String name;
    private String custId;

    public Customer (String custId, String name) {
        this.name = name;
        this.custId = custId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCustId() {
        return custId;
    }

    @Override
    public void setCustId(String custId) {
        this.custId = custId;
    }

   
    
    
    
}
