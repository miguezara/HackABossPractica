import java.util.Arrays;
import java.util.Scanner;
public class VectorGestion {
    private int[] vector;

    public VectorGestion(int tamaño) {
        vector = new int[tamaño];
    }

    public void almacenarDatosEnVector() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese " + vector.length + " números para almacenar en el vector:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
        }

        System.out.println("Datos almacenados en el vector: " + Arrays.toString(vector));
    }

    public void accederDatosEnVector() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el índice para acceder al dato almacenado en el vector:");

        try {
            int indice = scanner.nextInt();
            int dato = vector[indice];

            System.out.println("Dato en la posición " + indice + ": " + dato);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intentando acceder a una posición inválida en el vector.");
        }
    }
}

