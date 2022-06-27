package cantor;

import java.io.Serializable;

/*Clase Artista*/
public class Artista extends SerCantor implements Serializable{
    public Instrumento usa;

    /*constructor en donde la diferencia es que se pasa un string en la fecha de nacimiento, que luego se tratará
    en el constructor de la super clase. Otra diferencia es que el string de tipo, se pasa un string para guardar 
    en tipo*/
    public Artista(Instrumento usa, String nombre, String stringfechaN, Momento momento) {
        super(nombre, "Artista", stringfechaN, momento);
        this.usa = usa;
    }
    
    /*Metodo cantar*/
    public void cantar(){
        System.out.println("Artista Canta");
    }
    
    /*Metodo sobreescrito*/
    @Override
    public void hacerCantar(SerCantor objSC) {
        cantar();
    }
    
    public boolean hacerCantar() {
        cantar();
        return true;
    }
}
