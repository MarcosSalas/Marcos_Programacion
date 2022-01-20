package Tema5_Ejercicios.Ejercicios_md.Base;

public class Motor { // la lase con Mayúscula
    //1ro variables
    private int litros,cv;  // todos los atributos de las clases son PRIVADOS


    //2do constructores    //creo un constuctor con el mismo nombre de la clase

    //hay DOS POSIVILIDADES DE CREAR UN CONSTRUCTOR USAMOS EL QUE NOS INTERESE


    public Motor(int cv,int litros) {  //LOS CONSTRUCTORES SIEMPRE SON PUBLICOS , NO TIENEN RETORNO , VAN EN MAYÚSCULA Y TIENEN QUE LLAMARSE IGUAL A LA CLASE
        this.cv=cv;
        this.litros=cv;
        //no hace falta inicializar la variable en los otros ,porque por defecto se inicializa en 0
    }

    public Motor(int cv) {  //LOS CONSTRUCTORES SIEMPRE SON PUBLICOS Y NO TIENEN RETORNO
        this.cv=cv;
        //no hace falta inicializar la variable en los otros ,porque por defecto se inicializa en 0
    }



    //3ro métodos    -EN  MINUSCULA


    public int getLitros() {
        return litros;
    }

    public int getCv() {
        return cv;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
}


/*
Desarrollar una clase llamada Motor que:

                            Tenga dos atributos private de tipo int (litros de aceite) y de tipo int (CV).
Tenga un constructor con un parámetro de tipo int para los CV. Los litros de aceite por defecto serán 0.
Tenga un getter para cada uno de los atributos.
Tenga un setter para los litros.
*/












