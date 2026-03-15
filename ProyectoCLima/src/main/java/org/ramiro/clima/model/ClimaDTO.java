package org.ramiro.clima.model;

public class ClimaDTO {

    private String ciudad;
    private double temperatura;
    private double viento;

    public ClimaDTO(double temperatura, double viento, String ciudad) {
        this.temperatura = temperatura;
        this.viento = viento;
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getViento() {
        return viento;
    }
}
