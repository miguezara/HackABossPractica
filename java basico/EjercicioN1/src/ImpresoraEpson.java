public class ImpresoraEpson extends Impresora{
    //Constructor clase ImpresoraEpson

    public ImpresoraEpson(String modelo, String tipoConexion, String fechaFabricacion, int hojasDisponibles, int porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    //Sobrescritura metodo imprimir
    @Override
    public void imprimir(){
        System.out.println("Imprimiento en impresora Epson");
    }
}
