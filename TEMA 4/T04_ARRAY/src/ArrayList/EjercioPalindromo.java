package ArrayList;

public class EjercioPalindromo {
    public static void main(String[] args) {

        String frase="Alli ve Sevilla";
        boolean palindromo=false;
        frase=frase.replaceAll(" ", "").toLowerCase();      //toda la frase en minuscula sin espacio, hay que ponerlo en frase=
                                                                            // delante para que guarde los valores
        for (int i = 0; i < frase.length()/2; i++) {
            System.out.println(frase.charAt(i));// solo salen la mitad de las letras RECORDAR EL CHARAT PARA ESO!!
                                                  //solo compramos con la longitud impar, si es par le agrego

            if (frase.charAt(i) == frase.charAt(frase.length() - 1 - i)) {
                palindromo = true;

            } else {
                palindromo= false;
                break;
            }

        }
        if (palindromo) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }



    }
}
