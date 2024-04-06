import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<Integer> notas = Arrays.asList(1, 2, 8, 5, 3, 4, 6, 7, 9, 10);

        // Calcular el promedio de las notas de los alumnos
        // Forma 1 con mapToInt y average
        OptionalDouble promedio1 = notas.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (promedio1.isPresent()) {
            System.out.println("El promedio de las notas es: " + promedio1.getAsDouble());
        } else {
            System.out.println("El listado no tiene ninguna nota.");
        }

        // Forma 2 con reduce
        double promedio2 = notas.stream()
                .mapToDouble(Double::valueOf)
                .reduce(0, Double::sum) / notas.size();
        System.out.println("El promedio de las notas es: " + promedio2);
    }
}
