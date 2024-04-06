import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ejercicio5 {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Alcaide"));
        clientes.add(new Cliente(2, "Cepas"));
        clientes.add(new Cliente(3, "Gomez"));
        clientes.add(new Cliente(4, "Lopez"));
        clientes.add(new Cliente(5, "Sanchez"));
        clientes.add(new Cliente(6, "Sosa"));
        clientes.add(new Cliente(7, "Moreno"));
        clientes.add(new Cliente(8, "Diaz"));
        clientes.add(new Cliente(9, "Gutierrez"));
        clientes.add(new Cliente(10, "Fuentes"));

        // Buscar cliente por apellido
        String apellidoBuscado = "sosa";
        Optional<Cliente> clienteEncontrado = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(apellidoBuscado))
                .findFirst();

        // Obtener el primer cliente cuyo apellido coincida con uno buscado
        System.out.println("Cliente encontrado: " + clienteEncontrado.orElse(new Cliente(0, apellidoBuscado)));

        // Mostrar mensaje si está presente o no
        if (clienteEncontrado.isPresent()) {
            System.out.println("Cliente encontrado");
        } else {
            System.out.println("No se encontró cliente");
        }

        // Buscar cliente por apellido
        Cliente clienteBuscado = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(apellidoBuscado))
                .findFirst()
                .orElse(new Cliente(0, apellidoBuscado));

        System.out.println("Cliente buscado: " + clienteBuscado);

        // Devolver el apellido o "Cliente no encontrado"
        String apellidoResultado = clientes.stream()
                .map(Cliente::getApellido)
                .filter(apellido -> apellido.equalsIgnoreCase(apellidoBuscado))
                .findFirst()
                .orElse("Cliente no encontrado");
        System.out.println("Apellido: " + apellidoResultado);

    }
}