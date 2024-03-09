public class Ejercicio1 {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("Nueva York", "2024-03-10", 100);

        try {
            vuelo.reservar("Miguel Alcaide", 2);
            vuelo.reservar("Gloria Merino", 150);
            vuelo.reservar("", 3);
            vuelo.reservar("Pepe Gomez", -1);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error en la reserva: " + e.getMessage());
        }
    }
}