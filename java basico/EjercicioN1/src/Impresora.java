public class Impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int hojasDisponibles;
    private int porcentajeTinta;

    // Constructo de la clase Impresora

    public Impresora(String modelo, String tipoConexion, String fechaFabricacion, int hojasDisponibles, int porcentajeTinta) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }
    //Metodo Imprimir
    public void imprimir(){
        System.out.println("Imprimiendo en impresora");
    }
}
