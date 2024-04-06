class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void maullar() {
        System.out.println(nombre + " está maullando.");
    }
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }
}
