package com.kodilla.food2door;

public class HealthyShop implements SupplierService{
    private String name = "Healthy Shop";
    private String city = "Poznan";

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public SuppDto process(SuppDto suppDto) {
        System.out.println("Company " + getName() + ", address:  " + getCity() + " is processing order");
        return suppDto;
    }
}
