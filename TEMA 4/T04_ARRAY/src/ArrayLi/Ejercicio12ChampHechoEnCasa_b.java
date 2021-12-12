package ArrayLi;

public class Ejercicio12ChampHechoEnCasa_b {
    public static void main(String[] args) {
        String[] bomboUno = {"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String[] bomboDos = {"Real Madrid", "Tottenham", "Nápoles", "B. Dortmund", "O. Lyon", "Chelsea", "Atalanta", "Atético de Madrid"};

        //  int[]numeros=null;
        //  numeros = new int[tamanio];      se podría inicializar así el string equipo Salido B1 Y B2?



        String[] equiposSalidosB1 = new String[bomboUno.length];
        String[] equiposSalidosB2 = new String[bomboDos.length];
        System.out.printf("ver algo ",equiposSalidosB1 );

        for (int i = 0; i < bomboDos.length; i++) {
            int aleatorioUno = (int) (Math.random() * bomboUno.length);
            int aleatorioDos = (int) (Math.random() * bomboUno.length);
            String equipoGenerado1 = bomboUno[aleatorioUno];
            String equipoGenerado2 = bomboDos[aleatorioDos];

            for (int x = 0; x < equiposSalidosB1.length; x++) {
                if (equipoGenerado1.equalsIgnoreCase(equiposSalidosB1[i])) {  //equalsIgnoreCase COMPARA 2 strings para ver si SON IGUALES ignorando las DIFERENCIA entre MAYÚSCULA y MINÚSCULA.
                                                                              // Este método es necesario porque no es posible comparar strings usando el operador de igualdad (==).
                                                                              // Retorna true si los strings son iguales y false si no lo son.
                    aleatorioUno = (int) (Math.random() * bomboUno.length);
                }
            }


            System.out.println(bomboUno[aleatorioUno] + "-" + bomboDos[aleatorioDos]);
        }


    }

}

