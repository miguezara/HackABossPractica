import java.util.Scanner;

    public class Ejercicio1 {
        public static void main(String[] args) {
            // Crear un objeto Scanner
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese su edad
            System.out.println("Ingrese su edad:");
            int edad = scanner.nextInt();

            // Verificar si la edad es mayor o igual a 18
            if (edad >= 18) {
                System.out.println("¡Bienvenido al recital! Puedes ingresar.");
            } else {
                System.out.println("Lo siento, eres menor de edad. No puedes ingresar al recital.");
            }


            scanner.close();
        }
    }


