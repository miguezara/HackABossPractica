public class Ejercicio4 {

    public static void main(String[] args) {
        // Crear distintas instancias de la clase con diferentes tipos
        ClaseGenerica<String> instanciaString = new ClaseGenerica<>("Hola");
        ClaseGenerica<Double> instanciaDouble = new ClaseGenerica<>(3.14);
        ClaseGenerica<Integer> instanciaInteger = new ClaseGenerica<>(42);

        // Mostrar el tipo de clase para cada instancia
        instanciaString.mostrarTipoClase();
        instanciaDouble.mostrarTipoClase();
        instanciaInteger.mostrarTipoClase();
    }
}

