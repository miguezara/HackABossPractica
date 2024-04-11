public class Vestimenta {
    //Atributos
    protected int codigo;
    protected String nombre;
    protected double precio;
    protected String marca;
    protected String talla;
    protected String color;

    //Constructor


    public Vestimenta(int codigo, String nombre, double precio, String marca, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }
    public void mostrarMensaje() {
        System.out.println("Esta prenda es de marca: " + marca);
    }
}
