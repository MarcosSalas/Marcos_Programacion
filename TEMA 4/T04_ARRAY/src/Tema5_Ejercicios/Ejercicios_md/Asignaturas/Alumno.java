package Tema5_Ejercicios.Ejercicios_md.Asignaturas;

public class Alumno {
    //1ro variables
    private Asignatura asignatura1,asignatura2,asignatura3;

    //2do constructores

public Alumno(Asignatura asignatura1,Asignatura asignatura2,Asignatura asignatura3){
this.asignatura1=asignatura1;
this.asignatura2=asignatura2;
this.asignatura3=asignatura3;
}

public Alumno(int id){  //MAL CORREGIR
    this.asignatura1=new Asignatura(id);
    this.asignatura2=new Asignatura(id);
    this.asignatura3=new Asignatura(id);
}

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

}
