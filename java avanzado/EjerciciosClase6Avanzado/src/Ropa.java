public class Ropa extends Producto{

    private String material;
    private String talla;

    public Ropa(String nombre, double precio, String material, String talla) {
        super(nombre, precio);
        this.material = material;
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
