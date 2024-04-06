class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau!");
    }
}
