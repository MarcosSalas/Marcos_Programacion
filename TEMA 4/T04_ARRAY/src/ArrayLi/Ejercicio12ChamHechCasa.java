package ArrayLi;

public class Ejercicio12ChamHechCasa {
    public static void main(String[] args) {
        String bombo1[]={"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String bombo2[]={"Real Madrid", "Tottenham", "Nápoles"," B. Dortmund"," O. Lyon", "Chelsea"," Atalanta", "Atético de Madrid"};
        String bombo1Final[]=new String[bombo1.length];
      //  String bombo2Final[]=new String[bombo2.length];         SOLO SE TIENE QUE HACER 1 ARRAY MAS QUE ES DONDE VA A GUARDAR LOS VALORES DE LOS 2 ARRAY

        for (int i = 0; i < bombo1.length; i++) {
          String equipBom1=bombo1[(int)(Math.random()*bombo1.length)];
          String equipBom2=bombo2[(int)(Math.random()*bombo2.length)];
            //RECORDAR SIEMPRE QUE SE HACEN 2 FOR X Q UNO ES SOLO PARA CARGAR LOS VALORES Y EL OTRO LO TRABAJA

            for (int j = 0; j < bombo1Final.length; j++) {

                if (equipBom1.equalsIgnoreCase(bombo2[i])) {              // equalsIgnoreCase COMPARA 2 strings para ver si SON IGUALES ignorando las DIFERENCIA entre MAYÚSCULA y MINÚSCULA.
                //porque se compara con el                                                           // Este método es necesario porque no es posible comparar strings usando el operador de igualdad (==).
                                                                          // Retorna true si los strings son iguales y false si no lo son.

                   // if (equipoGenerado1.equalsIgnoreCase(equiposSalidosB1[i]))
                }


                /*if (equipBom1!=equipBom1) {             ESTO QUE HICE PRIMERO ESTÁ ,MAL , PORQUE TIENE QUE VALIDAR SI REPITE EL EQUIPO DEL BOMBO1 QUE JUEGA CON EL EQUIPO DEL BOMBO2
                    bombo1Final[i]=equipBom1;             ES DECIR QUE UN EQUIPO DE UN MISMO BOMBO PUEDE JUGAR 2 VECES, EJEMPLO LA JUVE, PUEDE JUGAR CON EL NÁPO,Y LUEGO LA JUVE PUEDE
                                                          JUGAR CON OTRO EQUIPO ,PERO NO CON EL MISMO QUE YA JUGÓ
                }
                if (equipBom2!=equipBom2){
                    bombo2Final[i]=equipBom2;
                }*/



            }


        }
        System.out.printf("partido1 %s " ,bombo1Final);
       // System.out.printf("partido2 %s " , bombo2Final);


    }
}
//(ChampionArray) Desarrolla un programa que simule los cruzes del sorteo de la champion. Para ello debes saber que eisten dos bombos:
// El programa debe empajerar un equipo del
// bombo1 con un equipo del bombo2 sin repetir posibilidades y mostrarlo por pantalla con el siguiente formato:
//*** Partido Barcelona - Atalata ***
//*** Partido Real Madrid Juventus ***
//*** Partido Atlético de Madrid - RB Leizpzig ***