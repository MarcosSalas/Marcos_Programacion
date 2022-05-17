package controller;

import com.google.gson.Gson;
import model.Asignaturas;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;

public class JSONController {

    String jsonString =  "{\n" +
            "  \"nombre\": \"Borja\",\n" +
            "  \"apellido\": \"Martin Herrera\",\n" +
            "  \"edad\": 38,\n" +
            "  \"hobbies\": [\n" +
            "    \"musica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informática\"\n" +
            "  ] }";

    public void pasar_Y_LeerString_a_JSON(){
       // System.out.println(jsonString); //Lo imprime sin estar convertido a JSON
        // DE STRING A JSON (org.json)
        JSONObject jsonObject= new JSONObject();
        jsonObject =new JSONObject(jsonString);
        // System.out.println(jsonObject); //ya convertido, nos damos Cuenta porque imprime en 1 SOLA LINEA(Texto plano, no ocupa nada)

        // ########### Accedo a c/u de las PROPIEDADES###############
                    //DOS OPCIONES DE DECLARACIÓN
        String nombre = jsonObject.getString("nombre");
        String nombre2= (String) jsonObject.get("nombre"); //lo mejor es no castear si tenemos la opción del getString
                    // declaraciones normales
        int edad = jsonObject.getInt("edad");

        JSONArray hobbiesArray = jsonObject.getJSONArray("hobbies");
        System.out.println("Tus hobbies son: ");
        for (int i = 0; i < hobbiesArray.length(); i++) {
            System.out.println(hobbiesArray.getString(i));   //## CUIDADO ,NO OLVIDAR
        }

        //###  VER CON BORJA, DICE QUE NO PERMITE PORQUE NO ES APLICABLE,SIN EMBARGO ME LO IMPRIME
        /*for (Object hobbiesList :hobbiesArray) {
            System.out.println(hobbiesList);
        }*/
        System.out.println();




                    //DOS OPCIONES DE IMPRESIÓN
        //System.out.println(jsonObject.getString("nombre"));
        System.out.println(nombre);
                    // impresiones normales
        System.out.println(edad);


    }

    public void leerFicheroJson(){
        File file= new File("src/main/resources/persona.json");
        BufferedReader bufferedReader=null;

        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            //FORMA DE LEER TODAS LAS LINEAS "APRENDER"
            String linea=null;
          //  String lineasGuardadas=null; // es una forma, pero hay otra forma mas linda que es el de abajo
            StringBuffer lineasGuardadas=new StringBuffer();
            while ((linea=bufferedReader.readLine())!=null) {
                // System.out.println(linea); acá no termina porque tengo que pasarlo a JSON, es decir 1 Linea
                //El sout de arriba sería solo pasado a String
                lineasGuardadas.append(linea); // cada vez que haga una vuelta anexa(Append) la linea a lineasGuardadas

            }

            JSONObject jsonObject1= new JSONObject(lineasGuardadas.toString());// el toString es para que devuelva en String lo que lee
            System.out.println("Json completo");
            System.out.println(jsonObject1);
            System.out.println();
            System.out.println("Json solo el conocimiento");
            JSONArray arrayConocimientos=jsonObject1.getJSONArray("conocimientos");
            System.out.println(arrayConocimientos);
            System.out.println();
            System.out.println("Todos los conocimientos -  Conocimiento a conocimiento");

            for (int i = 0; i < arrayConocimientos.length(); i++) {
                JSONObject conocimiento = arrayConocimientos.getJSONObject(i);

               /*
                //  System.out.println(conocimiento);
                System.out.println();
                System.out.println("Conceptos");
                String concepto = conocimiento.getString("concepto");
                System.out.println(concepto);
                int experiencia =conocimiento.getInt("experiencia");
                System.out.println("Experiencia");
                System.out.println(experiencia);

                JSONArray detalle= conocimiento.getJSONArray("detalle");
                System.out.println("Detalles: ");
                for (int j = 0; j < detalle.length(); j++) {
                    String detalleIndividual= detalle.getString(j);
                    System.out.println(detalleIndividual);
                }*/
              //Lo que viene DEBAJO es un RESUMEN más SENCILLO de lo mismo que está comentado arriba,Una vez que tengo creado el conocimiento de Arriba

          // ######### CONVIERTO de JSONObject a Gson(Es decir Objeto java)

                Gson gson= new Gson();
                Conocimiento conocimientoJava= gson.fromJson(conocimiento.toString(),Conocimiento.class);
                System.out.println("Ver conocimientos Convertidos a java --> "+conocimientoJava.getConcepto());
                System.out.println("Experiencia Conv. a java --> "+conocimientoJava.getExperiencia());
                //PARA EL ARRAY DETALLE SI QUE PUEDO UTILIZAR EL FOREACH ASI
                System.out.println("Detalle Conv. a java : ");
                for (String item:conocimientoJava.getDetalle()) {
                    System.out.println(item);
                }

                System.out.println();
            }




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    public void leerJSONAsignaturas(){
        File file = new File("src/main/resources/asignaturas.json"); //para leer un json que es un archivo como si fuera texto plano, necesitamos un BuferedReader
        BufferedReader bufferedReader= null;

        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            //DESDE AQUÍ HASTA
            String linea=null;
            StringBuffer stringBufferParaLeer= new StringBuffer();

            while ((linea=bufferedReader.readLine())!=null){
                stringBufferParaLeer.append(linea);
            }
            //AQUÍ, YA TENGO EL JSON LEÍDO, AHORA:

            //IMPRIMO Objet
            JSONObject jsonAsignaturas=new JSONObject(stringBufferParaLeer.toString());//necesito
           // System.out.println(jsonAsignaturas); // este ejemplo imprime el Object, nos damos cuenta porque empieza por {}
            //IMPRIMO ARRAY
            JSONArray arrayAsignaturas=jsonAsignaturas.getJSONArray("asignaturas");
           // System.out.println("Esta variable imprime el array \n "+arrayAsignaturas); //nos damos cuenta que imprimimos el array porque empieza por [], el ejemplo anterior imprime el Objet poque empieza por {}

            //CONVIERTO A JAVA
            for (int i = 0; i < arrayAsignaturas.length(); i++) {
            // JSONObject todasAsignaturasJSON=arrayAsignaturas.getJSONObject(i); Asi lo hice yo
            JSONObject todasAsignaturasJSON=arrayAsignaturas.getJSONObject(0); //Así lo hace él
            Gson gson= new Gson();
            Asignaturas asignaturasJava=gson.fromJson(todasAsignaturasJSON.toString(),Asignaturas.class);
              //  System.out.println(asignaturasJava);
                caracteristicasAsignatura(asignaturasJava); //llamo al método de abajo caracteristicas asignaturas y te paso asignaturasJava que es T@DO lo que viene de la clase Asignatura

            }
            /*
                Conocimiento conocimientoJava= gson.fromJson(conocimiento.toString(),Conocimiento.class);
                System.out.println("Ver conocimientos Convertidos a java --> "+conocimientoJava.getConcepto());
                System.out.println("Experiencia Conv. a java --> "+conocimientoJava.getExperiencia());
                //PARA EL ARRAY DETALLE SI QUE PUEDO UTILIZAR EL FOREACH ASI
                System.out.println("Detalle Conv. a java : ");
                for (String item:conocimientoJava.getDetalle()) {
                    System.out.println(item);
                }

                System.out.println();
            }

            */

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


//para usar este método ,no hace falta crear asignatura en el main ,sino que en el for i de convierto a JAVA lo puedo llamar
public void caracteristicasAsignatura(Asignaturas asignaturas){
    System.out.println(asignaturas.getCurso());
    System.out.println(asignaturas.getCiclo());
}

}
