
    class Pantalon extends Vestimenta {
        private String estilo;
        private String tipoTejido;

        // Constructor
        public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color,
                        String estilo, String tipoTejido) {
            super(codigo, nombre, precio, marca, talla, color);
            this.estilo = estilo;
            this.tipoTejido = tipoTejido;
        }

        // Método para mostrar el estilo de los pantalones
        public void mostrarEstilo() {
            System.out.println("Estos pantalones son de estilo: " + estilo);
        }
    }


