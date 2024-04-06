public class Cirujano extends Medico implements CalculoHonorario{
    private Double honorarioAyudantes;


    public Cirujano(int id, String matricula, String nombre, Double importeBasico, Double honorarioAyudantes) {
        super(id, matricula, nombre, importeBasico);
        this.honorarioAyudantes = honorarioAyudantes;
    }

    @Override
    public Double calcularHonorario() {
        return this.getImporteBasico() + honorarioAyudantes;
    }
}
