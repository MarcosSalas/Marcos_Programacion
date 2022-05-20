package DataBase;

public interface SchemaCreacionBd_Practica {
    String dtbs = "creacionbd";
    String user="root";
    String pass="";
    String host ="127.0.0.1:3306";
    String url="jdbc:mysql://" + host + "/" + dtbs
                    + "?" + "user=" + user + "&password=" + pass;

    String TAB_PERFILES="perfiles";
    String TAB_USUARIOS="usuario";
    String COL_ID="Id";
    String COL_NOMBRE="Nombre";
    String COL_APELLIDO="Apellido";
    String COL_TELEFONO="Telefono";
    String COL_SUELDO="Sueldo";
    String COL_PAIS="Pais";
    String COL_FK_ID="Id_Perfil";



}
