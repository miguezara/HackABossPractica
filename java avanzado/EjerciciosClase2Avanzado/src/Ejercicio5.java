public class Ejercicio5 {
    public static void main (String[] args) {

        HilosPares hilosPares = new HilosPares();
        HilosImpares hilosImpares = new HilosImpares();

        hilosPares.start();
        hilosImpares.start();
    }
}
