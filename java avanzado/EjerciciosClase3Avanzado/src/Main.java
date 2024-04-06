import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Cargar los meses de forma imperativa
        List<String> listaMeses = (List.of(
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        ));

        // Mostrar los meses
        for (String mes : listaMeses) {
            System.out.println("El mes es: " + mes);
            if (mes.startsWith("A")){

            }
        }

        //funcional
        System.out.println("***Con programacion funcional***");
        //listaMeses.forEach()(p -> System.out.println(p));
        //listaMeses.forEach(p -> System.out.println(p));
        //listaMeses.forEach(System.out::println);

        long cantidad = listaMeses.stream()
               .filter(p -> p.length() >8)
               .count();
        System.out.println("la cantidad es: " +cantidad);

    }

}

