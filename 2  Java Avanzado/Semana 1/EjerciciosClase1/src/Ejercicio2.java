public class Ejercicio2 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 29.99, 50);

        try {
            producto1.agregarStock(20); // Agregar 20 unidades al inventario
            producto1.vender(10); // Vender 10 unidades
            producto1.vender(50); // Intentar vender más unidades de las disponibles
            producto1.agregarStock(-5); // Intentar agregar un número negativo de unidades
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (StockInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

