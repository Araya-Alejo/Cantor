package cantor;




public class Artista extends SerCantor{
    public Instrumento usa;


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
