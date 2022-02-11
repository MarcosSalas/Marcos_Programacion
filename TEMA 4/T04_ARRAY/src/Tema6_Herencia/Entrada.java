package Tema6_Herencia;

public class Entrada {
    public static void main(String[] args) {
       /* Coche coche = new Coche("1234","23",100,2000); //Esto en el futuro no lo vamos a querer permitir y en la clase coche va a tener que ser tipada abstract
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());*/
        Deportivo deportivo =new Deportivo("234b","234",200,2500,600);
        System.out.println(deportivo.getMatricula());
        deportivo.calcularVelocidad(120);
        System.out.println(deportivo.getVelocidad());
        Electrico electrico=new Electrico("234b","234",200,2500,256);


        //PONER COCHE.... BORRADO CORRECTAMENTE
        // SI NO ENCUENTRO LA MATRICULA ,COCHE NO ENCONTRADO
        // si quiero agregar un coche tengo que poner los valores del coche y el concesionario para poder utilizar la clase conces
        Concesionario concesionario=new Concesionario();
        Utilitario utilitario=new Utilitario("234b","234",200,2500,256);





    }
}
