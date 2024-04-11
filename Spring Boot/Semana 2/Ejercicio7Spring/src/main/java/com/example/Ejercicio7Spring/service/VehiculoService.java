package com.example.Ejercicio7Spring.service;

import com.example.Ejercicio7Spring.model.Vehiculo;
import com.example.Ejercicio7Spring.repository.IRepositorioVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculoService implements IVehiculoService {

    @Autowired
    IRepositorioVehiculo repositorioVehiculo;

    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        repositorioVehiculo.agregarVehiculo(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return repositorioVehiculo.obtenerTodosLosVehiculos();
    }

    @Override
    public List<Vehiculo> obtenerVehiculosOrdenadosPorPrecio(double minPrecio, double maxPrecio) {
        List<Vehiculo> vehiculos = repositorioVehiculo.obtenerTodosLosVehiculos();
        List<Vehiculo> filtrarVehiculos = new ArrayList<>();

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPrecio() >= minPrecio && vehiculo.getPrecio() <= maxPrecio) {
                filtrarVehiculos.add(vehiculo);
            }
        }
        return filtrarVehiculos;
    }

    @Override
    public Vehiculo obtenerVehiculoPorId(Long id) {
        List<Vehiculo> vehiculos = repositorioVehiculo.obtenerTodosLosVehiculos();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId().equals(id)) {
                return vehiculo;
            }
        }
        return null;
    }
}
