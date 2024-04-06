public class Socio {

        private int numeroSocio;
        private String nombre;
        private double cuotaMensual;
        private String actividad;

        // Constructor de la clase Socio
        public Socio(int numeroSocio, String nombre, double cuotaMensual, String actividad) {
            this.numeroSocio = numeroSocio;
            this.nombre = nombre;
            this.cuotaMensual = cuotaMensual;
            this.actividad = actividad;
        }

        // Método para obtener el costo mensual
        public double costoMensual() {
            return cuotaMensual;
        }
    }
