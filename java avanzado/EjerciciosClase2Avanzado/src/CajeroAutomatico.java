import java.util.Random;

public class CajeroAutomatico implements Runnable {
    private CuentaBancaria cuenta;
    private String nombre;
    private Random random;

    public CajeroAutomatico(CuentaBancaria cuenta, String nombre) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.random = new Random();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            double monto = random.nextDouble() * 1000;
            boolean esDeposito = random.nextBoolean();

            if (esDeposito) {
                cuenta.depositar(monto);
            } else {
                cuenta.retirar(monto);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}