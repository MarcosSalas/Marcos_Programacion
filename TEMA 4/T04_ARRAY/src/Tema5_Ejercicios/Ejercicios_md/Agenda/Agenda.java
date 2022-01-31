package Tema5_Ejercicios.Ejercicios_md.Agenda;

import java.util.ArrayList;

public class Agenda {
                //********   variables
 //  private ArrayList<Persona> listaString = new ArrayList<Persona>(); //MAL ,ACÁ NO LO INICIALIZO,LO INICIALIZO EN AGENDA, CUANDO LO VAYA A USAR
    private ArrayList<Persona> listaPersonas;
   // lo que figura entre <> en este caso Persona, es el tipo de valor(Integer,String), en este caso de tipo Persona
   //BORRAR DATOS listaString.remove(1),dentro la posición


                //******** constructores
    public Agenda(){
        this.listaPersonas=new ArrayList(); // asi lo inicializo
    }
                //********* metodos

            //  ** AGREGAR - BORRAR - LISTAR - van en esta clase porque hacen referencia a la agenda y no a la persona en si
            //  **  -EDITAR-BUSCAR- A DONDE VAN?

    public void agregarPersonas(Persona persona){ // PARA AGREGAR UNA PERSONA NECESITO LOS DATOS DE UNA PERSONA, QUE ESO ME LOS VA A DAR LA CLASE PERSONA
    listaPersonas.add(persona); // NO ENTIENDO    //AQUÍ SOLO LE DECIMOS QUE A AL ARRAYLIST DE LA CASE PERSONA LE AGREGUE OTRA PERSONA
    }

    public boolean borrarPersona(String dni){
        for (int i = 0; i< listaPersonas.size();i++) {
            if (dni == listaPersonas.get(i).getDni()) {
                listaPersonas.remove(i);
                return true;
            }
        }
        return false;
    }

    public void listarAgenda(){
        for (Persona item: listaPersonas) {  // el tipo de valor que va a ser item antes de los : (en este caso de tipo Persona)y que es lo que va a tomar después de los :
            System.out.println("Imprimiendo Persona"); //es decir,para recorrer Persona del array listaPersonas
            item.mostrarDatos(); //llamo al metodo mostrarDatos, q eso a su vez se puede meter en el array item "VER"
            
        }

    }


    //seter-gueters


    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
}
