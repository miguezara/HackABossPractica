import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Carlos", Arrays.asList(8.0, 9.0, 7.0), 20),
                new Estudiante("Maria", Arrays.asList(7.5, 8.5, 9.0), 19),
                new Estudiante("Juan", Arrays.asList(6.5, 8.0, 7.0), 17),
                new Estudiante("Laura", Arrays.asList(9.0, 9.5, 8.0), 21),
                new Estudiante("Pedro", Arrays.asList(8.5, 7.0, 6.5), 18)
        );

        // Filtrar estudiantes mayores de 18 años y mostrarlos
        System.out.println("Estudiantes mayores de 18 años:");
        estudiantes.stream()
                .filter(estudiante -> estudiante.getEdad() > 18)
                .forEach(System.out::println);

        // Calcular y mostrar el promedio de calificaciones de cada estudiante
        System.out.println("\nPromedio de calificaciones de cada estudiante:");
        estudiantes.forEach(estudiante -> {
            Optional<Double> promedio = estudiante.getCalificaciones().stream()
                    .reduce((nota1, nota2) -> nota1 + nota2)
                    .map(total -> total / estudiante.getCalificaciones().size());
            System.out.println(estudiante.getNombre() + ": " + promedio.orElse(0.0));
        });
    }
}