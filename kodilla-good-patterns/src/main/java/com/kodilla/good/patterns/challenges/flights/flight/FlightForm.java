package com.kodilla.good.patterns.challenges.flights.flight;

public class FlightForm implements Flight {
    private final String fromTheAirport;
    private final String viaWhichAirport;
    private final String toTheAirport;

    public FlightForm(String fromTheAirport, String viaWhichAirport, String toTheAirport) {
        this.fromTheAirport = fromTheAirport;
        this.viaWhichAirport = viaWhichAirport;
        this.toTheAirport = toTheAirport;
    }
    public String getFromTheAirport() {
        return fromTheAirport;
    }

    public String getViaWhichAirport() {
        return viaWhichAirport;
    }

    public String getToTheAirport() {
        return toTheAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightForm that = (FlightForm) o;

        if (!fromTheAirport.equals(that.fromTheAirport)) return false;
        if (!viaWhichAirport.equals(that.viaWhichAirport)) return false;
        return toTheAirport.equals(that.toTheAirport);
    }

    @Override
    public int hashCode() {
        int result = fromTheAirport.hashCode();
        result = 31 * result + viaWhichAirport.hashCode();
        result = 31 * result + toTheAirport.hashCode();
        return result;
    }
}
