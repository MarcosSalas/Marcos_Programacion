package ArrayLi;

public class EjerPalindroHechoCasa {
    public static void main(String[] args) {
        String frase="Alli ve Sevilla";

        frase=frase.replaceAll(" " ,"").toLowerCase();
        for (int i = 0; i < frase.length()/2; i++) {
            System.out.println(frase.charAt(i)); //imprimo para ir visualizando lo que voy haciendo

            if (frase.charAt(i)==frase.length()-1-i) {
            }


        }


    }
}
