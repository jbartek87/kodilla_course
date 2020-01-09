package com.kodilla.food2door;

public class SupplierRequestRetriever {

    public SupplierRequest retrieve(){

        Supplier supplier = new Supplier("McDonald", "Warsaw");
        Product product = new Product("BigMac", 3);
        return new SupplierRequest(supplier,product);
    }
}
