package com.kodilla.flights;

public class FlightFinder {

    public void findFlightFromCity(String takeOf){
        FlightDataBase.getList().stream()
                .filter(s->s.getTakeOfAirport().equals(takeOf))
                .map(s->s.getTakeOfAirport() + " to " +  s.getDestinationAirport())
                .forEach(System.out::println);
    }

    public void findFlightDestination(String destination){
        FlightDataBase.getList().stream()
                .filter(s->s.getDestinationAirport().equals(destination))
                .map(s->s.getTakeOfAirport() + " to " +  s.getDestinationAirport())
                .forEach(System.out::println);
    }
}
