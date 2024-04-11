class Zapato extends Vestimenta {
    // Atributos adicionales de Zapato
    private String material;
    private String tipoCierre;

    // Constructor de Zapato
    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color,
                  String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    // Método para mostrar la marca de los zapatos
    @Override
    public void mostrarMensaje() {
        System.out.println("Estos zapatos son de marca: " + marca);
    }
}