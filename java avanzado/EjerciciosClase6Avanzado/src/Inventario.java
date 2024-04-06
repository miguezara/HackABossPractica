import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends Producto> {
    private List<T> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
        System.out.println("Producto agregado al inventario: " + producto.getNombre());
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (T producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }


    }

    // Otros métodos relacionados con la gestión del inventario


    public List<T> getProductos() {
        return productos;
    }
}
