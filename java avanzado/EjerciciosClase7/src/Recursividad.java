public class Recursividad {

    public static void main(String[] args) {
        Recursividad recursividad = new Recursividad();

        // Ejercicio 1: Imprimir números
        System.out.println("Ejercicio 1: Imprimir números");
        recursividad.imprimir(1);
        System.out.println();

        // Ejercicio 2: Sumar números
        System.out.println("Ejercicio 2: Sumar números");
        System.out.println("Suma hasta 6: " + recursividad.sumar(6));
        System.out.println("Suma hasta 5: " + recursividad.sumar(5));
        System.out.println();

        // Ejercicio 3: Factorial de un número
        System.out.println("Ejercicio 3: Factorial de un número");
        System.out.println("Factorial de 5: " + recursividad.factorial(5));
        System.out.println("Factorial de 4: " + recursividad.factorial(4));
    }

    // Ejercicio 1: Imprimir números desde el número dado hasta 5
    public void imprimir(int numero) {
        if (numero <= 5) {
            System.out.print(numero + " ");
            imprimir(numero + 1);
        }
    }

    // Ejercicio 2: Sumar números naturales hasta n
    public int sumar(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumar(n - 1);
        }
    }

    // Ejercicio 3: Calcular el factorial de un número
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
