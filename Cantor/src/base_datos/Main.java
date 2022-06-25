package base_datos;


import cantor.Instrumento;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Conector conn= new Conector();
        
        ArrayList<Instrumento> instrumentos = conn.getGestorInstrumento().getDatos();
        
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento.nombre);
        }
                
    }

}
