package cantor;

<<<<<<< HEAD
import java.util.ArrayList;

public class Artista extends SerCantor{
    public ArrayList<Instrumento> usa;
=======



public class Artista extends SerCantor{

    
>>>>>>> d00ed7af3d3be1d5335896a907fc65e7dc6570f3
    
    public Artista(String nombre, String tipo, String fechaNacimiento) {
        super(nombre, tipo, fechaNacimiento);
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
