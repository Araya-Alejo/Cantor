package base_datos;

import cantor.Artista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    String url = "base_datos.db";
    Connection connect;

    public void connect() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connect != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage());
        }
    }

    public void close() {
        try {
            connect.close();
        } catch (SQLException ex) {
            System.err.println("Error de Cerrar base de datos");
        }
    }
    
    /**
    public void saveAlumno(Artista artista){
        try {
            PreparedStatement st = connect.prepareStatement("insert into alumnos (Nombre, FechaNacimiento, ) values (?,?)");
            st.setString(1, artista.getNombre());
            st.setString(2, artista.getApellidos());
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }
     */
    
}
