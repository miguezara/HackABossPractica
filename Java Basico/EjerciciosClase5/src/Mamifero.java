public class Mamifero extends Animal{
    private int numeroPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;
    //Crear constructor
    public Mamifero(int id, String nombre, int edad, String tipoDePiel, String tipoAlimentacion, int numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }
    //Sobrescribir metodo saludar
    @Override
    public void saludar(){
        System.out.println("Hola, soy un mamímfero");
    }
}
