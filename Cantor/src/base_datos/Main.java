package base_datos;


import cantor.Artista;
import cantor.Canario;
import cantor.Gallo;
import cantor.Instrumento;
import cantor.Momento;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Conector conn= new Conector();
        Momento mom = new Momento();
        mom.tipo= "mañana";
        Instrumento inst = new Instrumento("Saxo");
        Artista art = new Artista(inst, "Rodrigo", "19121992", mom);
        System.out.println(art.calcularEdad());
//        conn.getGestorArtista().guardarDato(art);
//        ArrayList<Artista> artistas = conn.getGestorArtista().getDatos();
//        ArrayList<Gallo> gallos = conn.getGestorGallo().getDatos();
//        ArrayList<Instrumento> instrumentos = conn.getGestorInstrumento().getDatos();
//        ArrayList<Canario> canarios = conn.getGestorCanario().getDatos();
        
//        System.out.println("Muesta de artistas");
//        for (Artista artista : artistas) {
//            System.out.println(artista.nombre);
//        }
//        System.out.println("-------------------");
//        System.out.println("Muestra de gallos");
//        for (Gallo gallo : gallos) {
//            System.out.println(gallo.nombre);
//        }
//        System.out.println("-------------------");
//        System.out.println("Muestra de canarios");
//        for (Canario canario : canarios) {
//            System.out.println(canario.nombre);
//        }
//        System.out.println("-------------------");
//        System.out.println("muestra de instrumentos");
//        for (Instrumento instrumento : instrumentos) {
//            System.out.println(instrumento.nombre);
//        }
                
    }

}
