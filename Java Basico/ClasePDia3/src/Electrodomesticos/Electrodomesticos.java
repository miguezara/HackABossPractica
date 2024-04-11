package Electrodomesticos;

public class Electrodomesticos {
    public static void main(String[] args) {

        //Crear 3 objetos Electrodomesticos

        Electrodomestico electrodomesticos1 = new Electrodomestico(1, "LG", "TV55", 200.2, "Negro");
        Electrodomestico electrodomesticos2 = new Electrodomestico(2, "Samsung", "frigorifico", 150.0, "Gris");
        Electrodomestico electrodomesticos3 = new Electrodomestico(3, "Sony", "microondas", 250.0, "Blanco");
        // Crear un objeto sin parámetros

        Electrodomestico electrodomesticoSinParametros = new Electrodomestico();

        // Mostrar por pantalla la marca, modelo y consumo energético de los electrodomésticos creados con parámetros
        System.out.println("Electrodoméstico 1 - Marca: " + electrodomesticos1.getMarca() + ", Modelo: " + electrodomesticos1.getModelo() + ", Consumo: " + electrodomesticos1.getConsumo() + " kWh");
        System.out.println("Electrodoméstico 2 - Marca: " + electrodomesticos2.getMarca() + ", Modelo: " + electrodomesticos1.getModelo() + ", Consumo: " + electrodomesticos2.getConsumo() + " kWh");
        System.out.println("Electrodoméstico 3 - Marca: " + electrodomesticos3.getMarca() + ", Modelo: " + electrodomesticos1.getModelo() + ", Consumo: " + electrodomesticos3.getConsumo() + " kWh");

        // Intentar obtener la marca del electrodoméstico creado sin parámetros
        System.out.println("Marca del electrodoméstico sin parámetros: " + electrodomesticoSinParametros.getMarca());
    }
}


