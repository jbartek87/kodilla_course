package com.kodilla.food2door;

public class SuppDto {
    String companyName;
    String productName;
    int productQuantity;

    public SuppDto( String companyName, String productName, int productQuantity) {
        this.companyName = companyName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
