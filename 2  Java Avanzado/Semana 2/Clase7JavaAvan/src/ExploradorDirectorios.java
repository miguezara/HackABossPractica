public class ExploradorDirectorios {

        public void explorarDirectorio(Directorio directorio) {
            explorarDirectorio("", directorio);
        }

        private void explorarDirectorio(String espacio, Directorio directorio) {
            System.out.println(espacio + directorio.nombre + "/");
            for (String archivo : directorio.archivos) {
                System.out.println(espacio + "  - " + archivo);
            }
            for (Directorio subdirectorio : directorio.subdirectorios) {
                explorarDirectorio(espacio + "  ", subdirectorio);
            }
        }
}
