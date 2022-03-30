package Supermercado;
/* LO ABSTRACTO LO PUSE A LO ULTIMO DEL EJERCICIO CASI,DESPUES DE HACER LAS IMPLEMENTACIONES Y LAS EXTENCIONES DE V -T*/
public abstract class Alimento implements Inventariable { //Abstracto, porque quiero que exista un los hijos pero no Alimento
   //variables
    protected String calidad,origen;  //protected,se puede poner o no,es para cuando heredan los hijos los mismos valores
    protected double precio;
//construcctores

    public Alimento(String calidad, String origen, int precio) {
        this.calidad = calidad;
        this.origen = origen;
        this.precio = precio;
    }

    public Alimento() {
    }



    //metodos

    public void mostrarDatosAlimento(){
        System.out.println("Calidad "+calidad);
        System.out.println("Origen "+origen);
        System.out.println("Precio "+precio);
    };



    //metodos seter-geter


    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void calcularPrecio() {// COMO LOS HIJOS REQUIEREN DE ESTAS CALASES SE PONEN PARA QUE SE PUEDAN HEREDAR
        setPrecio(this.precio+(this.precio*Inventariable.IVA_ALIMENTOS)); //corragido en clase
       //si pones el Set aca ,no hace FALTA PASARLO ARRIBA COMO HIZO ALEX,SINO SI
        //el set Precio le digo lo que quiero que tenga la variable precio
        System.out.println("Precio Final "+ precio);
    }

}
