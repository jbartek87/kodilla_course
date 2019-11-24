package com.kodilla.exception.test;

import java.util.HashMap;

public class ThirdChallenge {
    public static void main(String[] args) {
        Flight moscowParis = new Flight("Moscow", "Paris");
        FlightFinder flightFinder = new FlightFinder(new HashMap<>());

        try{
            flightFinder.findFlight(moscowParis);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such flight");
        }
    }
}
