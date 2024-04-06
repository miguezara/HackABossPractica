class Sombrero extends Vestimenta {
    private String tipo;
    private String tamaño;

    // Constructor de la clase Sombrero
    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color,
                    String tipo, String tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    // Sobrescritura del método mostrarMensaje
    @Override
    public void mostrarMensaje() {
        System.out.println("Este sombrero es de : " + tipo);
    }
}