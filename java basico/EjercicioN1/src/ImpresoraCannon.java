public class ImpresoraCannon extends Impresora {
    //Constructor ImpresoraCannon


    public ImpresoraCannon(String modelo, String tipoConexion, String fechaFabricacion, int hojasDisponibles, int porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    //Sobrescritura del metodo imprimir
    @Override
    public void imprimir(){
        System.out.println("Imprimiento en impresora Cannon");
    }
}
