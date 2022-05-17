package Ficheros_Binarios;

import Ficheros_Binarios.controller.BinariosController;
import Ficheros_Binarios.model.Usuario;

public class Main {
    public static void main(String[] args) {

        BinariosController controller=new BinariosController();
     //   controller.escribirBinario();
        controller.lecturaBinario();

    }
}
