import java.util.Calendar;
class Auto extends Vehiculo implements Electrico {
    // Atributos específicos para autos eléctricos
    private int capacidadBateria;
    private double autonomia;

    // Constructor
    public Auto(int id, String placa, String marca, String modelo, int año, double costo, int capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    // Implementación del método abstracto calcularAntiguedad()
    @Override
    public int calcularAntiguedad() {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - año;
    }

    // Implementación del método de la interfaz Electrico
    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energía del auto eléctrico...");
    }
}
