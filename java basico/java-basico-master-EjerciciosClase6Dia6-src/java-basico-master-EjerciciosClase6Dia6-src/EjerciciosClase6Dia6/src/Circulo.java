public class Circulo extends FiguraGeometrica{
    //Atributos
    private int radio;

    public Circulo(int id, String color, String coordenadas, int radio) {
        super(id, color, coordenadas);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return 3.14 * (radio*radio);
    }

    public int getRadio() {
        return radio;
    }
}
