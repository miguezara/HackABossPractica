import java.util.Calendar;
class Moto extends Vehiculo implements Combustion {
    // Atributos específicos para motos de combustión
    private double cilindrada;
    private String tipoMotor;

    // Constructor
    public Moto(int id, String placa, String marca, String modelo, int año, double costo, double cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
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
        System.out.println("Recargando combustible de la moto de combustión...");
    }
}
