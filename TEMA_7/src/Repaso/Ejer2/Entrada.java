package Repaso.Ejer2;

public class Entrada {
    public static void main(String[] args) {
        String palabra=null;

        System.out.println(palabra);


        try {
            palabra.length();

        } catch (NullPointerException e) {
            System.out.println("Palabra nula");
        } catch (Exception e) {
            System.out.println("Exeption gral");

        }

finally {
            System.out.println("Ejecucion OBLIGATORIA");
        }





    }


}
