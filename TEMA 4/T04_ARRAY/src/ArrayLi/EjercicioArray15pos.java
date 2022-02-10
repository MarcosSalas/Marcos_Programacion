package ArrayLi;

public class EjercicioArray15pos {

    public static void main(String[] args) {

        int[] numeros = new int[15];
        numeros[0] = (int) (Math.random() * 50);


        for (int i = 0; i < 15; i++) {
            numeros[i] = (int) (Math.random() * 50);


            System.out.printf("el nro%d %n", i);
        }

        int numeroPares = 0, numeroIares = 0;
        for (int i = 0; i < 15; i++) {
            if (numeros[i] % 2 == 0) {
                numeroPares++;

            } else {
                numeroPares++;
            }
        }


    }


}





