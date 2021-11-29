package PracticasEnCasa.ArrayUnidimensionales;
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner ingrBool = new Scanner(System.in);
        Scanner nomNoEnc = new Scanner(System.in);
        Scanner ingrNro=new Scanner(System.in);
        Scanner ingText= new Scanner(System.in);
        Scanner opcionMenu=new Scanner(System.in);
        Scanner cargaNueva=new Scanner(System.in);


        int opcion, cargaTotNotas=3;;

        double notAlum=0.00;
        boolean alumCarga = true;

        int contador=0;

        String nomAl;
        double suma=0;
        int cargaAlumnos=0;
        boolean carNueva=false;
        final int NCOLUM =4;
        Object arrayNroAl [][]=new Object[cargaAlumnos][NCOLUM];

            do {

            System.out.println("Inicio de programa");


            System.out.println("ingrese la opción deseada\n");
            System.out.println("1 Definir el número de alumnos a registrar:");
            System.out.println("2 Registrar alumnos");
            System.out.println("3 Ver datos de alumnos con nota media:");
            System.out.println("4 Ver datos de un alumno concreto:");
            System.out.println("5 Ver medias de la asignatura 1");
            System.out.println("6 Ver medias de la asignatura 2:");
            System.out.println("7 Ver medias de la asignatura 3:");
            System.out.println("0 Salir");
            opcion=opcionMenu.nextInt();

            switch (opcion) {



                case 0:
                    System.out.println("entro en 0");
                    break;
                case 1:
                    System.out.println("DEFINIR ALUMNOS\n");
                    if (cargaAlumnos>0) {
                            System.out.println("Error, ya definió los alumnos");
                            break;
                        }
                    System.out.println("Ingrese la cantidad de alumnos que desea cargar ");
                    cargaAlumnos = ingrNro.nextInt();
                    arrayNroAl = new Object[cargaAlumnos][4];
                    if (cargaAlumnos <1) {
                        System.out.println("Error, cargue el nro de alumnos mayor que 0");
                    }

                        break;
                case 2:

                    if (cargaAlumnos <1) {
                        System.out.println("No hay alumnos definidos");
                    }  else {


                        for (int i = 0; i < arrayNroAl.length; i++) {

                            System.out.printf("Nombre del alumno %d %n",i+1);
                            nomAl= ingText.nextLine();
                            arrayNroAl[i][0]=nomAl;

                            for ( int j = 1; j <=cargaTotNotas; j++) {
                                System.out.printf("ingrese la nota %d , si es real separada por coma %n",j);
                                notAlum=(ingrNro.nextDouble());
                                arrayNroAl[i][j]=notAlum;
                            }
                        }
                    }
                    /*else if (arrayNroAl[1][1] != null) {
                    System.out.println("ya hay alumnos registrados");
                }
*/

                    break;
                case 3:
                   final int MEDIA=3;
                    if (cargaAlumnos<1){
                        System.out.println("No hay alumnos definidos");
                    }else {


                        for (int i = 0; i < arrayNroAl.length; i++) {

                            System.out.println("Nombre "+arrayNroAl[i][0]);
                            for ( int j = 1; j <=cargaTotNotas; j++) {
                                System.out.println("nota "+arrayNroAl[i][j]);
                                suma+=(double)arrayNroAl[i][j];
                            }
                        }

                             System.out.printf("La nota media %d",suma/MEDIA);

                    }
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("entro en 5");
                    break;
                case 6:

                    break;
                case 7:

                    break;

                default:
                    break;
            }
            } while (opcion>=0&&opcion<7);



/*


        if (arrayNroAl[i][0].equals(nomAl)){
        }

        nomEncontrado=true;
        repet=true;


                boolean nNoEnBool=false;
                boolean nomEncontrado=false;
                boolean repet=false;
                do {

                System.out.printf("Nombre del alumno que quiere buscar %n");
                nomAl= ingText.nextLine();
                repet=false;
                nomEncontrado=false;

                for (int i = 0; i < cargaAlumnos; i++) {
                    if (arrayNroAl[i][0].equals(nomAl)){
                        for (int j = 1; j < NCOLUM; j++) {
                          System.out.println("Notas del alumno : "+ nomAl + " " + arrayNroAl[i][j]);
                            nomEncontrado=true;
                            repet=true;
                        }
                    }
                }
                    System.out.println();
                    if (repet==true) {
                        System.out.println("desea ver otros alumnos?true(Si),false(no)");
                        nNoEnBool=nomNoEnc.nextBoolean();
                    }

                if (nomEncontrado==false) {
                    System.out.println("no se encontró ese nombre,quiere buscar nuevamente? true(si),false(no) y vuelve a la carga");
                    nNoEnBool=nomNoEnc.nextBoolean();
                }
                } while (nNoEnBool==true);


                System.out.println();
*/



    }

}

/*
Ver datos de alumnos con nota media: se mostrará en cada línea la información del alumno con el siguiente formato. Si no hay alumnos registrados
saltará un mensaje de error
Ver datos de un alumno concreto: pedirá un nombre, lo buscará y mostrará sus datos. Si no hay alumnos registrados o no existe mostrará
un mensaje que muestre el aviso
 (deberá ser diferente)
Ver medias de la asignatura 1: Se mostrará la media de la asignatura 1. Si no hay alumnos se mostrará un aviso
Ver medias de la asignatura 2: Se mostrará la media de la asignatura 2. Si no hay alumnos se mostrará un aviso
Ver medias de la asignatura 3: Se mostrará la media de la asignatura 3. Si no hay alumnos se mostrará un aviso
Salir
El formato de salida será el siguiente
****Alumno suNombre****
Nota1: 6
Note2: 5
Nota3: 7
Nota media: 6






(MultidimensionalAlumno) Crear un programa guarde en un array multidimensional un número determinado de alumnos.
Cada alumno tendrá un nombre y tres notas. El programa deberá sacar un menú con la siguiente estructura:

Definir el número de alumnos a registrar: si ya hay definido un número de alumnos saltará un error o si el numero es menor que uno
Registrar alumnos: si no hay número de alumnos definido o si ya hay alumnos registrados saldrá un mensaje de error (deberá ser diferente)


 */