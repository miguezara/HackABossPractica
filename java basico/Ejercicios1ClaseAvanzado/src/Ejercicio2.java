public class Ejercicio2 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1001, "123456789", 1000);
        System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
        try {
            cuenta.retirar(200);
        } catch (TransaccionInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("El nuevo saldo de la cuenta es: " + cuenta.getSaldo());
        }
    }
}