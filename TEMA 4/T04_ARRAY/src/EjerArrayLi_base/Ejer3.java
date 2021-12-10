package EjerArrayLi_base;

import java.util.ArrayList;

public class Ejer3 {
    public static void main(String[] args) {
        ArrayList<String>listaCompanieros=new ArrayList<>();
        listaCompanieros.add("borja1");
        listaCompanieros.add("borja2");
        listaCompanieros.add("borja3");
        listaCompanieros.add("borja4");
        listaCompanieros.add("borja5");
        listaCompanieros.add("borja6");

        int aleatorio=(int)(Math.random()*listaCompanieros.size());
        System.out.println(listaCompanieros.get(aleatorio));


    }
}
