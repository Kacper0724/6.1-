package com.kodilla.good.patterns.challenges.flights.searchFlight;

import com.kodilla.good.patterns.challenges.flights.flight.Flight;

import java.util.Set;

public class SearchResult {
    private final Set<Flight> flightResult;

    public SearchResult(Set<Flight> flightResult) {
        this.flightResult = flightResult;
    }

    public void printSearchResult() {
        flightResult.stream()
                .map(f -> f.getFromTheAirport() + " -> " + f.getViaWhichAirport() + " -> " + f.getToTheAirport())
                .forEach(System.out::println);
    }
}
