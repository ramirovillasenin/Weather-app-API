package org.ramiro.clima.service;

import org.ramiro.clima.model.ClimaDTO;
import org.ramiro.clima.model.GeocodingResponse;
import org.ramiro.clima.model.OpenMeteoResponse;
import org.ramiro.clima.model.ResultadoCiudad;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimaService {

    public ClimaDTO obtenerClimaPorCiudad(String ciudad) {

        RestTemplate restTemplate = new RestTemplate();

        // 1. Buscar coordenadas de la ciudad
        String urlGeo =
                "https://geocoding-api.open-meteo.com/v1/search?name=" + ciudad;

        GeocodingResponse geoResponse =
                restTemplate.getForObject(urlGeo, GeocodingResponse.class);

        if (geoResponse == null || geoResponse.getResults().isEmpty()) {
            throw new RuntimeException("Ciudad no encontrada");
        }

        ResultadoCiudad resultado = geoResponse.getResults().get(0);

        double lat = resultado.getLatitude();
        double lon = resultado.getLongitude();

        // 2. Usar esas coordenadas para obtener clima
        String urlClima = "https://api.open-meteo.com/v1/forecast?latitude="
                + lat + "&longitude=" + lon + "&current_weather=true";

        OpenMeteoResponse climaResponse =
                restTemplate.getForObject(urlClima, OpenMeteoResponse.class);

        double temp = climaResponse.getCurrentWeather().getTemperature();
        double viento = climaResponse.getCurrentWeather().getWindspeed();

        return new ClimaDTO(temp, viento, resultado.getName());
    }
}
