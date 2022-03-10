package Tema_Interfaz.TrabajadoresInterfaz_enClase;

public class Entrada {

    public static void main(String[] args) {

        Empresa empresa=new Empresa("CES JPII",10000);
        empresa.addPersona(new Asalariado("123a","Borja","Martin",100,Departamento.Comercial,12));
        empresa.addPersona(new Asalariado("123a","Jesus","Niño",100,Departamento.Comercial,12));
        empresa.addPersona(new Jefe("123a","Isaac","Martin",100,Departamento.Comercial,12));
        empresa.addPersona(new Autonomo("123a","Eduardo","Martin",100,Departamento.Comercial,12));
        //seguir copiando
        empresa.listarPersonas();

       // empresa.registrarVotacion((Comision) empresa.getPersonas().get(2));// cuenta de arriba para abajo y dice0 bORJA , 1 Jesus,2 Isaac
        // empresa.registrarVotacion((Comision) empresa.getPersonas().get(1));//Esto no se podria porque no es del departamento comision
        //System.out.println("votos registrados" + empresa.getVotos());


        empresa.repartirBeneficios();












    }

}
