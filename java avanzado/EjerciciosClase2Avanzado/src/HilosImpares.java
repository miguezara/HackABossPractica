public class HilosImpares extends Thread {
    public void run() {
        System.out.println("Numeros impares del 1 al 10");
        for (int i = 1; i <= 10; i +=2) {
            System.out.println(i);
        }
    }
}
