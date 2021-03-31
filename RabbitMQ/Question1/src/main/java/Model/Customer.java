package com.assignment1.CustomerProd.Model;

import java.io.Serializable;

public class Customer implements Serializable {

    private String custFirstName;
    private String custLastName;

    public Customer() {
    }

    public Customer(String custFirstName, String custLastName) {
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }
}
