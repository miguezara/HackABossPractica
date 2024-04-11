package com.example.Ejercicio7Spring.repository;

import com.example.Ejercicio7Spring.model.Vehiculo;


import java.util.List;

public interface IRepositorioVehiculo {
     void agregarVehiculo(Vehiculo vehiculo);
     List<Vehiculo> obtenerTodosLosVehiculos();

     List<Vehiculo> cargarVehiculo();
}
