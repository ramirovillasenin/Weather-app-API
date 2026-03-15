package org.ramiro.clima.model;

public class ClimaResponse {

    private double temperatura;
    private double viento;

    public ClimaResponse(double temperatura, double viento) {
        this.temperatura = temperatura;
        this.viento = viento;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getViento() {
        return viento;
    }
}
