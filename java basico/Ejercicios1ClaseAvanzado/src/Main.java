public class Main {
    public static void main(String[] args){
        try {
            // Pruebas
            Fecha fecha1 = new Fecha(32, 2, 2024); // Día fuera de rango
            Fecha fecha2 = new Fecha(15, 13, 2024); // Día y mes fuera de rango
        } catch (FechaException ex) {

            System.out.println("Se produjo una excepción: " +ex.getMessage());
        }
    }
}
