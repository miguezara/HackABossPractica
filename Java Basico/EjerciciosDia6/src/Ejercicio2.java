import java.util.ArrayList;
public class Ejercicio2 {

        public static void main(String[] args) {
            // Crear un ArrayList para almacenar los productos
            ArrayList<Producto> inventario = new ArrayList<>();

            // Agregar 10 objetos de tipo Producto con sus valores cargados
            inventario.add(new Producto(1, "Teléfono", "Samsung", "Electrónica", 200, 300, 50));
            inventario.add(new Producto(2, "Laptop", "HP", "Computadoras", 600, 900, 20));
            inventario.add(new Producto(3, "Auriculares", "Sony", "Accesorios", 50, 80, 100));
            inventario.add(new Producto(4, "Cargador", "Anker", "Accesorios", 20, 30, 80));
            inventario.add(new Producto(5, "Tablet", "Apple", "Computadoras", 400, 600, 30));
            inventario.add(new Producto(6, "Teclado", "Logitech", "Accesorios", 30, 50, 70));
            inventario.add(new Producto(7, "Mouse", "Microsoft", "Accesorios", 15, 25, 120));
            inventario.add(new Producto(8, "Impresora", "Epson", "Impresoras", 150, 250, 10));
            inventario.add(new Producto(9, "Smartwatch", "Fitbit", "Accesorios", 100, 150, 40));
            inventario.add(new Producto(10, "Monitor", "Dell", "Monitores", 250, 350, 15));

            // Operaciones
            obtenerProductoMayorPrecioVenta(inventario);
            obtenerProductoMenorPrecioCosto(inventario);
            eliminarProductoPosicionCinco(inventario);
            descontarUnidadesProductoMayorStock(inventario);
        }

        // Método para obtener el producto con el mayor precio de venta
        public static void obtenerProductoMayorPrecioVenta(ArrayList<Producto> inventario) {
            double maxPrecioVenta = Double.MIN_VALUE;
            Producto productoMayorPrecioVenta = null;
            for (Producto producto : inventario) {
                if (producto.getPrecioVenta() > maxPrecioVenta) {
                    maxPrecioVenta = producto.getPrecioVenta();
                    productoMayorPrecioVenta = producto;
                }
            }
            System.out.println("El producto con el mayor precio de venta es: " + productoMayorPrecioVenta.getNombre());
        }

        // Método para obtener el producto con el menor precio de costo
        public static void obtenerProductoMenorPrecioCosto(ArrayList<Producto> inventario) {
            double minPrecioCosto = Double.MAX_VALUE;
            Producto productoMenorPrecioCosto = null;
            for (Producto producto : inventario) {
                if (producto.getPrecioCosto() < minPrecioCosto) {
                    minPrecioCosto = producto.getPrecioCosto();
                    productoMenorPrecioCosto = producto;
                }
            }
            System.out.println("El producto con el menor precio de costo es: " + productoMenorPrecioCosto.getNombre());
        }

        // Método para eliminar el producto en la posición 5 del ArrayList
        public static void eliminarProductoPosicionCinco(ArrayList<Producto> inventario) {
            if (inventario.size() > 5) {
                inventario.remove(5);
                System.out.println("Se ha eliminado el producto en la posición 5 del inventario.");
            } else {
                System.out.println("No hay suficientes productos en el inventario para eliminar el de la posición 5.");
            }
        }

        // Método para descontar unidades del producto con la mayor cantidad en stock
        public static void descontarUnidadesProductoMayorStock(ArrayList<Producto> inventario) {
            int maxStock = Integer.MIN_VALUE;
            Producto productoMayorStock = null;
            for (Producto producto : inventario) {
                if (producto.getCantidadStock() > maxStock) {
                    maxStock = producto.getCantidadStock();
                    productoMayorStock = producto;
                }
            }
            if (productoMayorStock != null) {
                productoMayorStock.descontarStock(3);
                System.out.println("Se han descontado 3 unidades del producto con mayor stock: " + productoMayorStock.getNombre());
            }
        }
    }


