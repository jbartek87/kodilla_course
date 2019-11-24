package com.kodilla.exception.test;

import java.util.HashMap;

public class ThirdChallenge {
    public static void main(String[] args) {
        Flight moscowParis = new Flight("Moscow", "Dubai");
        FlightFinder flightFinder = new FlightFinder(new HashMap<>());

        try{
            System.out.println(flightFinder.findFlight(moscowParis));
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such flight");
        }
    }
}
