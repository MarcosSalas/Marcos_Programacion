package Inventario;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {


        SupermercadoEspecífico supermercadoEspecífico=new SupermercadoEspecífico<>();
    Alimento alimento1=new Alimento("muy buena","España",120);
    Alimento alimento2=new Alimento("Excelente","Alemania",180);






        Carne solomillo=new Carne("Buena ","Perú ",165,26);
        Carne lomo=new Carne("Muy Buena ","Colombia ",145,20);
        Lacteo leche=new Lacteo("Muy Buena","España",4,6);
        Lacteo yoghurt=new Lacteo("Excelente","España",3,6);

        SupermercadoEspecífico supermercadoEspecífico1=new SupermercadoEspecífico(alimento1);

      supermercadoEspecífico1.registrarElemento(solomillo);
        supermercadoEspecífico1.registrarElemento(lomo);

        System.out.println("Ver pecio alimento 1") ; solomillo.calcularPrecio();//PARA PODER SACAR EL PRECIO DEL ALIMENTO SE DEBE CASTEAR EN EL MAIN.NO SE ACCEDE DIRECTAMENTE



        supermercadoEspecífico.mostrarPreciosFinales();



/*
    SupermercadoEspecífico supermercadoEspecífico1=new SupermercadoEspecífico(solomillo);
    SupermercadoEspecífico supermercadoEspecífico2=new SupermercadoEspecífico(lomo);
    SupermercadoEspecífico supermercadoEspecífico3=new SupermercadoEspecífico(leche);
    SupermercadoEspecífico supermercadoEspecífico4=new SupermercadoEspecífico(yoghurt);*/


       // supermercadoEspecífico.registrarElemento(carne1);
/*
    supermercadoEspecífico.registrarElemento(solomillo);
    supermercadoEspecífico.registrarElemento(lomo);
    supermercadoEspecífico.registrarElemento(leche);
    supermercadoEspecífico.registrarElemento(yoghurt);*/






    }


    }
