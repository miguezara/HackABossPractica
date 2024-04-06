public class Cardiologo extends Medico implements CalculoHonorario{
    private Double importeEstudios;

    public Cardiologo(int id, String matricula, String nombre, Double importeBasico, Double importeEstudios) {
        super(id, matricula, nombre, importeBasico);
        this.importeEstudios = importeEstudios;
    }


    @Override
    public Double calcularHonorario() {
        return this.getImporteBasico() + importeEstudios;
    }
}
