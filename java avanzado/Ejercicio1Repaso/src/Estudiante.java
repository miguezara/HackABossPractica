import java.util.List;

class Estudiante {
    private String nombre;
    private List<Double> calificaciones;
    private int edad;

    public Estudiante(String nombre, List<Double> calificaciones, int edad) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", calificaciones=" + calificaciones +
                ", edad=" + edad +
                '}';
    }
}
