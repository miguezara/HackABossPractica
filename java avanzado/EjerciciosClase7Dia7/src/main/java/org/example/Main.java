package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Ejercicio 1
        //Recursividad recursividad1 = new Recursividad();
        //recursividad1.imprimir(8);


        //Ejercicio 2
        /*Recursividad recursividad2 = new Recursividad();
        int suma = recursividad2.sumar(3);
        System.out.println("Suma: "+suma);*/

        //Ejercicio 3
        /*Recursividad recursividad3 = new Recursividad();
        int factorial = recursividad3.factorial(1);
        System.out.println("Factorial: "+factorial);*/

        //Ejercicio 4
        /*ClaseRecursiva<Integer> claseRecursiva1 = new ClaseRecursiva<>();
        Integer[] vector1 = {2,4,6,8};
        claseRecursiva1.mostrarContenidoArray(vector1, 0);

        ClaseRecursiva<String> claseRecursiva2 = new ClaseRecursiva<>();
        String[] vector2 = {"A","B","C"};
        claseRecursiva2.mostrarContenidoArray(vector2, 0);*/


        //Ejercicio 5
        Menu menuPrincipal = new Menu(1, "Menu PRINCIPAL");

        List<Menu> listMenus1 = Arrays.asList(
                new Menu(2, "Menu11->Nivel1"),
                new Menu(3, "Menu12->Nivel1"),
                new Menu(4, "Menu13->Nivel1")
        );
        menuPrincipal.setMenuList(listMenus1);

        List<Menu> listMenus2 = Arrays.asList(
                new Menu(5, "Menu121->Nivel2"),
                new Menu(6, "Menu122->Nivel2")
        );
        menuPrincipal.getMenuList().get(1).setMenuList(listMenus2);

        List<Menu> listMenus3 = Arrays.asList(
                new Menu(7, "Menu131->Nivel2")
        );
        menuPrincipal.getMenuList().get(2).setMenuList(listMenus3);

        List<Menu> listMenus21 = Arrays.asList(
                new Menu(8, "Menu1211->Nivel3")
        );
        menuPrincipal.getMenuList().get(1).getMenuList().get(0).setMenuList(listMenus21);

        /*System.out.println(menuPrincipal.getMenuList().get(0));
        System.out.println(menuPrincipal.getMenuList().get(1));
        System.out.println(menuPrincipal.getMenuList().get(2));*/

        //Llama a un metodo RECURSIVO
        mostrarMenus(menuPrincipal);

    }

    public static void mostrarMenus(Menu menu){
        System.out.println("Menú: "+menu.getDescripcion());
        for (Menu menuHijo : menu.getMenuList()){
            mostrarMenus(menuHijo);
        }
    }
}