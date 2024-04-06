
   public class MiRunnable implements Runnable {
        private String nombre;
        private int cantidad;

        public MiRunnable(String nombre, int cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }

        @Override
        public void run() {
            for (int i = 0; i < cantidad; i++) {
                System.out.println(nombre + ": " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

