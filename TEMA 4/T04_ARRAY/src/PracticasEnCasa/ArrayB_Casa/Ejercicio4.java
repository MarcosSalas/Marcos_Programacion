package PracticasEnCasa.ArrayB_Casa;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[]numero=new int[20];
        int[]cuadrado=new int[20];
        int[]cubo=new int[20];
        int nroRand = (int) (Math.random()*100);

     int i;
        for (i = 0; i<20; i++) {
             numero[i]=nroRand;
        }
        for (i = 0; i<20; i++) {
            numero[i]=nroRand;
            System.out.printf("%");
        }


    }
}




    /*

    Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.

        En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
        En el array cubo se deben almacenar los cubos de los valores que hay en numero.
        Una ver realizado lo anterior muestra el contenido de los tres arrays dispuesto en tres columnas.

                    double rdoPotencia=cuadrado[i];
            rdoPotencia= Math.pow (potencia,2);
        */