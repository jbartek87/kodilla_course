package com.kodilla.food2door;


public class ProductOrderService {
    SupplierService supplierService;

    public boolean order(final SuppDto suppDto){
        supplierService = SupplierFactory.getSupplier(suppDto.getCompanyName());
        System.out.println("Order from " + suppDto.getCompanyName() + " contains " + suppDto.getProductName() +
                " in quantity - " + suppDto.getProductQuantity());
        return true;
    }
}
