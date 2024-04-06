import java.util.Arrays;
import java.util.List;


public class Ejercicio1 {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Miguel", "Hugo", "Alejandro", "Juan", "Gloria", "Jose Domingo", "Martin", "Carlos", "Manu", "Jorge");

        List<String> lista1 = nombres.stream()
                .filter(p -> p.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        lista1.forEach(System.out::println);

        List<String> lista2 = nombres.stream()
                .filter(p -> p.length() > 5)
                .map(String::toUpperCase)
                .toList();
        lista2.forEach(System.out::println);


    }
}
