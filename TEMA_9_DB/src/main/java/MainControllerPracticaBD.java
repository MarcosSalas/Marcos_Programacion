import controller.ControllerCreacionBD_Practica;


public class MainControllerPracticaBD {
    public static void main(String[] args) {
        ControllerCreacionBD_Practica controllerCreacionBD_practica = new ControllerCreacionBD_Practica();

      //  controllerCreacionBD_practica.insertarPerfiles();
     //   System.out.println("perfiles insertados");

        controllerCreacionBD_practica.insertarUsuarios();
        System.out.println("usuarios insertados");


    }

}
