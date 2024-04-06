

public class Ejercicio4 {



        public static void main(String[] args) {
            CuentaBancaria cuenta = new CuentaBancaria(50);

            CajeroAutomatico cajero1 = new CajeroAutomatico(cuenta, "Cajero 1");
            CajeroAutomatico cajero2 = new CajeroAutomatico(cuenta, "Cajero 2");

            Thread hiloCajero1 = new Thread(cajero1);
            Thread hiloCajero2 = new Thread(cajero2);

            hiloCajero1.start();
            hiloCajero2.start();
        }
    }


