package PracticasEnCasa.ArrayUnidimensionales;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        double acumSuma=0.00;
        double media=0.00;
        double multiArray[]=new double[5];
        Scanner ingreElement = new Scanner (System.in);

        for (int i = 0; i < multiArray.length; i++) {
            System.out.printf("ingrese el elemento %d a multiplicar %n",i+1);
            multiArray[i]= ingreElement.nextDouble();
        }
        System.out.println();
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i]=(multiArray[i]*2);
            System.out.printf("elementos %d ya multiplicado = %.0f  %n",i+1,multiArray[i]);
            acumSuma=acumSuma+multiArray[i];

        }
        System.out.println();
        media=acumSuma/multiArray.length ;
        System.out.printf("suma de todos los elementos multiplicados %.0f %n",acumSuma);
        System.out.printf("media de todos los elementos %.2f %n",media);

    }

}
/*
(MultiplicarArray) Crear un array de 5 posiciones:

se le pedirá al usuario que introduzca cada unos de los elementos del array
Multiplica cada elemento del array * 2 y vuelve a guardar su valor
Saca por consola la suma de todos los números
Saca la media de todos los elementos
 */
