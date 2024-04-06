import java.util.ArrayList;
import java.util.Scanner;

public class C6Ejercicio1 {

    public static void main(String[] args) {
        //Declaramos una lista de alumnos
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        //Variables para datos del estudiante
        int id;
        String nombre;
        Double nota;
        Scanner scanner = new Scanner(System.in);

        //Solicitar el primer id del estudiante
        System.out.println("Ingrese el id del estudiante");
        id = scanner.nextInt();
        //Bucle para solicitar N datos de estudiantes
        while (id > 0){
            //Solicito nombre y nota
            System.out.println("Ingrese el nombre");
            nombre = scanner.next();
            System.out.println("Ingre la nota");
            nota = scanner.nextDouble();

            //Creo un objeto de la clase: Estudiante y agrego a la lista
            estudiantes.add(new Estudiante(id, nombre, nota));

            System.out.println("Ingrese el id del estudiante");
            id = scanner.nextInt();
        }

        //Recorrer la lista de estudiantes y acumular la nota
        Double sumaNotas = 0.0;
        for (Estudiante estudiante : estudiantes){
            sumaNotas+= estudiante.getNota();
        }

        //Calcular y mostrar el promedio
        Double promedio = sumaNotas / estudiantes.size();
        System.out.println("El promedio es: "+promedio);
    }

}