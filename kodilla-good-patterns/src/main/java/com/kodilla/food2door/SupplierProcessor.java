package com.kodilla.food2door;

import com.kodilla.allegro.*;

public class SupplierProcessor {

    private InfoService infoService;
    private SuppService supprService;
    private SuppRepository suppRepository;

    public SupplierProcessor(final InfoService infoService,final SuppService supprService,
                             final SuppRepository suppRepository) {
        this.infoService = infoService;
        this.supprService = supprService;
        this.suppRepository = suppRepository;
    }

    public SupplierDto process(final SupplierRequest supplierRequest) {
        boolean isOrdered = OrderService.order(orderRequest.getUser(), orderRequest.getThings());
        if(isOrdered){
            informationService.inform(supplierRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getThings());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
