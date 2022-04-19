package Repaso.Ejer2;

public final class Cuenta {


    private int id, pin;
    double saldo;


    public Cuenta() {
    }

    public void ingresarDinero(double dineroMet) {
        saldo += dineroMet;
    }


    public void sacarDinero(double dineroMet) {
        saldo -= dineroMet;
    }
    public boolean retirTodo(boolean retTodo){
    //    System.out.println("ver RETIRARTODO "+retTodo);

        if (retTodo==true && saldo>0){
         //   System.out.println("Su saldo  ANTES "+saldo);
            saldo-=saldo;
            System.out.println("Dinero retirado,su saldo Actual es "+saldo);
            return retTodo;

        }else {
            retTodo=false;
            System.out.println("Operación cancelada,su saldo Actual es "+saldo);
            return retTodo;
        }
    }






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
