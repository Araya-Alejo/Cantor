package base_datos;


import cantor.Artista;
import cantor.Instrumento;
import cantor.Momento;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Conector conn= new Conector();
//        Momento mom = new Momento();
//        mom.tipo= "mañana";
//        Instrumento inst = new Instrumento("Saxo");
//        Artista art = new Artista(inst, "Rodrigo", "19121992", mom);
//        conn.getGestorArtista().guardarDato(art);
        ArrayList<Artista> artistas = conn.getGestorArtista().getDatos();
        
        for (Artista artista : artistas) {
            System.out.println(artista.nombre);
        }
                
    }

}
