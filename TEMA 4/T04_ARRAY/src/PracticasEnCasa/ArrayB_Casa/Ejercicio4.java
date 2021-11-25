package PracticasEnCasa.ArrayB_Casa;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[]numero=new int[20];
        int[]cuadrado=new int[20];
        int[]cubo=new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] =(int) (Math.random()*101) ;
        }
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);

        }
        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3);
        }

        for (int i = 0; i < numero.length; i++) {

            System.out.printf("Nro %d \t  Cuadrado %d \t  Cubo %d%n",numero[i],cuadrado[i],cubo[i]);

        }



    }
}


