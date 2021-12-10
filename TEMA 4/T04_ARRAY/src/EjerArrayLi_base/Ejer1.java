package EjerArrayLi_base;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1 {


    public static void main(String[] args) {
        ArrayList <String>acciones=new ArrayList<>();
        Scanner ingresoTexto=new Scanner(System.in);

        acciones.add("PEDRO");
        acciones.add("JUAN");
        acciones.add("MARIA");
        acciones.add("RAQUEL");
        acciones.add("RAUL");
        acciones.add("JACINTA");
        acciones.add("MATIAS");
        acciones.add("MARIO");
        acciones.add("CELESTE");
        acciones.add("EZEQUIEL");
        System.out.println(acciones);
    }

}