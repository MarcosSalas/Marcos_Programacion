package EjerRepasoClassRoom.Excepciones.Ejer1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        int numUsuario = 0;
        int nroIntroducido = 0;
        int aleatoreo = (int) (Math.random() * 6);
        Scanner ingTexto = new Scanner(System.in);


        do {
            try {
            System.out.println("Ingrese el nro");
            ingTexto=new Scanner(System.in);
            numUsuario = ingTexto.nextInt();
            
        }catch(InputMismatchException e) {
                System.out.println(e.getMessage());
        }


        } while (nroIntroducido!=aleatoreo);




    }
}
