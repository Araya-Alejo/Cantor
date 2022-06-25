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
            connect();
            PreparedStatement st = connect.prepareStatement("insert into Artistas (Nombre, FechaNacimiento, Momento, Instrumento) values (?,?,?,?)");
            st.setString(1, artista.nombre);
            st.setString(2, String.valueOf(artista.fechaNacimiento));
            st.setString(3, String.valueOf(artista.cuando));
            st.setString(4, String.valueOf(artista.usa));
            st.execute();
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally{
            close();
        }
    }
    
    public void saveGallo(Gallo gallo){
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("insert into Gallos (Nombre, FechaNacimiento, Momento) values (?,?,?)");
            st.setString(1, gallo.nombre);
            st.setString(2, String.valueOf(gallo.fechaNacimiento));
            st.setString(3, String.valueOf(gallo.cuando));
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
    }
    
    public void saveCanario(Canario canario){
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("insert into Canarios (Nombre, FechaNacimiento, Momento) values (?,?,?)");
            st.setString(1, canario.nombre);
            st.setString(2, String.valueOf(canario.fechaNacimiento));
            st.setString(3, String.valueOf(canario.cuando));
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
    }
    
    public void saveInstrumento(Instrumento ints){
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("insert into Instrumentos (Nombre) values (?)");
            st.setString(1, String.valueOf(ints));
            
            st.execute();
            System.out.println("Se carga el instrumento correctamente");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
    }
    
    public ArrayList<Artista> mostrarArtistas(){
        ArrayList<Artista> art= new ArrayList();
        ResultSet result = null;
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("select * from Artistas");
            result = st.executeQuery();
            
            while (result.next()) {
                Artista artista= new Artista(((Instrumento)result.getObject("Instrumento")),(result.getString("Nombre")), (result.getString("FechaNacimiento")), ((Momento)result.getObject("Momento")));
                art.add(artista);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
        return art;
    }
    
    public ArrayList<Gallo> mostrarGallos(){
        ArrayList<Gallo> gallos= new ArrayList();
        ResultSet result = null;
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("select * from Gallos");
            result = st.executeQuery();
            
            while (result.next()) {
                Gallo gallo= new Gallo(result.getString("Nombre"), result.getString("FechaNacimiento"), (Momento)result.getObject("Momento"));
                gallos.add(gallo);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
        return gallos;
    }
    
    public ArrayList<Canario> mostrarCanarios(){
        ArrayList<Canario>canarios= new ArrayList();
        ResultSet result = null;
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("select * from Canarios");
            result = st.executeQuery();
            
            while (result.next()) {
                Canario canario= new Canario(result.getString("Nombre"), result.getString("FechaNacimiento"), (Momento)result.getObject("Momento"));
                canarios.add(canario);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
        return canarios;
    }
    
    public ArrayList<Instrumento> mostrarInstrumentos(){
        ArrayList<Instrumento> instrumentos= new ArrayList();
        ResultSet result = null;
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("select * from Instrumentos");
            result = st.executeQuery();
            
            while (result.next()) {
                Instrumento inst= new Instrumento(result.getString("NombreInstrumento"));
                instrumentos.add(inst);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
        return instrumentos;
    }
    
    public void deleteArtista(String cadena){
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("delete from Artistas where Nombre=?");
            st.setString(1, cadena);
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
    }
    
    public void deleteGallo(String cadena){
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("delete from Gallos where Nombre=?");
            st.setString(1, cadena);
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
    }
    
    public void deleteCanario(String cadena){
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("delete from Canarios where Nombre=?");
            st.setString(1, cadena);
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
    }
    
    public void editArtista(String cadena, Instrumento instr, Momento momento){
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("update Artistas set (Momento, Instrumento) values (?,?) where Nombre=?");
            st.setString(1, String.valueOf(momento));
            st.setString(2, String.valueOf(instr));
            st.setString(3, cadena);
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
    }
    
    public void editGallo(String cadena, Instrumento instr, Momento momento){
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("update Gallos set (Momento, Instrumento) values (?,?) where Nombre=?");
            st.setString(1, String.valueOf(momento));
            st.setString(2, String.valueOf(instr));
            st.setString(3, cadena);
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
    }
    
    public void editCanario(String cadena, Instrumento instr, Momento momento){
        try {
            connect();
            PreparedStatement st = connect.prepareStatement("update Canarios set (Momento, Instrumento) values (?,?) where Nombre=?");
            st.setString(1, String.valueOf(momento));
            st.setString(2, String.valueOf(instr));
            st.setString(3, cadena);
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            close();
        }
    }
    
    
}
