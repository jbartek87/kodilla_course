package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> myFlight ;

    public FlightFinder(Map<String, Boolean> myFlight) {
        this.myFlight = myFlight;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (myFlight.containsKey(flight.getDepartureAirport())) {
                System.out.println("This flight is OK");
            return myFlight.get(flight.getDepartureAirport());
            } else {
                throw new RouteNotFoundException("Something went wrong");
            }

        }

}
