package com.example.GeneradorRefranes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class RefranController {

    // Lista de refranes predefinidos
    private static final List<String> refranes = new ArrayList<>();

    static {
        refranes.add("No hay mal que por bien no venga");
        refranes.add("Al que madruga Dios lo ayuda");
        // Agrega más refranes según sea necesario
    }

    @GetMapping("/refran")
    public String obtenerRefranAleatorio() {
        // Seleccionar un refrán aleatorio
        Random random = new Random();
        String refranAleatorio = refranes.get(random.nextInt(refranes.size()));

        return refranAleatorio;
    }
}

