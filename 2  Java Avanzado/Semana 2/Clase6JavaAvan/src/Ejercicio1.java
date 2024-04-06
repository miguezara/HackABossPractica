import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear algunos autos
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 25000.0);
        Auto auto2 = new Auto("Honda", "Civic", 2018, 20000.0);
        Auto auto3 = new Auto("Ford", "Fiesta", 2019, 18000.0);

        // Crear un inventario de autos
        InventarioAutos<Auto> inventario = new InventarioAutos<>();

        // Agregar los autos al inventario
        inventario.agregarAuto(auto1);
        inventario.agregarAuto(auto2);
        inventario.agregarAuto(auto3);

        // Buscar autos por marca
        String marcaBuscada = "Toyota";
        List<Auto> autosPorMarca = inventario.buscarPorMarca(marcaBuscada);
        System.out.println("Autos de la marca " + marcaBuscada + ":");
        for (Auto auto : autosPorMarca) {
            System.out.println(auto);
        }

        // Buscar autos por año
        int añoBuscado = 2019;
        List<Auto> autosPorAño = inventario.buscarPorAño(añoBuscado);
        System.out.println("\nAutos del año " + añoBuscado + ":");
        for (Auto auto : autosPorAño) {
            System.out.println(auto);
        }

        // Calcular el valor total del inventario
        double valorTotal = inventario.calcularValorTotal();
        System.out.println("\nValor total del inventario: $" + valorTotal);
    }
}

