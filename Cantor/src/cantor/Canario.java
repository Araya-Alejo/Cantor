package cantor;



import java.time.LocalDate;

public class Canario extends SerCantor{

    public Canario(String nombre, String tipo, String fechaNacimiento) {
        super(nombre, tipo, fechaNacimiento);
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
