package controller;

import com.google.gson.Gson;
import model.Peliculas;
import model.Personaje;
import model.Usuario;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.lang.model.element.Name;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ControllerEjer3 {

    public void leerUsuarios(int numero, String genero){

      /*   ArrayList<Peliculas> lista;
        if(lista==null){
            lista = new ArrayList<>();
        }
        String urlString = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8f\n" +
                "e9d4fd03ac9632f6e&language=es-ES"+numero+"&gender="+genero;
        String urlFormat = String.format("https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9\n" +
                "d4fd03ac9632f6e&language=es-ES",numero,genero);
        //System.out.println(urlFormat);

        BufferedReader reader =null;
        try {
            URL url = new URL(urlFormat);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuffer = new StringBuilder();
            String linea = null;

            while ((linea=reader.readLine())!=null){
                stringBuffer.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuffer.toString());
            JSONArray arreyResultados = jsonObject.getJSONArray("results");
            for (int i = 0; i < arreyResultados.length(); i++) {
                JSONObject objetoResultado = arreyResultados.getJSONObject(i);
                String mail = objetoResultado.getString("email");
                JSONObject name = objetoResultado.getJSONObject("name");
                String imagen = objetoResultado.getJSONObject("movies").getString("large");

                Gson gson = new Gson();
                Name nameJAVA = gson.fromJson(name.toString(),Name.class);
                lista.add(new Usuario(imagen,mail,nameJAVA));

            }
}
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


}
