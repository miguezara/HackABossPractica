public class Estudiante {
    private int id;
    private String nombre;
    private Double nota;

    public Estudiante(int id, String nombre, Double nota) {
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getNota() {
        return nota;
    }
}
