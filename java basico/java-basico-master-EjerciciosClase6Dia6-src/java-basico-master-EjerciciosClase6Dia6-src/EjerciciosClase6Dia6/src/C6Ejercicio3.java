import java.util.ArrayList;
import java.util.List;

public class C6Ejercicio3 {

    public static void main(String[] args) {
        Cardiologo cardiologo = new Cardiologo(1,"11","Juan",90.00,30.00);
        Cirujano cirujano = new Cirujano(2,"22","Jose",120.00,50.00);
        Dermatologo dermatologo = new Dermatologo(3,"33","Alberto",180.00,70.00);

        //Agregar médicos al listado
        List<Medico> medicos = new ArrayList<>();
        medicos.add(cardiologo);
        medicos.add(cirujano);
        medicos.add(dermatologo);
        for(Medico medico : medicos){
            System.out.println("Calculo honorarios: "+medico.calcularHonorario());

            //Si no se implementa la interface en la clase: Medico
            //Hacer un casting a la interface para acceder al metodo: calcularHonorario() que No tiene Medico
            //Forma 1
            //CalculoHonorario calculo = (CalculoHonorario) medico;
            //System.out.println("Calculo honorarios: "+calculo.calcularHonorario());
            //Forma 2
            //System.out.println("Calculo honorarios: "+((CalculoHonorario) medico).calcularHonorario());
        }

    }


}
