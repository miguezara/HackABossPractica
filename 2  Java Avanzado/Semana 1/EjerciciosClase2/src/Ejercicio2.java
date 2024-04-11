import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroTrabajadores = 5; // Número de trabajadores
        int numeroTareas = 10; // Número total de tareas

        ExecutorService executor = Executors.newFixedThreadPool(numeroTrabajadores);

        for (int i = 1; i <= numeroTareas; i++) {
            Runnable tarea = new Trabajador("Trabajador " + i, "tarea " + i);
            executor.execute(tarea);
        }

        executor.shutdown();
    }
}
