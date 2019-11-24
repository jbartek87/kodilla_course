package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {
    private Map<String, Boolean> myFlight;

    public FlightFinder(Map<String, Boolean> myFlight) {
        this.myFlight = myFlight;
        myFlight.put("Paris-London", true);
        myFlight.put("Warsaw-London", true);
        myFlight.put("Moscow-Dubai", true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (myFlight.containsKey(flight.getDepartureAirport() + "-" + flight.getArrivalAirport())) {
            System.out.println("Flight from " + flight.getArrivalAirport() + " to "
                    + flight.getDepartureAirport() + " is available");
            return myFlight.get(flight.getDepartureAirport() + "-" + flight.getArrivalAirport());
            } else {
            System.out.println("Flight from " + flight.getArrivalAirport() + " to "
                    + flight.getDepartureAirport() + " is not available !!!");
                throw new RouteNotFoundException("Something went wrong");
            }

        }

}
