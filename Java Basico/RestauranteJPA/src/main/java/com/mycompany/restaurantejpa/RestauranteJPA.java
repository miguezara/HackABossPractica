package com.mycompany.restaurantejpa;

import com.mycompany.restaurantejpa.logica.Controladora;
import com.mycompany.restaurantejpa.logica.Platillo;




public class RestauranteJPA {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        //Crear platos y dar da alta en la base de datos
        
        Platillo plato = new Platillo (1, "Pasta", "Carne, macarrones, tomate", 10.95);
        
        //Crear 2 platos mas
         Platillo plato2 = new Platillo (2, "Mollete de salmon", "Pan, salmon, queso", 7.0);
        Platillo plato3 = new Platillo (3, "Barro de patatas", "Patatas, bacon, queso de fundir", 7.5);
        control.crearPlatillo(plato2);
        control.crearPlatillo(plato3);
        //Eliminar plato
         control.eliminarPlatillo(2);
        
        //Editar datos
        plato3.setPrecio(7.00);
        
        control.editarPlatillo(plato3);
    }
}
