public class Main {
    public static void main(String[] args) {
        // Crear un vector de tipo Persona con cinco posiciones
        Persona[] personas = new Persona[5];

        // Crear cinco personas y guardarlas
        personas[0] = new Persona(1, "Miguel", 25, "Calle A", "123456789");
        personas[1] = new Persona(2, "María", 35, "Calle B", "987654321");
        personas[2] = new Persona(3, "Carlos", 40, "Calle C", "456789123");
        personas[3] = new Persona(4, "Fran", 28, "Calle D", "321654987");
        personas[4] = new Persona(5, "Pedro", 50, "Calle E", "789123456");

        // Recorrer el vector y mostrar por pantalla
        System.out.println("Personas registradas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

        // Cambiar el nombre de dos personas
        personas[1].setNombre("Ana");
        personas[3].setNombre("David");

        // Mostrar por pantalla
        System.out.println("Cambios de nombre:");
        System.out.println("Nombre antes del cambio: María -> " + personas[1].getNombre());
        System.out.println("Nombre después del cambio: Gloria -> " + personas[1].getNombre());
        System.out.println("Nombre antes del cambio: Fran -> " + personas[3].getNombre());
        System.out.println("Nombre después del cambio: Pepe -> " + personas[3].getNombre());

        // Mostrar por pantalla las personas mayor de 30 años
        System.out.println("Personas con edad mayor a 30 años:");
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
        }
    }
}
