public class Vuelo {

    private String destino;
    private String fecha;
    private int asientosDisponibles;

    public Vuelo(String destino, String fecha, int asientosDisponibles) {
        this.destino = destino;
        this.fecha = fecha;
        this.asientosDisponibles = asientosDisponibles;
    }

    public void reservar(String nombrePasajero, int numAsientos) throws ReservaInvalidaException {
        if (nombrePasajero == null || nombrePasajero.isEmpty()) {
            throw new ReservaInvalidaException("El nombre del pasajero es inválido.");
        }

        if (numAsientos <= 0) {
            throw new ReservaInvalidaException("El número de asientos debe ser mayor que cero.");
        }

        if (numAsientos > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles.");
        }

        //  la reserva es válida
        asientosDisponibles -= numAsientos;
        System.out.println("Reserva realizada para " + nombrePasajero + " con éxito.");
    }
}

