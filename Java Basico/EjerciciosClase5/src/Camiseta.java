class Camiseta extends Vestimenta {
    private String manga;
    private String cuello;

    // Constructor de la clase Camiseta
    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color,
                    String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    // Sobrescritura del método mostrarMensaje
    @Override
    public void mostrarMensaje() {
        System.out.println("Esta camiseta es de manga: " + manga);
    }
}