package base_datos;

import cantor.Artista;
import cantor.Canario;
import cantor.Gallo;
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
    
    
    public void saveArtista(Artista artista){
        try {
            PreparedStatement st = connect.prepareStatement("insert into Artistas (Nombre, FechaNacimiento, Momento, Instrumento) values (?,?,?,?)");
            st.setString(1, artista.nombre);
            st.setString(2, String.valueOf(artista.fechaNacimiento));
            st.setString(3, String.valueOf(artista.cuando));
            st.setString(4, String.valueOf(artista.usa));
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void saveGallo(Gallo gallo){
        try {
            PreparedStatement st = connect.prepareStatement("insert into Gallos (Nombre, FechaNacimiento, Momento) values (?,?,?)");
            st.setString(1, gallo.nombre);
            st.setString(2, String.valueOf(gallo.fechaNacimiento));
            st.setString(3, String.valueOf(gallo.cuando));
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void saveCanario(Canario canario){
        try {
            PreparedStatement st = connect.prepareStatement("insert into Canarios (Nombre, FechaNacimiento, Momento) values (?,?,?)");
            st.setString(1, canario.nombre);
            st.setString(2, String.valueOf(canario.fechaNacimiento));
            st.setString(3, String.valueOf(canario.cuando));
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
