package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentList = new ArrayList<>();

    public BigDecimal getPeopleQuaintity() {
        BigDecimal totalPeople = continentList.stream()
                .map(Continent::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }
}
