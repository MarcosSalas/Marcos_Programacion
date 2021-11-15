package Ejercicio_array_base;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        int [] numeros= new int[10];

        Scanner lecturaTeclado = new Scanner(System.in);
        for (int i =0;i< numeros.length; i++){
            System.out.println("Introduce un a guardar:");
            int numero= lecturaTeclado.nextInt();
            numeros[i]=numero;






        }
        System.out.println("Orden inverso");

        for (int i =9;i > -1; i--){
          //  System.out.println(numeros[i]+"\t");
   //         System.out.println(numeros[i]+",");

            if (i==0){
                System.out.println(numeros[i]);
            }else if (i<=9){
                System.out.printf(numeros[i]+",");
            }


        }


        System.out.println("Orden normal");

        for (int i =0;i < numeros.length; i++){
          //  System.out.println(numeros[i]+"\t");


            if (i==9){
                System.out.println(numeros[i]);
            }else if (i>=0){
                System.out.printf(numeros[i]+",");
            }


        }

}


}
