import controller.ControllerEjer1;

import java.io.File;

public class Entrada {
    public static void main(String[] args) {

        File file= null;

        file =new File("src/main/java/resourses/fichero_cifrado.txt");

        ControllerEjer1 controllerEjer1 = new ControllerEjer1();
        controllerEjer1.lectura(file);

    }

}
