package PracticasEnCasa.ArrayB_Casa;

public class Ejercicio6 {

    public static void main(String[] args) {

        int arrayNro[] = new int[20];
        int cont6 = 0, cont7 = 0, cont20 = 0;
        int i;

        for (i = 0; i < arrayNro.length; i++) {
            arrayNro[i] = (int) (Math.random() * 31);
        }
        for ( i = 0; i < arrayNro.length; i++) {
            System.out.printf("Nro de la fila %d es  %d %n", i + 1, arrayNro[i]);

            if (arrayNro[i] == 6) {
                arrayNro[i] = 8;
                cont6++;
            }
            else if (arrayNro[i] == 7) {
                arrayNro[i] = 15;
                cont7++;
            }
            else if (arrayNro[i] == 20) {
                arrayNro[i] = 10;
                cont20++;
            }
        }

        System.out.printf("El contador 6 tiene %d modificación %n", cont6);
        System.out.printf("El contador 7 tiene %d modificación %n", cont7);
        System.out.printf("El contador 20 tiene %d modificación %n", cont20);
    }
}

/*
6. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30. Una vez hecho esto realizará las siguientes operaciones:
	- modificar todos los 6 por 8
	- modificar todos los 7 por 15
	- modificar todos los 20 por 10

Al finalizar el programa deberá indicar cuántas modificaciones se han realizado.

 */