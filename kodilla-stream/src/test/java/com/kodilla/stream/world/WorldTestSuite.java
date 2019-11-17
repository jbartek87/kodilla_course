package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europa = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        World world = new World();
        europa.addCountry(new Country("Poland", new BigDecimal("40000000")));
        europa.addCountry(new Country("Germany", new BigDecimal("70000000")));
        europa.addCountry(new Country("France", new BigDecimal("80000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("1000000")));
        asia.addCountry(new Country("China", new BigDecimal("50000000")));
        asia.addCountry(new Country("South Korea", new BigDecimal("60000000")));
        africa.addCountry(new Country("RPA", new BigDecimal("20000000")));
        africa.addCountry(new Country("Kongo", new BigDecimal("30000000")));
        africa.addCountry(new Country("Egypt", new BigDecimal("40000000")));

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal totalOfWorld = world.getPeopleQuantity();
        BigDecimal myScore = new BigDecimal("391000000");
        //Then
        Assert.assertEquals(totalOfWorld, myScore);

    }

}

