package com.kodilla.flights;

public class Application {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightDestination("Poznan");
        flightFinder.findFlightFromCity("Warsaw");
        flightFinder.findFlightVia("Warsaw", "Rome", "Poznan");
    }
}
