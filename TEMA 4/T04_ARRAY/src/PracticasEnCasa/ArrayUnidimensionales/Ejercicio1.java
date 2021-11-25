package PracticasEnCasa.ArrayUnidimensionales;

public class Ejercicio1 {
    public static void main(String[] args) {
        int arrayGen[] = new int[5];

        for (int i = 0; i < arrayGen.length; i++) {
            arrayGen[i] = ((int) (Math.random() * (50 - 10 + 1) + 10));
            System.out.printf("Nro generado %d %n", arrayGen[i]);
        }


    }
}


/*
(LlenarArrays) Crear un array de int que tenga 5 posiciones
y rellenarla con números aleatorios del 10 al 50. Mostrar por pantalla todos los números generados.

Para obtener un número entero entre dos valores DESDE , HASTA, ambos incluidos, debemos usar la fórmula:
 (int)(Math.random()*(HASTA-DESDE+1)+DESDE);
Por ejemplo, para generar 5 números enteros al azar entre 8 y 15:
for(int i = 1; i<=5; i++)
     System.out.println((int)(Math.random()*(15-8+1)+8));



 */