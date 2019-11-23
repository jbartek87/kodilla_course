package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> myFlight = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {
     for(Map.Entry<String, Boolean> entry : myFlight.entrySet()){
        if(myFlight.containsKey(flight.getDepartureAirport())) {
            System.out.println("All is OK !");
        } else {
            throw new RouteNotFoundException("Something went wrong");
        }

     }

    }
}
