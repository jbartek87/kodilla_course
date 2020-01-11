package com.kodilla.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightDataBase {
    public static List<Flights> getList() {
        final List<Flights> theList = new ArrayList<>();
        theList.add(new Flights("Warsaw", "Paris"));
        theList.add(new Flights("Warsaw", "Rome"));
        theList.add(new Flights("Poznan", "London"));
        theList.add(new Flights("Rome" , "Poznan"));

        return new ArrayList<Flights>(theList);
    }
}
