import java.util.List;
import java.util.function.Predicate;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Persona> personas = List.of(
                new Persona("Juan",19),
                new Persona("Jose",22),
                new Persona("Laura",14),
                new Persona("Ramón",29),
                new Persona("Jorge",13),
                new Persona("Jorge",23)
        );

        //Predicate<Persona> esMayor18 = persona -> persona.getEdad() > 18;
        long cantidad = personas
                .stream()
                //.filter(esMayor18)
                .filter(p -> p.getEdad() > 18)
                .count();
        System.out.println("La cantidad mayores a 18 son: "+cantidad);
    }
}
