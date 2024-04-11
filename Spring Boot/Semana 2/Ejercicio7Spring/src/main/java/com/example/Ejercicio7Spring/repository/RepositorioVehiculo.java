package com.example.Ejercicio7Spring.repository;

import com.example.Ejercicio7Spring.model.Vehiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RepositorioVehiculo  implements IRepositorioVehiculo{

    List<Vehiculo> vehiculos = new ArrayList<Vehiculo>(cargarVehiculo());


    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);

    }

    @Override
    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return vehiculos;
    }

    @Override
    public List<Vehiculo> cargarVehiculo(){
        return List.of(new Vehiculo(1L,"Peugeot","206",15000.00,4,8000));


    }
}
