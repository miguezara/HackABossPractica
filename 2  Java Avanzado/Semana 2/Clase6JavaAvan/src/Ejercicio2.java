
import java.util.List;


public class Ejercicio2 {

    public static void main(String[] args) {
        // Crear un registro de mascotas de tipo String
        RegistroMascotas<String> registro = new RegistroMascotas<>();

        // Agregar algunas mascotas al registro
        registro.agregarMascota(new Mascota<>("Zeus", 5, "Perro"));
        registro.agregarMascota(new Mascota<>("Sisi", 3, "Gato"));
        registro.agregarMascota(new Mascota<>("Pepo", 1, "Ave"));
        registro.agregarMascota(new Mascota<>("Rex", 2, "Reptil"));

        // Buscar mascotas por nombre
        System.out.println("Buscando mascotas por nombre:");
        List<Mascota<String>> mascotasPorNombre = registro.buscarPorNombre("Zeus");
        for (Mascota<String> mascota : mascotasPorNombre) {
            System.out.println(mascota);
        }

        // Buscar mascotas por especie
        System.out.println("\nBuscando mascotas por especie:");
        List<Mascota<String>> mascotasPorEspecie = registro.buscarPorEspecie("Gato");
        for (Mascota<String> mascota : mascotasPorEspecie) {
            System.out.println(mascota);
        }

        // Contar la cantidad total de mascotas
        System.out.println("\nCantidad total de mascotas registradas: " + registro.contarMascotasRegistradas());

        // Generar datos aleatorios para mascotas y agregarlas al registro
        registro.generarDatosAleatorios(3);

        // Mostrar el registro completo
        System.out.println("\nRegistro completo:");
        for (Mascota<String> mascota : registro.buscarPorEspecie("")) {
            System.out.println(mascota);
        }
    }
}
