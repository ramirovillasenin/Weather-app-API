package org.ramiro.clima.model;

public class CurrentWeather {
    private double temperature;
    private double Windspeed;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWindspeed() {
        return Windspeed;
    }

    public void setWindspeed(double windseed) {
        this.Windspeed = windseed;
    }
}
