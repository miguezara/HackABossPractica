public class Rectangulo extends FiguraGeometrica {
    //Atributos
    private int ladoA;
    private int ladoB;

    public Rectangulo(int id, String color, String coordenadas, int ladoA, int ladoB) {
        super(id, color, coordenadas);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea(){
        return ladoA * ladoB;
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }
}
