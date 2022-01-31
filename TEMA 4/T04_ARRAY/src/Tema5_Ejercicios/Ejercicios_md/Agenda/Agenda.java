package Tema5_Ejercicios.Ejercicios_md.Agenda;

import java.util.ArrayList;

public class Agenda {
                //********   variables
 //  private ArrayList<Persona> listaString = new ArrayList<Persona>(); //MAL ,ACÁ NO LO INICIALIZO,LO INICIALIZO EN AGENDA, CUANDO LO VAYA A USAR
    private ArrayList<Persona> listaPersonas; // voy a poder llamar a todo lo que tenga la clase persona

    // lo que figura entre <> en este caso Persona, es el tipo de valor(Integer,String), en este caso de tipo Persona
   //BORRAR DATOS listaString.remove(1),dentro la posición


                //******** constructores
    public Agenda(){
        this.listaPersonas=new ArrayList(); // asi lo inicializo
    }
                //********* metodos

            //  ** AGREGAR - BORRAR - LISTAR - van en esta clase porque hacen referencia a la agenda y no a la persona en si
            //  **  -EDITAR-BUSCAR- A DONDE VAN?

    public void agregarPersonas(Persona persona) { // PARA AGREGAR UNA PERSONA NECESITO LOS DATOS DE UNA PERSONA, QUE ESO ME LOS VA A DAR LA CLASE PERSONA
       /* boolean dniEncontrado = false; // en este caso como solo lo usamos aca no iria privado
        listaPersonas.add(persona); // NO ENTIENDO    //AQUÍ SOLO LE DECIMOS QUE A AL ARRAYLIST DE LA CASE PERSONA LE AGREGUE OTRA PERSONA

        for (Persona agrepersona : listaPersonas) {
            if (agrepersona.getDni() == persona.getDni()) {
                dniEncontrado = true;
                break;
            }// no lleva else porque si hay otros nuros abajo pisaría el valor, por eso tmb va el break
        }
        if (dniEncontrado) {
            System.out.println("error");
        } else {
            listaPersonas.add(persona);

        }*/

        if (existePersona(persona.getDni()) == null) { //para saber si la persona existe pongo persona.getDni}
            //voy a querer agregar una persona cuando no exista, cuando esto sea= null
            listaPersonas.add(persona);
        } else {
            System.out.println("La persona ya existe");
        }
    }

    public boolean borrarPersona(String dni){
        /*for (int i = 0; i< listaPersonas.size();i++) {
            if (dni == listaPersonas.get(i).getDni()) {
                listaPersonas.remove(i);
                return true;
            }
        }
        return false;*/
        if (existePersona(dni)!= null){
            listaPersonas.remove(existePersona(dni));
            return true;
        }
        return false;

    }

    public void listarAgenda(){
        for (Persona item: listaPersonas) {  // el tipo de valor que va a ser item antes de los : (en este caso de tipo Persona)y que es lo que va a tomar después de los :
            System.out.println("Imprimiendo Persona"); //es decir,para recorrer Persona del array listaPersonas
            item.mostrarDatos(); //llamo al metodo mostrarDatos, q eso a su vez se puede meter en el array item "VER"
            
        }

    }


    public  void buscarPersona(String dni ){



    }

    public  void editarPersona(String dni){ //el set es para modificar los valores que ya tiene agregado
        /*for (Persona persona:listaPersonas) {
            if (persona.getDni()== dni) {
                persona.setNombre("Otro nombre");
            }*/
        if (existePersona(dni)!=null){
            existePersona(dni).setNombre("Nuevo");
            existePersona(dni).setDni("ASD");
            existePersona(dni).setNroTel(125);

        }

    }

    private Persona existePersona(String dni){  // como no me interesa que lo llamen de otras clases, lo llamo privado
        Persona persona = null ;
        //para recorrer y saber si la persona existe
        for (Persona item:listaPersonas){
            if (item.getDni()==dni) {
                return item; // es lo mismo que poner persona=item; breack;, es mas eficiente como lo pongo ahora
            }
        }

        return persona;
        }




    //seter-gueters


    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
}
//no puedo poner el add dentro de un foreach porque preguntaria por todos, si es que está al final antes agregó en todos los anteriores