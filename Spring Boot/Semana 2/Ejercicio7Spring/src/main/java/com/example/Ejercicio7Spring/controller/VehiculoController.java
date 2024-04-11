package com.example.Ejercicio7Spring.controller;

import com.example.Ejercicio7Spring.model.Vehiculo;
import com.example.Ejercicio7Spring.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    IVehiculoService vehiculoService;

    @PostMapping("")
    public void agregarVehiculo(@RequestBody Vehiculo vehiculo) {
        vehiculoService.agregarVehiculo(vehiculo);
    }

    @GetMapping("/")
    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return vehiculoService.obtenerTodosLosVehiculos();
    }

    @GetMapping("/precios")
    public List<Vehiculo> obtenerVehiculosOrdenadosPorPrecio(@RequestParam("minPrice") double minPrice,
                                                             @RequestParam("maxPrice") double maxPrice) {
        return vehiculoService.obtenerVehiculosOrdenadosPorPrecio(minPrice, maxPrice);
    }

    @GetMapping("/{id}")
    public Vehiculo obtenerVehiculoPorId(@PathVariable Long id) {
        return vehiculoService.obtenerVehiculoPorId(id);
    }
}
