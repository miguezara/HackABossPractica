public class HilosPares extends Thread {
    public void run () {
        int suma = 0;
        System.out.println("Numeros pares del 1 al 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                suma += i;
            }
            System.out.println("suma de numeros pares: " + suma);
        }
    }
}
