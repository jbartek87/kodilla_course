package com.kodilla.food2door;

import com.kodilla.allegro.*;

public class Application {
    public static void main(String[] args) {
            SupplierRequestRetriever supplierRequestRetriever = new SupplierRequestRetriever();
            SupplierRequest supplierRequest = supplierRequestRetriever.retrieve();

            SupplierProcessor supplierProcessor = new SupplierProcessor();
            supplierProcessor.process(productRequest);
        }

}
