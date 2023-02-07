package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlight {
    private final Map<String, Boolean> flightMap;

    public FindFlight() {
        this.flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Wroclaw", true);
        flightMap.put("Katowice", false);
        flightMap.put("Kraków", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (flight.getDepartureAirport().equals(flight.getArrivalAirport())) {
            System.out.println("You are on this airport!");
            return;
        }

        List<String> flights = flightMap.entrySet().stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (flights.contains(flight.getDepartureAirport()) && flights.contains(flight.getArrivalAirport())) {
            System.out.println("From: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
