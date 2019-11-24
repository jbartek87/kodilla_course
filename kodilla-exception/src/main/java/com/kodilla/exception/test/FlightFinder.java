package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {
    private Map<String, Boolean> myFlight;

    public FlightFinder(Map<String, Boolean> myFlight) {
        this.myFlight = myFlight;
        myFlight.put("Paris-London", true);
        myFlight.put("Warsaw-London", true);
        myFlight.put("Moscow-Dubai", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (myFlight.containsKey(flight.getDepartureAirport() + "-" + flight.getArrivalAirport())) {
            return myFlight.get(flight.getDepartureAirport() + "-" + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Something went wrong");
        }
    }
}


