package Inventario;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {






      /* LO ABSTRACTO LO PUSE A LO ULTIMO DEL EJERCICIO CASI,DESPUES DE HACER LAS IMPLEMENTACIONES Y LAS EXTENCIONES DE V -T*/

        Carne solomillo=new Carne("Buena ","Perú ",165,26);
        Carne lomo=new Carne("Muy Buena ","Colombia ",145,20);
        Lacteo leche=new Lacteo("Muy Buena","España",4,6);
        Lacteo yoghurt=new Lacteo("Excelente","España",3,6);

        SupermercadoEspecifico supermercadoAlimento1=new SupermercadoEspecifico<>(solomillo);
        SupermercadoEspecifico supermercadoAlimento2=new SupermercadoEspecifico<>(solomillo);
        SupermercadoEspecifico supermercadoAlimento3=new SupermercadoEspecifico<>(solomillo);
        SupermercadoEspecifico supermercadoAlimento4=new SupermercadoEspecifico<>(solomillo);




        supermercadoAlimento1.registrarElemento(solomillo); //VER PORQUE SE PUEDEN AGREFAR 2 EN UN MISMO SUPERMERCADO
        supermercadoAlimento1.registrarElemento(lomo);
        supermercadoAlimento2.registrarElemento(lomo);
        supermercadoAlimento3.registrarElemento(leche);
        supermercadoAlimento4.registrarElemento(yoghurt);

        System.out.println("Ver pecio alimento 1") ; solomillo.calcularPrecio();//PARA PODER SACAR EL PRECIO DEL ALIMENTO SE DEBE CASTEAR EN EL MAIN.NO SE ACCEDE DIRECTAMENTE


        supermercadoAlimento1.mostrarPreciosFinales(); //VER COMO MOSTRAR TODOS LOS DATOS


        Mesa mesaMadera =new Mesa("Madera ","10kg ",20 ,6);
        Mesa mesaVidrio=new Mesa("Vidrio ", "15kg ", 50 , 8);
        Silla sillaMadera=new Silla("Madera ", "4kg ",6 ,4);
        Silla sillaPlastico=new Silla("Plástico ", "3kg ",8 ,4);

        SupermercadoEspecifico supermercadoMuebles1=new SupermercadoEspecifico(mesaMadera);
        SupermercadoEspecifico supermercadoMuebles2=new SupermercadoEspecifico(mesaVidrio);
        SupermercadoEspecifico supermercadoMuebles3=new SupermercadoEspecifico(sillaMadera);
        SupermercadoEspecifico supermercadoMuebles4=new SupermercadoEspecifico(sillaPlastico);

        SupermercadoEspecifico<Mueble,Mesa> listaMueble=new SupermercadoEspecifico<Mueble,Mesa>(mesaMadera);
        SupermercadoEspecifico<Alimento,Lacteo>lacteoSupermerE=new SupermercadoEspecifico<Alimento,Lacteo>(leche);


        supermercadoMuebles1.registrarElemento(mesaMadera);
        supermercadoMuebles2.registrarElemento(mesaVidrio);
        supermercadoMuebles3.registrarElemento(sillaMadera);
        supermercadoMuebles4.registrarElemento(sillaPlastico);










    }


    }
