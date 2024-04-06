public class Ejercicio3 {
    public static void main(String[] args) {
    Cliente cliente = new Cliente(1, "Juan", 500, 1000);

        try {
        // Intento de compra
        cliente.comprar(500);
    } catch (ClienteException e) {
        System.out.println("Error al realizar la compra: " + e.getMessage());
    }

        try {
        // Intento de pago
        cliente.pagar(200);
    } catch (ClienteException e) {
        System.out.println("Error al realizar el pago: " + e.getMessage());
    }
}
}

