package Ejercicio_array_base;

public class Ejercicio6 {
    public static void main(String[] args) {

        int[] aleatorio = new int[20];
        int numero = 0;
        int sumaModificaciones = 0;
        double media = 0;


        for (int i = 0; i < aleatorio.length; i++) {

            if (aleatorio[i] == 6) {
                aleatorio[i] = 8;
                sumaModificaciones++;
            } else if (aleatorio[i] == 7) {
                aleatorio[i] = 15;
                sumaModificaciones++;
            } else if (aleatorio[i] == 20) {
                aleatorio[i] = 10;
                sumaModificaciones++;

            }
        }
        System.out.printf("El numero de modificaciones es : %d%n",sumaModificaciones);

    }
}
