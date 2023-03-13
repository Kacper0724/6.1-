package com.kodilla.good.patterns.challenges.flights.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private final List<FlightForm> flightList = new ArrayList<>();

    public FlightRepository() {
        flightList.add(new FlightForm("Katowice", "Wrocław", "Warszawa"));
        flightList.add(new FlightForm("Warszawa", "Gdańsk", "Poznań"));
        flightList.add(new FlightForm("Kraków", "Warszawa", "Szczecin"));
        flightList.add(new FlightForm("Gdańsk", "Poznań", "Wrocław"));
        flightList.add(new FlightForm("Poznań", "Wrocław", "Katowice"));
        flightList.add(new FlightForm("Szczecin", "Warszawa", "Kraków"));
        flightList.add(new FlightForm("Katowice", "Warszawa", "Gdańsk"));
        flightList.add(new FlightForm("Katowice", "Poznań", "Warszawa"));
    }

    public List<FlightForm> getFlightList() {
        return new ArrayList<>(flightList);
    }
}
