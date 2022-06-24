package base_datos;

import cantor.Momento;
import cantor.Artista;
import cantor.Instrumento;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Momento mom = new Momento();
        mom.tipo="tarde";
        Artista art = new Artista(null, "Artista", "12072000", mom);
        
        
        
        Conector con = new Conector();
        con.connect();
        ArrayList<Instrumento> instrumentos = new ArrayList();
        instrumentos=con.mostrarInstrumentos();
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento.nombre);
            
        }
        con.deleteArtista(art);
        con.close();
        
        
    }
    
}
