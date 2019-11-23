package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> myFlight = new HashMap<>();

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        for (Map.Entry<String, Boolean> entry : myFlight.entrySet()) {
            if (myFlight.containsKey(flight.getDepartureAirport())) {
                System.out.println("This flight is OK");
                return entry.getValue();
            } else {
                throw new RouteNotFoundException("Something went wrong");
            }

        } return false;
    }
}