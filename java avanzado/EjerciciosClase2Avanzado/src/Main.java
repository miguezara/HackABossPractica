public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("Hilo 1", 5); // Primer hilo con cantidad 5
        Hilo hilo2 = new Hilo("Hilo 2", 3); // Segundo hilo con cantidad 3

       /*hilo1.start(); // Inicia el primer hilo
        hilo2.start(); // Inicia el segundo hilo*/

        Thread thread1 = new Thread(hilo1); // Crear un nuevo hilo y pasar el objeto hilo1
        Thread thread2 = new Thread(hilo2); // Crear un nuevo hilo y pasar el objeto hilo2

        thread1.start(); // Iniciar el primer hilo
        thread2.start(); // Iniciar el segundo hilo
    }
}

