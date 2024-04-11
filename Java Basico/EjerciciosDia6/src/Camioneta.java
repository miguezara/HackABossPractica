import java.util.Calendar;
class Camioneta extends Vehiculo implements Combustion {
    // Atributos específicos para camionetas de combustión
    private double capacidadTanque;
    private double consumoCombustible;

    // Constructor
    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    // Implementación del método abstracto calcularAntiguedad()
    @Override
    public int calcularAntiguedad() {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - año;
    }

    // Implementación del método de la interfaz Combustion
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la camioneta de combustión...");
    }
}