package Electrodomesticos;

public class Electrodomestico {


    //Atributos


    private int Cod;
    private String Marca;
    private String Modelo;
    private double Consumo;
    private String Color;


    //Constructores


    public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
        this.Cod = cod;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Consumo = consumo;
        this.Color = color;
    }
    public Electrodomestico() {

    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int cod) {
        Cod = cod;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getConsumo() {
        return Consumo;
    }

    public void setConsumo(double consumo) {
        Consumo = consumo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

}





