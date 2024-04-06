public class Cuadrado extends FiguraGeometrica {
    //Atributos
    private int lado;

    public Cuadrado(int id, String color, String coordenadas, int lado) {
        super(id, color, coordenadas);
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
}
