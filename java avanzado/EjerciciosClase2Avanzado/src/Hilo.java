class Hilo extends Thread {
    private String nombre;
    private int cantidad;

    public Hilo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(nombre + ": " + i);
            try {
                Thread.sleep(1000); // Espera de 1 segundo entre cada iteración
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
