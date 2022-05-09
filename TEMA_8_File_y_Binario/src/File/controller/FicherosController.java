package File.controller;

import java.io.*;

public class FicherosController {


// ###   EN EL CONTROLLER se realizan todas las acciones que se quieran realizar sobre los FICHEROS  ###

    public void getFileInfo(File file) { //cuidado que me puede traer el java.io y está mal tengo que IMPORTAR LA CLASE desde la LÁMPARA ROJA
        // Van todos los metodos de FILE ,si el NOMBRE , si la RUTA,si la RUTA ABSOLUTA, si EXISTE , si se PUEDE ,etc
        //Pero ""NO VA la CREACION DE LOS OBJETOS de tipo FILE"",se lo pedimos al MAIN y lo pasamos Arriba en el MÉTODO por parámetros
        System.out.println("Informacion de FICHERO");
        System.out.println("Es FICHERO = CARPETA ? " + file.isDirectory());
        System.out.println("Es FICHERO = TXT ? " + file.isFile());
       // System.out.println("Es directorio = CARPETA ? " + directory.isFile());
        //System.out.println("Es directorio = CARPETA ? " + directory.isDirectory());
        System.out.println("El fichero EXISTE? ? " + file.exists());
        //System.out.println("El directorio = CARPETA, EXISTE? ? " + directory.exists());
        System.out.println("Permisos = PADRE " + file.getParent()); //LEER,ESCRIBIR,EJECUTAR(White,Read,Ececute) -Cual es su padre en el caso del fichero.txt sería el directorio ficheros
        //System.out.println("Permisos = PADRE " + directory.getParent()); //LEER,ESCRIBIR,EJECUTAR(White,Read,Ececute) -Cual es su padre en el caso del fichero sería el directorio Escritorio
        System.out.println("Permisos = HIJOS " + file.list()); //-Cuál es su hijo Los FILE.TXT ""NO TIENEN HIJOS"" pero los DIRECTORY ""SI""- devuelve Arrays de ""STRING""
        System.out.println("Permisos = HIJOS " + file.listFiles()); //Cuál es su hijo Los FILE.TXT ""NO TIENEN HIJOS"" pero los DIRECTORY ""SI"" -DEVUELVE ARRAYS DE ""FILE""
        System.out.println("RUTA  ABSOLUTA " + file.getAbsolutePath());
        System.out.println("RUTA  RELATIVA ## IMPORTANTE ## " + file.getPath());
        System.out.println("NOMBRE " + file.getName());

        //## CREACIÓN DE UN FICHERO TXT
        if (!file.exists()) {     //CUIDADO si me sale un Error es que me falta el ##  import java.io.IOException ## EN LA CABECERA
            try {
                file.createNewFile();// va a figurar un error al poner createNewFile porque va a tomar un posible Null pointerExeption
                //Solución,click en la lámpara roja de la izquierda opcion TRY/CATCH.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //FIN DE CREACIÓN TXT

    }

    public void getDirectoryInfo(File file){

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        if (file.isDirectory()) { // si es directorio ,saco el nombre de los archivos de adentro PERO NO PREGUNTA SI NO EXISTE,NO ACÁ
            //Pero con ""String Arrays""

            //## PARA SACAR EL NOMBRE DE LOS FICHEROS -  ##  NO LOS FICHEROS
                String [] nombreFicheros = file.list(); //este es el nombre NO los ficheros
                // System.out.println(nombreFicheros);  //SI SOLO PONGO ASI ME SALE UN ERROR ,NECESITO UN FOR PARA QUE RECORRA EL ARRAY
                    //    for (String /* <-- De que es el Array*/ nombre:nombreFicheros /*<-- Que quiero recorrer ... El nombre del Array*/) {
                    //       System.out.println(nombre);
                    //   }
            //## FIN NOMBRE DE LOS FICHEROS -  ##  NO LOS FICHEROS


                                                       // %%%%%%%%%%%%%%%%%%  HAY VECES QUE CONVIENE TRATARLO COMO FICHERO(File) Y OTRAS VECES COMO NOMBRE(STRING)  %%%%%%%%%%%%%%%%%%%
            //## PARA SACAR T@DOS LOS FICHEROS -  ##  NO LOS FICHEROS
            File [] ficherosNoNombre = file.listFiles(); //recordar que va con el listFile si es ficheros y con el File[];
            for (File ficheros :ficherosNoNombre) {
                System.out.println(ficheros);// No saca el nombre Saca la posición de memoria(La Ruta del File)
                System.out.println(ficheros.getName());// Si quiero solo el NOMBRE
            }
            //## FIN T@DOS DE LOS FICHEROS -  ##  NO LOS FICHEROS

                                                       // %%%%%%%%%%%%%%%%%%                            FIN                                          %%%%%%%%%%%%%%%%%%%
            }
        }

    }
//##video 2
    public void lecturaFichero(File file){

        FileReader fileReader=null;
        try {
            fileReader = new FileReader(file); //asi se crea un objeto de tipo FileReader (pide un objeto de tipo file)/ alt Enter sobre el fallo.. try/catch
           int lectura = fileReader.read(); // Dará un error, deberemos reemplazar FileNotFoundException por IOException y asociarle una variable int
            System.out.println(lectura); //leeria solo la primera letra del txt en ascii

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                fileReader.close(); //SIEMPRE TENGO QUE CERRARLO , para eso lo declaro arriba,para el try/catch y el finally ## el error de cerrarlo es por otra exepcion..otro try/chatch.IOExepcion
            } catch (IOException | NullPointerException e) {//posible que no haya cerrado
                e.printStackTrace();// En el caso de que fileReader sea null,hay que tratarlo con el NullPointer Juntando los 2 bloques en 1
                //DESPUES de esto hago la lectura desde el primer try/catch con el read()
            }

        }


    }

    public void cifrarLinea(){ //Asi sacamos la letras a byte
        String lineaEscribir= "Esto es un ejemplo de una linea a escribir dentro del fichero";


        String[] letras =lineaEscribir.split("");
        for (String verChar:letras) {
            int codigo =(byte)(verChar.charAt(0));
            // char letra ='e';
            // System.out.println((byte)letra);
            // System.out.println((byte)verChar.charAt(0)); código sin alterar, sin cifrar
            //  char codigoSinAlterar =(char)(codigo);
           // System.out.println(codigoSinAlterar);

            int codigoCifrado = codigo *2;
            char codigoAlterado =(char)(codigoCifrado);
            System.out.println(codigoAlterado);


        }


    }

    public void escrituraFichero(File file2){ //## El fileWriter= new FileWriter(file); escribe las letras , caracter a caracter
        FileWriter fileWriter = null;
        String lineaEscribir= "Esto es un ejemplo de una linea a escribir dentro del fichero";

        try {
            fileWriter = new FileWriter(file2);
            fileWriter.write(101);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    public void escribirFicheroCompleto(File file){
        FileWriter fileWriter=null;//para usarlo dentro del try/catch y finally
        //para crear el fileWriter tengo que partir de un file
        //c)una vez declarado todos los fileWriter con sus Exeption y sus close etc sigo con el BuffererWriter
        BufferedWriter bufferedWriter = null; //1.) lo igualo a nulo por lo mismo del File

        //## Otra Opcion la
        PrintWriter printWriter=null;


        try {
            fileWriter = new FileWriter(file);// me va a dar error por exepcion,alt enter try/catch
          /*  bufferedWriter = new BufferedWriter(fileWriter); //inicializo el buffer y le asigno un fileWiter una vez creado esto ya puedo esscribir
            bufferedWriter.write("Esto es un ejemplo de"); //aqui ya escribo
            bufferedWriter.newLine(); //salto de linea
            bufferedWriter.write("Esto es un ejemplo 2  de linea nueva"); //aqui ya escribo
            bufferedWriter.newLine(); //salto de linea*/

            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Esto es un ejemplo de linea");
            printWriter.println("Esto es un ejemplo de linea segunda");
            printWriter.println("Esto es un ejemplo de linea tercera");




            //2. lo inicializo
        } catch (IOException e) {
            e.printStackTrace();
            //en bien termino de poner try/catch ,tengo que cerrar las cosas
        } finally{ //cierro

          /*  try {*/ //el ## printWriter no pide esta extencion  !!!!

                if (/*fileWriter*/ /* bufferedWriter!*/printWriter != null) { //una vez echo la correccion al file elevado ,vuelvo a ejecutar
                   // fileWriter.close(); //nos da otro error.. try/catch IOException
                                        //pero tanbien me va a dar una advertencia a la izquierda Luz amarilla
                                        // poner Surround with `if (fileWriter!=null) posicionandome sobre el close
               //     bufferedWriter.close();// 3. no olvidar cerrar el bufferWriter y comento el fileWriter porque lo elevé añ buffered

                    printWriter.close();
                }
          /*  } catch (IOException e) {  //el ## printWriter no pide esta extencion !!!!

                e.printStackTrace();
            }*/
        }


    }



}
