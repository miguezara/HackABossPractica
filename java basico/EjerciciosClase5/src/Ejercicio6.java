import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Ejercicio6 {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 1200.0, "Electrónicos"));
        productos.add(new Producto("Teléfono", 800.0, "Electrónicos"));
        productos.add(new Producto("Camiseta", 20.0, "Ropa"));
        productos.add(new Producto("Zapatos", 100.0, "Calzado"));
        productos.add(new Producto("Libro", 15.0, "Libros"));
        productos.add(new Producto("Mochila", 40.0, "Accesorios"));

        // 1.Filtrar productos de una categoría

        List<Producto> productosFiltrados = productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Electrónicos"))
                .toList();
        productosFiltrados.forEach(p -> System.out.println("Productos: " +p.getNombre()));

        //2. Ordenar productos filtrados por precio de forma descendente
        System.out.println("\nProductos ordenados por precio de forma descendente:");
        List<Producto> productosOrdenados = productos.stream()
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .collect(Collectors.toList());
        productosOrdenados.forEach(p -> System.out.println("Producto: " +p.getNombre() + ": $" + p.getPrecio()));

        //3. Calcular el promedio de los precios de los productos filtrados
       double promedio = productosFiltrados.stream()
                .mapToDouble(p -> p.getPrecio())
                .average()
                .orElse(0.00);
        System.out.println("El promedio es: " +promedio);


    }
}
