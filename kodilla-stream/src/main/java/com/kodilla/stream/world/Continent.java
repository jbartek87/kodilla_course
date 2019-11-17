package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> countryList = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = countryList.stream()
                .map(Country::getNumberOfPeople)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
