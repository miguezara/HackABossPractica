public class ClaseGenerica<T> {
    private T objeto;

    // Constructor que recibe un genérico
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    // Método para mostrar la clase a la que pertenece el objeto
    public void mostrarTipoClase() {
        System.out.println("El objeto pertenece a la clase: " + objeto.getClass().getSimpleName());
    }
}
