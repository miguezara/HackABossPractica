import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroAgentes = 5; // Número de agentes
        int numeroLlamadas = 10; // Número total de llamadas

        ExecutorService executor = Executors.newFixedThreadPool(numeroAgentes);

        for (int i = 1; i <= numeroLlamadas; i++) {
            Runnable llamada = new Llamada(i);
            executor.execute(llamada);
        }

        executor.shutdown();
    }
}

