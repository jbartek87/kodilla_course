package com.kodilla.food2door;

public class Supplier {
    private String name;
    private String adress;

    public Supplier(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }
}
