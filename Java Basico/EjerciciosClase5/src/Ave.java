public class Ave extends Animal {
    private double envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;
    //Crear constructor


    public Ave(int id, String nombre, int edad, String tipoDePiel, String tipoAlimentacion, double envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoDePiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    //Sobrescribir metodo saludar
    @Override
    public void saludar(){
        System.out.println("Hola, soy un ave");
    }
}
