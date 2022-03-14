package TrabajadoresInterfaz_enClase;

public class Entrada {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("CES JPII",10000);
        empresa.addPersona(new Asalariado("123A","Borja", "Martin",1000,Departamento.Comercial,12));
        empresa.addPersona(new Asalariado("123B","Jesus", "Niño",1000,Departamento.Finanzas,12));
        empresa.addPersona(new Jefe("123C","Isaac", "Sampedro",2000,Departamento.IT,14));
        empresa.addPersona(new Autonomo("123D","Eduardo", "Del Olmo",1000,Departamento.Ventas,14));
        empresa.addPersona(new Accionista("123E","Gema", "Cordoba",50));
        empresa.addPersona(new Directivo("123G","MArta", "Valdeita",100));
        //empresa.listarPersonas();
        empresa.listarPersonas();

       // empresa.registrarVotacion((Comision) empresa.getPersonas().get(2));// cuenta de arriba para abajo y dice0 bORJA , 1 Jesus,2 Isaac
        // empresa.registrarVotacion((Comision) empresa.getPersonas().get(1));//Esto no se podria porque no es del departamento comision
        //System.out.println("votos registrados" + empresa.getVotos());


        empresa.repartirBeneficios();












    }

}
