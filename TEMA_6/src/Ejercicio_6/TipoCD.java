package Ejercicio_6;

public enum TipoCD {

    musical("Musical"),monologo("Monologo"),educativo("Educativo");


    String nombreCd;

    TipoCD(String nombreCd){
        this.nombreCd=nombreCd;

    }

    public String getNombreCd() {
        return nombreCd;
    }

    public void setNombreCd(String nombreCd) {
        this.nombreCd = nombreCd;
    }

}
