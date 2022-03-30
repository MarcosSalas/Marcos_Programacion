package Supermercado;

public final class Carne extends Alimento { //es final porque no extiende nadie debajo
    //variables
    private int proteínas;
    //constructor

    public Carne(String calidad, String origen, int precio, int proteínas) {
        super(calidad, origen, precio);
        this.proteínas = proteínas;
    }

    public Carne() {
    }
    //metodos

    @Override
    public void mostrarDatosAlimento() { //PARA PODER SACAR EL PRECIO DEL ALIMENTO SE DEBE CASTEAR EN EL MAIN.NO SE ACCEDE DIRECTAMENTE
        super.mostrarDatosAlimento();
        System.out.println("Proteínas "+proteínas);
    }


    //metodos set-get


    public int getProteínas() {
        return proteínas;
    }

    public void setProteínas(int proteínas) {
        this.proteínas = proteínas;
    }
}
