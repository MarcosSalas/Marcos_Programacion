package PracticasEnCasa.ArrayB_Casa;

public class Ejercicio2 {
    public static void main(String[] args) {
        int NRO=30;
        int nroRam=(int)(Math.random()*10);
        int suma=0;

        int []array1= new int[29];

        for (int i = 0; i < array1.length; i++) {
            array1[i]=nroRam;
            suma+=nroRam;

        }


        System.out.printf("puntos %d%n media %d" , suma,(suma/ array1.length));

        //si o si para ocupar el valor del array y compararlo tiene que ser con el length si solo ponemos el nombre del array no funciona
    }

}
