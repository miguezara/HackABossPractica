import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Crear una matriz para representar el mapa de asientos del teatro
        char[][] mapaAsientos = new char[5][5];

        // Inicializar el mapa de asientos con asientos vacíos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mapaAsientos[i][j] = 'O';
            }
        }

        // Mostrar el mapa de asientos inicial
        System.out.println("Mapa de asientos inicial:");
        mostrarMapaAsientos(mapaAsientos);

        // Realizar reservas de asientos
        boolean continuarReservas = true;
        while (continuarReservas) {
            // Pedir al usuario que ingrese la fila y el número de asiento
            System.out.print("Ingrese la fila del asiento (1-5): ");
            int fila = scanner.nextInt() - 1; // Ajustar la entrada del usuario al índice de la matriz
            System.out.print("Ingrese el número de asiento (1-5): ");
            int numeroAsiento = scanner.nextInt() - 1; // Ajustar la entrada del usuario al índice de la matriz

            // Verificar si el asiento está disponible
            if (mapaAsientos[fila][numeroAsiento] == 'O') {
                // Marcar el asiento como ocupado
                mapaAsientos[fila][numeroAsiento] = 'X';
                System.out.println("¡Asiento reservado con éxito!");
            } else {
                System.out.println("El asiento seleccionado está ocupado. Por favor, elija otro.");
            }

            // Mostrar el mapa de asientos actualizado
            mostrarMapaAsientos(mapaAsientos);

            // Preguntar al usuario si desea continuar reservando asientos
            System.out.print("¿Desea reservar otro asiento? (Sí: 1, No: 0): ");
            int opcion = scanner.nextInt();
            continuarReservas = (opcion == 1);
        }


        scanner.close();
    }

    // Método para mostrar el mapa de asientos
    public static void mostrarMapaAsientos(char[][] mapaAsientos) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mapaAsientos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
