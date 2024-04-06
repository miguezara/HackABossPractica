public class Dermatologo extends Medico implements CalculoHonorario{
    private Double importeMedicamentos;

    public Dermatologo(int id, String matricula, String nombre, Double importeBasico, Double importeMedicamentos) {
        super(id, matricula, nombre, importeBasico);
        this.importeMedicamentos = importeMedicamentos;
    }

    @Override
    public Double calcularHonorario() {
        return this.getImporteBasico() + importeMedicamentos;
    }
}
