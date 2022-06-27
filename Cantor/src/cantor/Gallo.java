package cantor;

import java.io.Serializable;

public class Gallo extends SerCantor implements Serializable{

    /*Constructor*/
    public Gallo(String nombre, String stringfechaN, Momento momento) {
        super(nombre, "Gallo", stringfechaN, momento);
    }

    /*Metodo sobreescrito*/
    @Override
    public void cantar(){
        System.out.println("Gallo Canta");
    }
    /*Metodo sobreescrito*/
    @Override
    public void hacerCantar(SerCantor objSC){
        objSC.cantar();
    }
    
}
