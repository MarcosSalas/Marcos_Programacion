package Repaso.Ejer1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaAleatorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int numeroIntroducido = 0;
        int aleatorio = (int) (Math.random() * 6);
        System.out.println(aleatorio);

        do {

            try {
                System.out.println("Introduce numero a jugar");
                scanner = new Scanner(System.in);
                numeroIntroducido = scanner.nextInt();
                if (numeroIntroducido < 0) {
                    throw new ExceptionNumero("Numero inferior a 0");
                }
            } catch (InputMismatchException | ExceptionNumero e) { // De donde sale este  ### NUNullPointerException
                System.out.println(e.getMessage());                 //EL InputMismatchException se que sale de la letra
            } finally {
                intentos++;
            }

        } while (numeroIntroducido != aleatorio);

        System.out.println("Numero acertado en "+intentos+" intentos");
    }
}