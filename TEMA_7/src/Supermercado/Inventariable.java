package Supermercado;

public interface Inventariable { // Se dá por hecho que si es interface,TODO es público y final;
    double IVA_MUEBLES = 0.21, IVA_ALIMENTOS = 0.10; //variables final //LO CORREGIMOS COMO DOUBLE
        //LUEGO LO DIVIDO /100

    void calcularPrecio(); //public void....


}
