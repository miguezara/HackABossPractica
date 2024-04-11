package com.example.Ejercicio7Spring.service;

import com.example.Ejercicio7Spring.model.Vehiculo;

import java.util.List;

public interface IVehiculoService {
    public void agregarVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerTodosLosVehiculos();

    public List<Vehiculo> obtenerVehiculosOrdenadosPorPrecio(double minPrecio, double maxPrecio);

    public Vehiculo obtenerVehiculoPorId(Long id);


}




