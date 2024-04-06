import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Lista de empleados
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Juan", 3000.0, "Desarrollador"),
                new Empleado("Gloria", 2500.0, "Analista"),
                new Empleado("Pedro", 4000.0, "Gerente"),
                new Empleado("Julia", 3500.0, "Desarrollador"),
                new Empleado("Miguel", 2800.0, "Analista"),
                new Empleado("Carlos", 4200.0, "Gerente")
        );

        // Filtrar empleados cuyo salario sea mayor a cierto valor
        double salarioMinimo = 3000.0;
        List<Empleado> empleadosFiltrados = empleados.stream()
                .filter(e -> e.getSalario() > salarioMinimo)
                .collect(Collectors.toList());
        System.out.println("Empleados con salario mayor a " + salarioMinimo + ":");
        empleadosFiltrados.forEach(System.out::println);

        // Agrupar empleados por categoría y calcular salario promedio
        Map<String, Double> salarioPromedioPorCategoria = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
        System.out.println("\nSalario promedio por categoría:");
        salarioPromedioPorCategoria.forEach((categoria, salarioPromedio) ->
                System.out.println(categoria + ": " + salarioPromedio));

        // Encontrar al empleado con el salario más alto utilizando Optionals
        Optional<Empleado> empleadoSalarioMaximo = empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));
        empleadoSalarioMaximo.ifPresent(empleado ->
                System.out.println("\nEmpleado con el salario más alto: " + empleado));
    }
}

