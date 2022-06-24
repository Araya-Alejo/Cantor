package base_datos;

import cantor.Artista;
import cantor.Canario;
import cantor.Gallo;
import cantor.Instrumento;
import cantor.Momento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

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
    
    public ArrayList<Artista> mostrarArtistas(){
        ArrayList<Artista> art= new ArrayList();
        ResultSet result = null;
        try {
            PreparedStatement st = connect.prepareStatement("select * from Artistas");
            result = st.executeQuery();
            
            while (result.next()) {
                Artista artista= new Artista((Instrumento)result.getObject("Instrumento"),result.getString("Nombre"), result.getString("FechaNacimiento"), (Momento)result.getObject("Momento"));
                art.add(artista);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return art;
    }
    
    public ArrayList<Gallo> mostrarGallos(){
        ArrayList<Gallo> gallos= new ArrayList();
        ResultSet result = null;
        try {
            PreparedStatement st = connect.prepareStatement("select * from Gallos");
            result = st.executeQuery();
            
            while (result.next()) {
                Gallo gallo= new Gallo(result.getString("Nombre"), result.getString("FechaNacimiento"), (Momento)result.getObject("Momento"));
                gallos.add(gallo);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return gallos;
    }
    
    public ArrayList<Canario> mostrarCanarios(){
        ArrayList<Canario>canarios= new ArrayList();
        ResultSet result = null;
        try {
            PreparedStatement st = connect.prepareStatement("select * from Canarios");
            result = st.executeQuery();
            
            while (result.next()) {
                Canario canario= new Canario(result.getString("Nombre"), result.getString("FechaNacimiento"), (Momento)result.getObject("Momento"));
                canarios.add(canario);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return canarios;
    }
    
    public ArrayList<Instrumento> mostrarInstrumentos(){
        ArrayList<Instrumento> instrumentos= new ArrayList();
        ResultSet result = null;
        try {
            PreparedStatement st = connect.prepareStatement("select * from Instrumentos");
            result = st.executeQuery();
            
            while (result.next()) {
                Instrumento inst= new Instrumento(result.getString("Nombre"));
                instrumentos.add(inst);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return instrumentos;
    }
    
    public void deleteArtista(Artista artista){
        try {
            PreparedStatement st = connect.prepareStatement("delete Artistas where Nombre=?");
            st.setString(1, artista.nombre);
            st.setString(2, String.valueOf(artista.fechaNacimiento));
            st.setString(3, String.valueOf(artista.cuando));
            st.setString(4, String.valueOf(artista.usa));
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
