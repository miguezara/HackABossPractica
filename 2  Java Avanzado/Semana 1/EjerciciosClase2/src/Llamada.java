

public class Llamada implements Runnable {
    private final int numeroLlamada;

    public Llamada(int numeroLlamada) {
        this.numeroLlamada = numeroLlamada;
    }

    public void run() {
        System.out.println("Llamada #" + numeroLlamada + " en espera.");

        // Simular tiempo de la llamada
        try {
            Thread.sleep(2000); // Simulamos una llamada de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Llamada #" + numeroLlamada + " atendida.");
    }
}
