

// Clase abstracta Vehiculo
abstract class Vehiculo {
    // Atributos
    protected int id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double costo;

    // Constructor
    public Vehiculo(int id, String placa, String marca, String modelo, int año, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costo = costo;
    }

    // Método abstracto para calcular la antigüedad del vehículo
    public abstract int calcularAntiguedad();
}

// Interfaces
interface Electrico {
    void cargarEnergia();
}

interface Combustion {
    void recargarCombustible();
}