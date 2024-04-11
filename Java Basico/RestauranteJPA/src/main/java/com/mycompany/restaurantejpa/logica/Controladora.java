
package com.mycompany.restaurantejpa.logica;
import com.mycompany.restaurantejpa.persistencia.ControladoraPersistencia;
import java.util.List;



public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
      
    public void crearPlatillo(Platillo plato) {

        controlPersis.crearPlatillo(plato);

    }
    
    public void eliminarPlatillo (int id) {
        controlPersis.eliminarPlatillo (id);
    }
    
    public List<Platillo> traerPlatillos () {
        return controlPersis.traerPlatillos();
    }
    
    public void editarPlatillo (Platillo plato) {
        controlPersis.editarPlatillo(plato);
    }
    
}