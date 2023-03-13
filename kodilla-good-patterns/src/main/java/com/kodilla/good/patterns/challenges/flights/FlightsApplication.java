package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.flight.FlightRepository;
import com.kodilla.good.patterns.challenges.flights.searchFlight.Search;
import com.kodilla.good.patterns.challenges.flights.searchFlight.SearchResult;

public class FlightsApplication {
    public static void main(String[] args) {
        FlightRepository flightRepository = new FlightRepository();
        Search search = new Search(flightRepository);

        SearchResult searchResult = new SearchResult(search.searchFromTheAirport("Katowice"));
        SearchResult searchResult1 = new SearchResult(search.searchViaWhichAirport("Warszawa", "Gdańsk", "Poznań"));
        SearchResult searchResult2 = new SearchResult(search.searchToTheAirport("Warszawa"));

        searchResult.printSearchResult();
        System.out.println();
        searchResult1.printSearchResult();
        System.out.println();
        searchResult2.printSearchResult();
    }
}
