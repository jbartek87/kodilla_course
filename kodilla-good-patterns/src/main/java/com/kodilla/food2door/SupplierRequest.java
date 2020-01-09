package com.kodilla.food2door;

public class SupplierRequest {

    private Supplier supplier;
    private Product product;

    public SupplierRequest(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
