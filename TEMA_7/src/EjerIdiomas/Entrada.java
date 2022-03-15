package EjerIdiomas;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {


Idiomas castellano=new Idiomas("Castellano",100) {
    @Override
    public void saludar() {
        System.out.println("saludo en español ,castellano");

        System.out.println("El saludo en "+getNombre()+"es "+getArraylistPalabra().get(0) );

    }

    @Override
    public void despedir() {
        System.out.println("despedir en español ,castellano");
    }
};

        Idiomas ingles=new Idiomas("Ingles",300) {
    @Override
    public void saludar() {

    }

    @Override
    public void despedir() {

    }
};

        Idiomas aleman=new Idiomas("Aleman",150) {
    @Override
    public void saludar() {

    }

    @Override
    public void despedir() {

    }
};
      ArrayList listarIdioma=new ArrayList();
      listarIdioma.add(castellano);
      listarIdioma.add(ingles);
      listarIdioma.add(aleman);


        /*

Crea un ArrayList de idiomas donde se metan los tres definidos anteriormente

Añade unas cuantas palabras a la lista del idioma castellano

Añade unas cuantas palabras a la lista del idioma inglés

Añade unas cuantas palabras a la lista del idioma alemán

Saca por pantalla el saludo en los tres idiomas con el siguiente formato. El saludo en XXX es: XXX

Saca por pantalla la despedida en los tres idiomas con el siguiente formato. La despedida en XXX es: XXX

Lista por pantalla las palabras de todos los idiomas

        */








    }

}
