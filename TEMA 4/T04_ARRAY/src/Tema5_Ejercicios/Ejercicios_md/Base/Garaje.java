package Tema5_Ejercicios.Ejercicios_md.Base;

public class Garaje {

    private Coche coche;
    private String averia;
    private int numCoches;

    /*public Garaje(){

    }*/  // SI PONGO ESTO O NO PONGO NADA ES LO MISMO , ES POR DEFECTO
    public void devolverCoche(){
        this.coche = null;
    }


    public boolean aceptarCoche(Coche coche,String averia){
             if (this.coche!=null){// hace refencia a garaje y no a coche
                 return  false;
             }else{
                 numCoches++;
                 this.coche=coche;
                 if (averia.equalsIgnoreCase( "aceite")){
                     coche.getMotor().setLitros(coche.getMotor().getLitros()+10);
                 }else {
                     coche.getMotor().setLitros(coche.getMotor().getLitros()+(int)(Math.random()*1000));
                 }
                 return true;
             }

    }




}
