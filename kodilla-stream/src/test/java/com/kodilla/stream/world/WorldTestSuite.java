package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europa = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        World world = new World();
        europa.getCountryList().add(new Country("Poland", new BigDecimal("40000000")));
        europa.getCountryList().add(new Country("Germany", new BigDecimal("70000000")));
        europa.getCountryList().add(new Country("France", new BigDecimal("80000000")));
        asia.getCountryList().add(new Country("Japan", new BigDecimal("1000000")));
        asia.getCountryList().add(new Country("China", new BigDecimal("50000000")));
        asia.getCountryList().add(new Country("South Korea", new BigDecimal("60000000")));
        africa.getCountryList().add(new Country("RPA", new BigDecimal("20000000")));
        asia.getCountryList().add(new Country("Kongo", new BigDecimal("30000000")));
        asia.getCountryList().add(new Country("Egypt", new BigDecimal("40000000")));

        world.getContinentList().add(europa);
        world.getContinentList().add(asia);
        world.getContinentList().add(africa);

        //When
        BigDecimal totalOfWorld = world.getPeopleQuaintity();
        BigDecimal myScore = new BigDecimal("391000000");
        //Then
        Assert.assertEquals(totalOfWorld, myScore);

    }

}

