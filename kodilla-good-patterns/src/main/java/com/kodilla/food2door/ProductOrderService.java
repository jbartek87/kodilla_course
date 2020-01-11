package com.kodilla.food2door;


public class ProductOrderService {
    SupplierService supplierService;

    public boolean order(final SuppDto suppDto){
        supplierService = SupplierFactory.getSupplier(suppDto.getCompanyName());
        return true;
    }
}
