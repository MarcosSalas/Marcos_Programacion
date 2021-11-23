package PracticasEnCasa.ArrayB_Casa;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    int arrayIngre[]=new int[8];

    
    Scanner ingresaNro=new Scanner(System.in);

        for (int i = 0; i < arrayIngre.length ; i++) {
            System.out.printf("ingrese el nro %d %n",i+1);
            arrayIngre[i]= ingresaNro.nextInt();

            }


        for (int i = 0; i <arrayIngre.length; i++) {


            if (arrayIngre[i]%2==0){
                System.out.printf("es par %d %n",arrayIngre[i]);

            }else{
                System.out.printf("es impar %d %n",arrayIngre[i]);
        }




        }
    

    }

}
