package cantor;

import java.io.Serializable;



public class Canario extends SerCantor implements Serializable{

    public Canario(String nombre, String stringfechaN, Momento momento) {
        super(nombre, "Canario", stringfechaN, momento);
    }
    
    

    @Override
    public void cantar(){
        System.out.println("Canario Canta");
    }
    @Override
    public void hacerCantar(SerCantor objSC){
        objSC.cantar();
    }
    
}
