package TEMA_5_POO;

import Tema_5_POO.Usuario;

public class Entrada {
    //ámbito global
    // String nombre= "Borja";

   public static void main(String[] args) {
        //ámbito local
        // String nombre= "Borja";
        Usuario usuario1 = new Usuario();

        //nombre="Por defecto",correoElectronico=Por defecto,password=null,fecha=null,edad,=19;

        Usuario usuario2 = new Usuario();

        //nombre=null,correoElectronico=null,password=null,fecha=null,edad,=null;

        Usuario usuario3 = new Usuario("Borja", "borja.martin@.es", "pass");
        //nombre=Borja,correoElectronico=borja.martin@.es,password=pass,fecha=null,edad,=null;

        Usuario usuario4 = new Usuario("Borja", "borja.martin@.es", 19);

        //   Usuario usuario5 = new Usuario("Borja","Martin","borja.martin@.es");  //no puede haber dos constructoctores con los mismos tipos de variables ,string ,strig, string, (si se puede,string ,int,string y otro int,string,string)//se repite,pero no tiene el mismo orden,eso si se puede

        // nombre correo y apellido

        //  usuario1.password="contraseña";
        //nombre=Por defecto,correoElectronico=Por defecto,password=contraseña,fecha=null,edad,=19;

        usuario1.setPassword("contraSeña");

        // System.out.println(usuario1.getPassword()); //este es el método con el nombre getPassword

       //usuario1.mostrarDatos();
       //System.out.println(usuario1.mostrarDatosRetorno());
       usuario4.saludar("Borja");
       usuario1.saludar("Luis");
        /*usuario1.saludar(usuario4);
        usuario3.saludar(usuario1);*/


    }

}
