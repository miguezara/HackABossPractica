public class Animal {
    private int id;
    private String nombre;
    private int edad;
    private String tipoPiel;
    private String TipoAlimentacion;

    //Contrustor


    public Animal(int id, String nombre, int edad, String tipoDePiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        TipoAlimentacion = tipoAlimentacion;
    }
    //Metodo saludar
    public void saludar(){
        System.out.println("Hola, soy un animal");
    }
}
//No es posible acceder a métodos privados desde clases externas, incluyendo la clase Main.
// Los métodos privados solo pueden ser accesibles dentro de la misma clase donde están definidos.