package Tema5_Ejercicios.Ejercicios_md.Base;

public class Ejer0 {
    public static void main(String[] args) {
        Motor motorGasoil= new Motor(150,1000);
        Motor motorGasolina= new Motor(120,500);

        Coche cocheGasolina= new Coche("Ford","Fiesta",new Motor(120, 500));
        Coche cocheGasoil= new Coche("Opel","Corsa",new Motor(150, 1000));

     //   System.out.println(cocheGasoil.getMotor().getCv());
        /*System.out.println(cocheGasoil.getCosteAverias());
        cocheGasoil.acumularAveria(900);
        cocheGasoil.acumularAveria(900);
        System.out.println(cocheGasoil.getCosteAverias());*/
        Garaje garaje=new Garaje();
        //coche =null//coche

     if (garaje.aceptarCoche(cocheGasoil,"aceite"){
            System.out.println("Coche aceptado");
        }else{
            System.out.println("Garaje ");
        }


    }

}
