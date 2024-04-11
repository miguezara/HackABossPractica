package com.example.GeneradorDatos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class DatosController {

    private static final List<String> datos = new ArrayList<>();

    static {
        datos.add("Los delfines tienen la capacidad de reconocer y recordar silbidos específicos incluso después de mucho tiempo");
        datos.add("Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso");
        datos.add("La miel nunca se echa a perder");

    }

    @GetMapping("/datos")
    public String obtenerDato() {
        // Seleccionar un dato curioso aleatorio de la lista
        Random random = new Random();
        String datoAleatorio = datos.get(random.nextInt(datos.size()));

        return datoAleatorio;
    }
}
