package com.kodilla.exception.test;

import java.util.HashMap;

public class ThirdChallenge {
    public static void main(String[] args) {
        Flight parisLondon = new Flight("Paris", "London");
        FlightFinder flightFinder = new FlightFinder(new HashMap<>());
        flightFinder.myFlight.put("Warsaw", true);
        flightFinder.myFlight.put("Berlin", true);
        flightFinder.myFlight.put("New York", true);
        flightFinder.myFlight.put("Chicago", true);

        try{
            flightFinder.findFlight(parisLondon);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such flight");
        }
    }
}
