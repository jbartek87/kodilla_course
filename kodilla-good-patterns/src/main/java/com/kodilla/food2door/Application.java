package com.kodilla.food2door;

public class Application {
    public static void main(String[] args) {
        SupplierRequestRetriever supplierRequestRetriever = new SupplierRequestRetriever();
        SuppDto theOrder = supplierRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.order(theOrder);
        productOrderService.supplierService.process(theOrder);

        }
}
