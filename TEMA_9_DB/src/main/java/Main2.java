import DataBase.SchemeDB;
import controller.ControllerBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args) {

        /*MIN 34:38 del video*/
        ControllerBD controllerBD =new ControllerBD();

        /*#ITEM 4 -- LO NORMAL ES,QUE QUIEN ABRA Y CIERRE LA CONECCION SEA LA CONTRLADORA Y NO EL MAIN */
            //    controllerBD.getConecion();
            /*En el min 33:43 esta como publico el método close y luego pasa a privado*/
            //  controllerBD.closeConnection();



    }
}
