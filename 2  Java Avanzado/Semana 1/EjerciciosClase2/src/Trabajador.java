public class Trabajador implements Runnable {
    private final String nombre;
    private final String tarea;

    public Trabajador(String nombre, String tarea) {
        this.nombre = nombre;
        this.tarea = tarea;
    }

    public void run() {
        System.out.println(nombre + " comenzó la tarea de " + tarea);

        // Simular tiempo de ejecución de la tarea
        try {
            Thread.sleep(2000); // Simulamos una tarea de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nombre + " terminó la tarea de " + tarea);
    }
}