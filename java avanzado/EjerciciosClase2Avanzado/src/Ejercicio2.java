public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear instancias de la clase que implementa Runnable
        MiRunnable miRunnable1 = new MiRunnable("Hilo 1", 5);
        MiRunnable miRunnable2 = new MiRunnable("Hilo 2", 3);

        // Crear instancias de Thread y pasarles las instancias de MiRunnable
        Thread thread1 = new Thread(miRunnable1);
        Thread thread2 = new Thread(miRunnable2);

        // Iniciar los hilos
        thread1.start();
        thread2.start();
    }
}

