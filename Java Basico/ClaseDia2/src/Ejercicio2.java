import java.util.Scanner;

    public class Ejercicio2 {
        public static void main(String[] args) {
            // Crear un objeto Scanner
            Scanner scanner = new Scanner(System.in);

            double totalCompra = 0.0;

            // Utilizar una estructura repetitiva con centinela para ingresar los precios
            double precioProducto;
            do {
                System.out.println("Ingrese el precio del producto (ingrese 0 o un número negativo para finalizar):");
                precioProducto = scanner.nextDouble();

                // Verificar si el precio es positivo y mayor que 0
                if (precioProducto > 0) {
                    totalCompra += precioProducto;
                } else if (precioProducto < 0) {
                    System.out.println("Precio inválido. No se permiten valores negativos.");
                }
            } while (precioProducto > 0);

            // Mostrar el total de la compra
            System.out.println("El total de la compra es: €" + totalCompra);


            scanner.close();
        }
    }


