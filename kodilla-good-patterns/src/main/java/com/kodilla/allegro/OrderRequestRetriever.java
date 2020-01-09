package com.kodilla.allegro;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User ("Jan", "Kowalski");
        ThingsToBuy thingsToBuy = new ThingsToBuy("Samsung TV", 10);

        return new OrderRequest(user, thingsToBuy);
    }
}
