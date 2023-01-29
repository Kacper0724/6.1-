package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");
        Country country1 = new Country("Poland", new BigDecimal("37750000"));
        Country country2 = new Country("Germany", new BigDecimal("83200000"));
        Country country3 = new Country("United States", new BigDecimal("331900000"));
        Country country4 = new Country("Canada", new BigDecimal("38250000"));
        Country country5 = new Country("China", new BigDecimal("1412000000"));

        europe.addCountry(country1);
        europe.addCountry(country2);

        northAmerica.addCountry(country3);
        northAmerica.addCountry(country4);

        asia.addCountry(country5);

        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        BigDecimal expected = new BigDecimal("1903100000");
        assertEquals(expected, result);
    }
}
