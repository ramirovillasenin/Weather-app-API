package org.ramiro.clima.model;

import java.util.List;

public class GeocodingResponse {

    private List<ResultadoCiudad> results;

    public List<ResultadoCiudad> getResults() {
        return results;
    }

    public void setResults(List<ResultadoCiudad> results) {
        this.results = results;
    }
}