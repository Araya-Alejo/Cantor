package cantor;

import java.io.Serializable;

public class Artista extends SerCantor implements Serializable{
    public Instrumento usa;

    public Artista(Instrumento usa, String nombre, String stringfechaN, Momento momento) {
        super(nombre, "Artista", stringfechaN, momento);
        this.usa = usa;
    }

    public void cantar(){
        System.out.println("Artista Canta");
    }
    
    @Override
    public void hacerCantar(SerCantor objSC) {
        cantar();
    }
    
    public boolean hacerCantar() {
        cantar();
        return true;
    }
}
