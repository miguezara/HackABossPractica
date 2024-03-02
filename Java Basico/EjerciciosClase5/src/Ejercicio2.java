public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear un vector de tipo Vestimenta
        Vestimenta[] prendas = new Vestimenta[9];

        // Almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero
        prendas[0] = new Zapato(1, "Zapato1", 50.0, "Nike", "40", "Negro", "Cuero", "Cierre");
        prendas[1] = new Zapato(2, "Zapato2", 60.0, "Adidas", "42", "Blanco", "Sintético", "Velcro");
        prendas[2] = new Zapato(3, "Zapato3", 55.0, "Puma", "38", "Rojo", "Tela", "Cordones");

        prendas[3] = new Pantalon(4, "Pantalon1", 45.0, "Levi's", "M", "Azul", "Slim", "Algodón");
        prendas[4] = new Pantalon(5, "Pantalon2", 40.0, "Diesel", "L", "Negro", "Skinny", "Mezclilla");
        prendas[5] = new Pantalon(6, "Pantalon3", 50.0, "Zara", "S", "Gris", "Regular", "Poliéster");

        prendas[6] = new Camiseta(7, "Camiseta1", 20.0, "Tommy Hilfiger", "M", "Blanco", "Corta", "Redondo");
        prendas[7] = new Camiseta(8, "Camiseta2", 25.0, "Calvin Klein", "L", "Negro", "Larga", "V");

        prendas[8] = new Sombrero(9, "Sombrero1", 30.0, "Gucci", "M", "Marrón", "Ala ancha", "M");

        // Recorrer el vector y ejecutar el método que corresponde en cada posición
        for (int i = 0; i < prendas.length; i++) {
            prendas[i].mostrarMensaje();
        }
    }
}
