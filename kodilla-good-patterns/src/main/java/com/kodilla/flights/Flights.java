package com.kodilla.flights;

public class Flights {
    String takeOfAirport;
    String destinationAirport;

    public Flights(String takeOfAirport, String destinationAirport) {
        this.takeOfAirport = takeOfAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getTakeOfAirport() {
        return takeOfAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }
}
