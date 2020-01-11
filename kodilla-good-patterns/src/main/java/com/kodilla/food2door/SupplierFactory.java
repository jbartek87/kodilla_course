package com.kodilla.food2door;

public class SupplierFactory {
    public static SupplierService getSupplier(String supplierName) {
        switch (supplierName.toUpperCase()) {
            case "EXTRAFOODSHOP":
                return new ExtraFoodShop();
            case "GLUTENFREESHOP":
                return new GlutenFreeShop();
            case "HEALTHYSHOP":
                return new HealthyShop();
            default:
                return null;
        }
    }
}
