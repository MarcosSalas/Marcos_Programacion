package ArrayLi;

public class EjercioPalindromo {
    public static void main(String[] args) {

        String frase="Alli ve Sevilla";
        boolean palindromo=false;
        frase=frase.replaceAll(" ", "").toLowerCase();      //toda la frase en minuscula sin espacio, hay que ponerlo en frase=
                                                                            // delante para que guarde los valores
        for (int i = 0; i < frase.length()/2; i++) {// solo salen la mitad de las letras
            System.out.println(frase.charAt(i));// EL CHARAT NOS PERMITE SACAR DE UNA CADENA DE STRING CARACTER A CARACTER
                                                  //solo comparamos con la longitud impar, si es par le agrego  La "S" no se compara porque es intermedia

            if (frase.charAt(i) == frase.charAt(frase.length() - 1 - i)) {
               // System.out.printf("ver %s %n ",frase.charAt(i));                                      **PARA VISUALIZAR LETRA A LETRA DE DELANTE HACIA EL ULTIMO
               // System.out.printf("ver2 %s %n ",frase.charAt(frase.length()-1-i));                    **PARA VISUALIZAR LETRA A LETRA DEL ULTIMO AL DE ADELANTE
                palindromo = true;

            } else {
                palindromo= false;
                break;
            }

        }
        if (palindromo) {
            System.out.println("La palabra es palíndromo");
        } else {
            System.out.println("La palabra no es palíndromo");
        }



    }
}
