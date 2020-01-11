package com.kodilla.flights;

public class Application {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightFromCity("Warsaw");
        flightFinder.findFlightDestination("Paris");
    }
}
