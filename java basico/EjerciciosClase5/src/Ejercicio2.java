import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


public class Ejercicio2 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 12, 8, 15, 3, 20, 10, 25, 6, 18);
        //Filtrar los numeros mayores a 10
//forma 1 con reduce
        BinaryOperator<Integer> binaryOperator = (acum, nro) -> acum + nro;

        Integer suma1 = numeros.stream()
                .filter(n -> n > 10)
                .reduce(0, binaryOperator);
        System.out.println("suma es: " + suma1);


        //forma 2 con maptoint y sum

        Integer suma2 = numeros.stream()
                .filter(n -> n > 10)
                .mapToInt(nro -> nro)
                .sum();

        System.out.println("Suma es: " + suma2);
    }
}
