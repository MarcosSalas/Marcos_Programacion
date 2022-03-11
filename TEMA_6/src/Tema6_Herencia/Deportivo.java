package Tema6_Herencia;

public class Deportivo extends Coche{ //trae todo lo que tiene coche con el extend Coche
//temgo que tener un metodo para poder acceder a todos los atributos de arriba o los puedo obtener con un get
    private int par; //nadie lo va a heredar

    //si yo en deportivo no escribo lo que tiene coche ,no lo puedo utilizar, si no utilizo primero el constructor en deportibvo ,no lo voy a poder utilizar
    public Deportivo(){}  //tiene 2 constructores el vacio y el otro
    public Deportivo(String matricula,String bastidor,int cv,int cc,int par){
     super(matricula,bastidor,cv,cc); // en la primera linea para heredar las clases
        this.par=par;
    }

   // ademas de lo que tenia se le sumara utilitarios no hara nada diferente genero un nro aleatorio entree, calcular velocc, en la entrada creamos 4 coches


    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);                //todo lo que escriba aca sera todo lo que me diga el de arriba pero para que tenga lo de arriba tiene que tener el super
        // si pongo algo debajo es lo que hacía más esto
        velocidad+=(int)(Math.random()*11)+30; //nos da el rango de 30-40
        this.velocidad=velocidad;
        System.out.println(velocidad);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println( "Velocidad Deportivo "+ velocidad);
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
