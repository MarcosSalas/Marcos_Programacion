package Tema5_Ejercicios.Ejercicios_md.CarreraCompleta;

public class Entrada {
    public static void main(String[] args) {

        int kmEtapa = 10000;
        Coche coche = new Coche();
        Coche coche1 = new Coche("Astra", "KRE4833", 110);

        do {

            coche.setModelo("leon");
            coche.setMatricula("KEW4286");
            coche.setCaballos(125);
            coche.setVelocidad((int) (Math.random() * (31 - 10) + 10));    //      System.out.println("Números generados entre 5 y 20, con decimales (sin incluir el 5 y el 20)");
            // System.out.println("coche vel " + coche.getVelocidad());  //      int numAleatorio=Math.random()*(20-5)+5;
            coche1.setVelocidad((int) (Math.random() * (31 - 10) + 10));
            // System.out.println("coche B velocidad " + coche1.getVelocidad());
            //     coche.mostrarDatos();
            //   coche1.mostrarDatos();


            coche.acelerar(10); // primero le paso los valores del método
            coche1.acelerar(12);
         } while (coche.getKilometros() <= kmEtapa || coche1.getKilometros() <= kmEtapa);


        System.out.println("velocidad coche 1 " + coche.getKilometros()); //luego llamo a la parte del método que me interesa
        System.out.println("velocidad coche 2 " + coche1.getKilometros());
        if (coche.getKilometros() > coche1.getKilometros()) {
            System.out.println("el ganador es coche 1, " + coche.getModelo() + ", Matrícula " + coche.getMatricula() + ", con " + coche.getKilometros() + " recorridos");
        } else {
            System.out.println("el ganador es coche 2, " + coche1.getModelo() + ", Matrícula " + coche1.getMatricula() + ", con " + coche1.getKilometros() + " recorridos");

        }


    }
}
