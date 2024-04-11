import java.util.ArrayList;

 class Ejercicio1 {
    public static void main(String[] args) {
        // Crear ArrayList de tipo Vehiculo
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Agregar vehículos al ArrayList
        vehiculos.add(new Auto(1, "ABC123", "Tesla", "Model S", 2020, 80000, 100, 4.5));
        vehiculos.add(new Camioneta(2, "DEF456", "Toyota", "Hilux", 2019, 60000, 80, 8.0));
        vehiculos.add(new Moto(3, "GHI789", "Honda", "CBR600RR", 2021, 12000, 600, "4 tiempos"));

        // Mostrar información de cada vehículo
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("ID: " + vehiculo.id);
            System.out.println("Placa: " + vehiculo.placa);
            System.out.println("Marca: " + vehiculo.marca);
            System.out.println("Modelo: " + vehiculo.modelo);
            System.out.println("Año: " + vehiculo.año);
            System.out.println("Costo: $" + vehiculo.costo);
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años");

            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            }

            if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }

            System.out.println();
        }
    }
}