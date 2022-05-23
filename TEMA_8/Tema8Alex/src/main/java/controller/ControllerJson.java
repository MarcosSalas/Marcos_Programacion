package controller;

import com.google.gson.Gson;
import model.Peliculas;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ControllerJson {

    private ArrayList pelis;

    String urlEstrenos = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";
    String urlProximamente = "https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";

    public void lecturaJSON (){

        if (pelis==null) {
            pelis = new ArrayList();
        }

            String urlEstrenos = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";
            BufferedReader bufferedReader = null;

            try {
                URL url = new URL(urlEstrenos);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();
                String linea = null;

                while ((linea = bufferedReader.readLine())!=null) {
                    stringBuilder.append(linea);
                }

                JSONObject jsObject = new JSONObject(stringBuilder.toString());
                JSONArray arrayResultados = jsObject.getJSONArray("results");
                for (int i = 0; i < arrayResultados.length(); i++) {
                    JSONObject resultado = arrayResultados.getJSONObject(i);
                    String nombre = resultado.getString("title");
                    //System.out.println(nombre);
                    String fecha = resultado.getString("release_date");
                    //System.out.println(fecha);
                    String poster = resultado.getString("poster_path");
                    poster = "https://image.tmdb.org/t/p/w500/"+poster;

                    Gson gson = new Gson();
                    Peliculas peliculas = gson.fromJson(resultado.toString(),Peliculas.class);
                    /*System.out.println(peliculas.getTitle());
                    System.out.println(peliculas.getRelease_date());*/
                    //System.out.println("https://image.tmdb.org/t/p/w500/"+peliculas.getPoster_path());

                    pelis.add(new Peliculas(nombre,fecha,poster));

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

    /*public void escribirPelis(){
        File file = new File("src/main/resources/usuarios.bin");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }*/

}
