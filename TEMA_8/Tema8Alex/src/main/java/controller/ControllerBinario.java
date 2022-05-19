package controller;

import model.Personaje;

import java.io.*;

public class ControllerBinario {
    Personaje personaje = null;

    public void mostrarDatos() {
        System.out.println("nombre " + personaje.getName());
        System.out.println("foto " + personaje.getPhoto());
    }

    public void lecturaBin() {
        File file = new File("src/main/resources/personajes.bin");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            while ((personaje = (Personaje) ois.readObject()) != null) {
                mostrarDatos();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
