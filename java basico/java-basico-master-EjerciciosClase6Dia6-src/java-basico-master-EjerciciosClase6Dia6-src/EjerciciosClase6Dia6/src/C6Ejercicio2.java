import java.util.ArrayList;
import java.util.List;

public class C6Ejercicio2 {


    public static void main(String[] args) {
        //Se crean distintas figuras geometricas
        Circulo circulo = new Circulo(1,"Rojo","12233",5);
        Cuadrado cuadrado = new Cuadrado(2,"Azul","45554",2);
        Rectangulo rectangulo = new Rectangulo(3,"Celeste", "666868",2,3);

        //Declarar e inicializar la lista de figuras geometricas
        List<FiguraGeometrica> figuras = new ArrayList<>();
        //Agregar figuras al listado
        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(rectangulo);
        figuras.add(new Circulo(4,"Celeste","455",6));

        //Recorrer el listado y mostrar el calculo del area
        for(FiguraGeometrica figura : figuras){
            if (figura instanceof Circulo){
                Circulo unCirculo = (Circulo) figura;
                System.out.println("Radio: "+unCirculo.getRadio());
            }else if (figura instanceof Rectangulo){
                Rectangulo unRectangulo = (Rectangulo) figura;
                System.out.println("Lado A: "+unRectangulo.getLadoA()+ "Lado B: "+rectangulo.getLadoB());
            }
            System.out.println("Area: "+figura.calcularArea());
        }

    }
}