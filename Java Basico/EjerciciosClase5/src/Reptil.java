public class Reptil extends Animal{
    private double longitud;
    private String escamas;
    private boolean tipoVenenoso;
    private String habitat;
    //Crear constructor

    public Reptil(int id, String nombre, int edad, String tipoDePiel, String tipoAlimentacion, double longitud, String escamas, boolean tipoVenenoso, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoAlimentacion);
        this.longitud = longitud;
        this.escamas = escamas;
        this.tipoVenenoso = tipoVenenoso;
        this.habitat = habitat;
    }
    //Sobrescribir metodo saludar
    @Override
    public void saludar(){
        System.out.println("Hola, soy un réptil");
    }
}
