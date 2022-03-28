package Inventario;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        SupermercadoEspecifico supermercadoAlimentos=new SupermercadoEspecifico();
        SupermercadoEspecifico supermercadoEspecifico=new SupermercadoEspecifico<>();


      /* LO ABSTRACTO LO PUSE A LO ULTIMO DEL EJERCICIO CASI,DESPUES DE HACER LAS IMPLEMENTACIONES Y LAS EXTENCIONES DE V -T*/

        Carne solomillo=new Carne("Buena ","Perú ",165,26);
        Carne lomo=new Carne("Muy Buena ","Colombia ",145,20);
        Lacteo leche=new Lacteo("Muy Buena","España",4,6);
        Lacteo yoghurt=new Lacteo("Excelente","España",3,6);



        supermercadoAlimentos.registrarElemento(solomillo);
        supermercadoAlimentos.registrarElemento(lomo);
        supermercadoAlimentos.registrarElemento(leche);
        supermercadoAlimentos.registrarElemento(yoghurt);

        System.out.println("Ver pecio alimento 1") ; solomillo.calcularPrecio();//PARA PODER SACAR EL PRECIO DEL ALIMENTO SE DEBE CASTEAR EN EL MAIN.NO SE ACCEDE DIRECTAMENTE



        supermercadoEspecifico.mostrarPreciosFinales();


        Mesa mesaMadera =new Mesa("Madera ","10kg ",20 ,6);
        Mesa mesaVidrio=new Mesa("Vidrio ", "15kg ", 50 , 8);
        Silla sillaMadera=new Silla("Madera ", "4kg ",6 ,4);
        Silla sillaPlastico=new Silla("Plástico ", "3kg ",8 ,4);

        SupermercadoEspecifico supermercadoMuebles=new SupermercadoEspecifico();

        SupermercadoEspecifico<Mueble,Mesa> listaMueble=new SupermercadoEspecifico<Mueble,Mesa>();
        SupermercadoEspecifico<Alimento,Lacteo>lacteoSupermerE=new SupermercadoEspecifico<Alimento,Lacteo>();


        supermercadoMuebles.registrarElemento(mesaMadera);
        supermercadoMuebles.registrarElemento(mesaVidrio);
        supermercadoMuebles.registrarElemento(sillaMadera);
        supermercadoMuebles.registrarElemento(sillaPlastico);










    }


    }
