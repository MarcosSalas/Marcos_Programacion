package PracticasEnCasa.ArrayUnidimensionales;

public class EjercicioPrueba {
    public static void main(String[] args) {
        int arrayPrueba [][]= {
                                    {12,13,15,11,22},
                                    {14,54,52,65,21},
                                    {20,60,53,32,22},
                                    {89,85,87,83,82}
                                    };

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j <5 ; j++) {
                System.out.println(arrayPrueba[i][j]+ " ");
                
            }
        }

    }
}
