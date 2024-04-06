public class EjercicioN1 {
    public static void main(String[] args) {
        // Crear un objeto Socio
        Socio socio = new Socio(123, "Juan", 50.0, "Gimnasio");

        // Crear un objeto SocioHabilitado
        SocioHabilitado socioHabilitado = new SocioHabilitado(456, "Pedro", 70.0, "Natación", 30.0, true);

        // Llamar a los métodos costoMensual() desde cada objeto
        System.out.println("Costo mensual para socio regular: $" + socio.costoMensual());
        System.out.println("Costo mensual para socio habilitado: $" + socioHabilitado.costoMensual());
    }
}