import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Crear un vector para almacenar las temperaturas máximas de la semana
        double[] temperaturasMaximas = new double[7];

        // Solicitar al usuario que ingrese las temperaturas máximas de la semana
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            temperaturasMaximas[i] = scanner.nextDouble();
        }

        // Calcular la temperatura máxima promedio
        double sumaTemperaturas = 0;
        for (double temperatura : temperaturasMaximas) {
            sumaTemperaturas += temperatura;
        }
        double temperaturaPromedio = sumaTemperaturas / 7;

        // Mostrar el resultado por pantalla
        System.out.println("La temperatura máxima promedio de la semana es: " + temperaturaPromedio + " grados Celsius.");


        scanner.close();
    }
}

