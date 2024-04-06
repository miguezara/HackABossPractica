 import java.util.List;

public class Ejercicio2  {
        public static void main(String[] args) {
            // Cargar los números
            List<Integer> numeros = List.of(5, 12, 8, 15, 3, 20, 7, 18, 9, 11);

            // Cantidad de elementos mayores a 10 usando programación imperativa
            int contador = 0;
            for (Integer numero : numeros) {
                if (numero > 10) {
                    contador++;
                }
            }
            System.out.println("Cantidad de números mayores a 10 (imperativo): " + contador);

            // Cantidad de elementos mayores a 10 usando programación funcional y lambda
            long cantidad = numeros.stream()
                    .filter(numero -> numero > 10)
                    .count();
            System.out.println("Cantidad de números mayores a 10 (funcional): " + cantidad);
        }
    }


