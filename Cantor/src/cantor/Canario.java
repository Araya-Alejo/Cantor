package cantor;



public class Canario extends SerCantor{

    public Canario(String nombre, String tipo, String stringfechaN, Momento momento) {
        super(nombre, tipo, stringfechaN, momento);
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
