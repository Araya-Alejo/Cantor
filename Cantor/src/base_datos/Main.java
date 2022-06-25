package base_datos;

import cantor.Momento;
import cantor.Artista;
import cantor.Instrumento;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Momento mom = new Momento();
        mom.tipo = "mañana";
        Instrumento inst = new Instrumento("Guitarra Electrica");
        Instrumento inst1 = new Instrumento("Guitarra acustica");
        Instrumento inst2 = new Instrumento("saxo");
        //Artista art = new Artista(inst, "Rodrigo", "19121992", mom);
        GestorFicheroSerializado<Instrumento> gestor = new GestorFicheroSerializado("instumento.ddr");
        gestor.guardarDato(inst1);
        gestor.guardarDato(inst2);
        System.out.println(gestor.existeDato(inst2));
        gestor.borrarDato(inst2);
        System.out.println(gestor.existeDato(inst2));
        ArrayList<Instrumento> instrumentos = new ArrayList();
        instrumentos = gestor.getDatos();
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento.nombre);
        }
    }

}
