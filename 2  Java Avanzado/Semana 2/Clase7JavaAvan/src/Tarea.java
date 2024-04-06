import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }


    public void mostrarEstructura(int nivel) {
        // Generar prefijo de espacios
        StringBuilder prefijo = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            prefijo.append("|   ");
        }

        // Mostrar la tarea actual
        System.out.println(prefijo + "|-- " + nombre);

        // Mostrar las subtareas
        for (Tarea subtarea : subtareas) {
            subtarea.mostrarEstructura(nivel + 1);
        }
    }
}
