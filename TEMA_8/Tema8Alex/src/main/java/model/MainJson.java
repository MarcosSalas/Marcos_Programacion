package model;

import controller.ControllerJson;

import java.util.Scanner;

public class MainJson {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("elige (1= estrenos / 2 = proximo)");
        opcion=scanner.nextInt();*/

        ControllerJson controllerJson = new ControllerJson();
        controllerJson.lecturaJSON();

    }

}
