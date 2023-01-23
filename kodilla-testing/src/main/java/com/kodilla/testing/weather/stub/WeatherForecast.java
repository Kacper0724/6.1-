package com.kodilla.testing.weather.stub;

import java.util.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
            temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double average = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();
        }
        return average / temperatures.getTemperatures().entrySet().size();
    }

    public double medianaTemperature() {
        double mediana = 0;
        double average = 0;
        List<Double> medianaList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            medianaList.add(temperature.getValue());
        }
        Collections.sort(medianaList);
        if (medianaList.size() % 2 == 0){
            average = medianaList.get(medianaList.size() / 2) + medianaList.get((medianaList.size() / 2) - 1);
            mediana = average / 2.0;
        } else {
            mediana = medianaList.get(medianaList.size() / 2);
        }
        return mediana;
    }
}
