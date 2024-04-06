import java.time.LocalDate;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String categoria;

    public Evento(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nombre + " (" + fecha + ")";
    }
}