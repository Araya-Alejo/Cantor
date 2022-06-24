package cantor;




public class Gallo extends SerCantor{

    public Gallo(String nombre, String tipo, String stringfechaN, Momento momento) {
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
