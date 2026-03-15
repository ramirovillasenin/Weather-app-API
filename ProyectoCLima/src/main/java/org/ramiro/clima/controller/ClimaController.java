package org.ramiro.clima.controller;

import org.ramiro.clima.model.ClimaDTO;
import org.ramiro.clima.service.ClimaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClimaController {

    private  final ClimaService climaService;

    public ClimaController(ClimaService climaService){
        this.climaService = climaService;
    }

    @GetMapping("/clima")
    public ClimaDTO obtenerClimaPorCiudad(
            @RequestParam String ciudad) {

        return climaService.obtenerClimaPorCiudad(ciudad);
    }

}
