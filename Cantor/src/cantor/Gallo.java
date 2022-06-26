package cantor;

import java.io.Serializable;

public class Gallo extends SerCantor implements Serializable{

    public Gallo(String nombre, String stringfechaN, Momento momento) {
        super(nombre, "Gallo", stringfechaN, momento);
    }

    @Override
    public void cantar(){
        System.out.println("Gallo Canta");
    }
    @Override
    public void hacerCantar(SerCantor objSC){
        objSC.cantar();
    }
    
}
