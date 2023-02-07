package com.kodilla.exception.test;

public class RouteNotFoundRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Wroclaw");
        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Such an airport does not exist!");
            System.out.println(e);
        }
    }
}
