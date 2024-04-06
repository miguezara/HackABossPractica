public class CuentaBancaria {
    private int id;
    private String numero;
    private double saldo;

    public CuentaBancaria(int id, String numero, double saldo) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;

    }

    public Double getSaldo() {
        return saldo;
    }


    public void retirar(double cantidad) throws TransaccionInvalidaException {
        if (cantidad <= 0) {
            throw new TransaccionInvalidaException("La cantidad a retirar debe ser mayor que cero.");
        }
        if (cantidad > saldo) {
            throw new TransaccionInvalidaException("Fondos insuficientes para realizar la transacción.");
        }
        saldo -= cantidad;
        System.out.println("Se ha retirado $" + cantidad + " de la cuenta " + numero + ". Nuevo saldo: $" + saldo);
    }

}
