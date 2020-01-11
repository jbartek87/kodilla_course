package com.kodilla.food2door;

public class GlutenFreeShop implements SupplierService{
    private String name = "Gluten Free Shop";
    private String city = "Krakow";

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public SuppDto process(SuppDto suppDto) {
        System.out.println(getName() + " from " + getCity() +" is the order ");
        return suppDto;
    }
}
