import controller.ControllerBD;

public class Main {

    public static void main(String[] args) {
        ControllerBD controllerBD = new ControllerBD();
        controllerBD.insertarPerfiles();
        System.out.println("Insertados correctamente");
    }
}