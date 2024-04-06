public abstract class FiguraGeometrica {
    //Atributos

    private int id;
    private String color;
    private String coordenadas;
    public FiguraGeometrica(int id, String color, String coordenadas) {
        this.id = id;
        this.color = color;
        this.coordenadas = coordenadas;
    }

    public abstract double calcularArea();

}
