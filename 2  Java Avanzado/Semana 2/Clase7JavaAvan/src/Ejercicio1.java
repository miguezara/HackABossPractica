public class Ejercicio1 {


    public static void main(String[] args) {
        ExploradorDirectorios explorador = new ExploradorDirectorios();

        Directorio raiz = new Directorio("Raiz");
        Directorio carpeta1 = new Directorio("Carpeta1");
        Directorio carpeta2 = new Directorio("Carpeta2");
        Directorio subcarpeta = new Directorio("Subcarpeta");

        raiz.agregarSubdirectorio(carpeta1);
        raiz.agregarSubdirectorio(carpeta2);
        carpeta1.agregarSubdirectorio(subcarpeta);
        carpeta1.agregarArchivo("Archivo1.txt");
        subcarpeta.agregarArchivo("Archivo2.txt");
        carpeta2.agregarArchivo("Archivo3.txt");

        explorador.explorarDirectorio(raiz);
    }
}

