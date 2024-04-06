class SocioHabilitado extends Socio {
    private double costoPileta;
    private boolean habilitado;

    // Constructor de la clase SocioHabilitado
    public SocioHabilitado(int numeroSocio, String nombre, double cuotaMensual, String actividad,
                           double costoPileta, boolean habilitado) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.habilitado = habilitado;
    }

    // Sobrescritura del método costoMensual de la clase madre Socio
    @Override
    public double costoMensual() {
        // Se suma el costo de la cuota mensual y, si está habilitado, el costo de la pileta
        double costoTotal = super.costoMensual();
        if (habilitado) {
            costoTotal += costoPileta;
        }
        return costoTotal;
    }
}

