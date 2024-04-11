public class Ejercicio1 {
    public static void main(String[] args) {
        //Crear un objeto de cada clase hija
        Mamifero mamifero = new Mamifero(1,"Perro",2,"Perro agua","Pienso",4,"viviparo","negro","campo");
        Ave ave = new Ave(2, "Águila", 10, "Plumaje", "Carnívoro", 2.5, "Planeo", "Marrón", "Aguileña");
        Reptil reptil = new Reptil(3, "Serpiente", 3, "Escamas", "Carnívoro", 2.0, "Escamas lisas", true, "Selva");
    //LLamar a los metodos
        mamifero.saludar();
        ave.saludar();
        reptil.saludar();
        //Crear un objeto tipo animal

        //Animal animal = new Animal(4, "Tigre", 7, "Pelaje", "Carnívoro");
        // animal = mamifero; // Esto dará error
        //Se intenta asignar un objeto de tipo Mamifero a un objeto de tipo Animal, lo cual no es posible directamente debido a la incompatibilidad de tipos
    }
}