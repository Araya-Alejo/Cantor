package cantor;

import java.io.Serializable;

public class Canario extends SerCantor implements Serializable{
    
    /*Constructor*/
    public Canario(String nombre, String stringfechaN, Momento momento) {
        super(nombre, "Canario", stringfechaN, momento);
    }
    
    /*metodo sobreescrito*/
    @Override
    public void cantar(){
        System.out.println("Canario Canta");
    }
    
    /*metodo sobreescrito*/
    @Override
    public void hacerCantar(SerCantor objSC){
        objSC.cantar();
    }
    
}
