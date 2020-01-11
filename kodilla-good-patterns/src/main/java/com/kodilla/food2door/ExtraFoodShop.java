package com.kodilla.food2door;

public class ExtraFoodShop implements SupplierService {
    private String name = "Extra Food Shop";
    private String city = "Warsaw";

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public SuppDto process(SuppDto suppDto) {
        System.out.println("Order made in " + getName() + " located in " + getCity() +" is being verified");
        return suppDto;
    }
}
