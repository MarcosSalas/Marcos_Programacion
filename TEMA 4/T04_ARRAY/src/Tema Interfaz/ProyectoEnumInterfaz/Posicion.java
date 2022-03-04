package ProyectoEnumInterfaz;

public enum Posicion {

// . name() para sacar esta info
portero("Portero",100) ,defensa("Defensa",300),medio("medio",600),deantero("delantero",6000);

    //variables
    String deficinicn;
    int valor;

    Posicion(){}

    Posicion(String deficinicn, int valor){
        this.deficinicn=deficinicn;
        this.valor=valor;

    }

    public String getDeficinicn() {
        return deficinicn;
    }

    public void setDeficinicn(String deficinicn) {
        this.deficinicn = deficinicn;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
/*  NO ESTARIA BIEN, NO SERIA OPTIMO
    //Costruidos
    Jugador("delantero","medio","defensa","portero");

    //variables
    String nombre1,nombre2,nombre3,nombre4;


//Las posiciones son delantero, medio, defensa o portero
    //constructores

    Posicion (String nombre1,String nombre2,String nombre3,String nombre4){
        this.nombre1=nombre1;
        this.nombre2=nombre2;
        this.nombre3=nombre3;
        this.nombre4=nombre4;
    }
    Posicion(){}

    //merodos

    public void mostrarDatos(){
        System.out.println(nombre1);
        System.out.println(nombre2);
        System.out.println(nombre3);
        System.out.println(nombre4);*/





