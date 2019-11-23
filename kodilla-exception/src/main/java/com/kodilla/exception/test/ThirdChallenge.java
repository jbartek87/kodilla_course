package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[] args) {
        Flight parisLondon = new Flight("Warsaw", "London");
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.myFlight.put("Paris", true);
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
