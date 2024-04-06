public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositaron " + monto + " Euros. Saldo actual: " + saldo);
    }

    public synchronized void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Se retiraron " + monto + " Euros. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar " + monto + " Euros.");
        }
    }
}

