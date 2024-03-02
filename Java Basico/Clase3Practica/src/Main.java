public class Main {
    public static void main(String[] args) {
        //Crear array
       Verdura[] verduras = new Verdura[5];

       //Crear 5 verduras y almacenarlas
        verduras[0] = new Verdura(1,"Lechuga","Verde",15,false);
        verduras[1] = new Verdura(2,"Pimiento","Rojo",10,false);
        verduras[2] = new Verdura(3,"Berenjena","Morada",20,true);
        verduras[3] = new Verdura(4,"Brocoli","Verde",25,true);
        verduras[4] = new Verdura(5,"Zanahoria","Naranaja",5,true);

        //Recorrer el vector y mostrar por pantalla
        System.out.println("Verduras almacenadas");
        for (Verdura verdura : verduras ) {
            System.out.println("Nombre: " +verdura.getNombre() + ", Caloria: " +verdura.getCalorias());
        }
        //Cambiar datos de las verduras
        verduras[1].setNombre("Pimiento");
        verduras[1].setColor("Verde");
        verduras[1].setCalorias(18);
        verduras[1].setDebeCocinarse(false);

        verduras[3].setNombre("Calabaza");
        verduras[3].setColor("Naranja");
        verduras[3].setCalorias(40);
        verduras[3].setDebeCocinarse(true);

        //Mostrar cambio de verduras
        System.out.println("Verduras cambio:");
        for(Verdura verdura : verduras){
            System.out.println("Nombre: " + verdura.getNombre() + ", Color: " + verdura.getColor() +
                    ", Calorías: " + verdura.getCalorias() + ", ¿Debe cocinarse? " + verdura.isDebeCocinarse());
        }
        // Mostrar por pantalla las verduras que sean de color verde
        System.out.println("Verduras de color verde:");
        for (Verdura verdura : verduras) {
            if (verdura.getColor().equalsIgnoreCase("verde")) {
                System.out.println("Nombre: " + verdura.getNombre() + ", Color: " + verdura.getColor());
            }
        }
    }
}

