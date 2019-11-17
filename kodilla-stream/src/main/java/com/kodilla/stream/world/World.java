package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentList = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = continentList.stream()
                .flatMap(c -> c.getCountryList().stream())
                .map(Country::getNumberOfPeople)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
    }

    public void addContinent(Continent continent){
        continentList.add(continent);
    }

    public List<Continent> getContinentList() {
        return continentList;
    }
}
