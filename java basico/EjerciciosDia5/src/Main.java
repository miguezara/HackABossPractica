public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Rocco", 3);
        Gato miGato = new Gato("Pelusa", 2);

        miPerro.comer();
        miPerro.ladrar();
        miPerro.hacerSonido();
        miGato.comer();
        miGato.maullar();
        miGato.hacerSonido();
    }
}