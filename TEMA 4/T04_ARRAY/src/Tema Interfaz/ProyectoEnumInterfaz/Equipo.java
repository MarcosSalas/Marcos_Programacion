package ProyectoEnumInterfaz;

public enum Equipo {

    //Costruidos
    Barcelona("FC.Barcelona",100000),Madrid("Real Madrid",1000),Atletico,Sevilla,Getafe,Alcorcon("Alcorcon",2000);

    //variables
    String nombre;
    int presupuesto;


    //constructores

 Equipo (String nombre,int presupuesto){
     this.nombre=nombre;
     this.presupuesto=presupuesto;

    }
Equipo(){} //Constructor vacío para el caso de Atletic,Getafe,etc

    //merodos

    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(presupuesto);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
}
