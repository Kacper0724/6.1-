package com.kodilla.good.patterns.challenges.flights.searchFlight;

import com.kodilla.good.patterns.challenges.flights.flight.Flight;
import com.kodilla.good.patterns.challenges.flights.flight.FlightRepository;

import java.util.Set;
import java.util.stream.Collectors;

public class Search {
    private final FlightRepository flightRepository;

    public Search(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Set<Flight> searchFromTheAirport(String formTheAirport) {
        return flightRepository.getFlightList().stream()
                .filter(f -> f.getFromTheAirport().equals(formTheAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchViaWhichAirport(String fromTheAirport, String viaWhichAirport, String toTheAirport) {
        return flightRepository.getFlightList().stream()
                .filter(f -> (f.getFromTheAirport().equals(fromTheAirport) && f.getViaWhichAirport().equals(viaWhichAirport) && f.getToTheAirport().equals(toTheAirport)))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchToTheAirport(String toTheAirport) {
        return flightRepository.getFlightList().stream()
                .filter(f -> f.getToTheAirport().equals(toTheAirport))
                .collect(Collectors.toSet());
    }
}
