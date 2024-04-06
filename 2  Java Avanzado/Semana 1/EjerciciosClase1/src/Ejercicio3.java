public class Ejercicio3 {
    public static void main(String[] args) {
        final int TAMANO_VECTOR = 5;
        VectorGestion vectorGestion = new VectorGestion(TAMANO_VECTOR);

        // Almacenar datos en el vector
        vectorGestion.almacenarDatosEnVector();

        // Acceder a los datos almacenados en el vector
        vectorGestion.accederDatosEnVector();
    }
}
