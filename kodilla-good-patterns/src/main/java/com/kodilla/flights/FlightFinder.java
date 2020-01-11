package com.kodilla.flights;

public class FlightFinder{


    public void findFlightFromCity(String takeOf){
        FlightDataBase.getList().stream()
                .filter(s->s.getTakeOfAirport().equals(takeOf))
                .map(s->"Flight was found from "+ s.getTakeOfAirport() + " to " +  s.getDestinationAirport())
                .forEach(System.out::println);
    }

    public void findFlightDestination(String destination) {
            FlightDataBase.getList().stream()
                    .filter(s -> s.getDestinationAirport().equals(destination))
                    .map(s -> "Flight was found from " + s.getTakeOfAirport() + " to " + s.getDestinationAirport())
                    .forEach(System.out::println);
    }

    public void findFlightVia(String takeOf, String via, String destination) {
        FlightDataBase.getList().stream()
                .filter(s -> s.getTakeOfAirport().equals(takeOf))
                .filter(s -> s.getDestinationAirport().equals(via))
                .map(s ->"Flight was found from " + s.getTakeOfAirport() + " to " + s.getDestinationAirport())
                .forEach(System.out::println);

        FlightDataBase.getList().stream()
                .filter(s -> s.getTakeOfAirport().equals(via))
                .filter(s -> s.getDestinationAirport().equals(destination))
                .map(s ->"Flight was found from " + s.getTakeOfAirport() + " to " + s.getDestinationAirport())
                .forEach(System.out::println);
    }
}
