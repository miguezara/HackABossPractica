package com.example.Conversor.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertidorCentimetrosMetros {

    @GetMapping("/pasar/{centimetros}")
    public String pasarAMetros (@PathVariable double centimetros) {
        double metros = centimetros / 100; // Convertir centímetros a metros
        return "El equivalente a " + centimetros + " cm es de " + metros + " metros.";
    }
}
