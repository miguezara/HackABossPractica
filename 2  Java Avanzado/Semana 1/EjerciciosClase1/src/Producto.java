public class Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public void agregarStock(int cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a agregar debe ser mayor que cero.");
        }

        cantidadDisponible += cantidad;
        System.out.println("Se agregaron " + cantidad + " unidades de " + nombre + " al inventario.");
    }

    public void vender(int cantidad) throws IllegalArgumentException, StockInsuficienteException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a vender debe ser mayor que cero.");
        }

        if (cantidad > cantidadDisponible) {
            throw new StockInsuficienteException("No hay suficientes unidades de " + nombre + " en el inventario.");
        }

        cantidadDisponible -= cantidad;
        System.out.println("Se vendieron " + cantidad + " unidades de " + nombre + ".");
    }
}

