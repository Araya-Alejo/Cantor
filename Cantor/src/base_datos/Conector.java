package base_datos;

import cantor.Artista;
import cantor.Canario;
import cantor.Gallo;
import cantor.Instrumento;
import java.io.File;

public class Conector {
    
    //se crea esta clase con estos atributos para generar un gestor de archivos por cada archivo que vamos a tener
    private GestorFicheroSerializado<Artista> gestorArtista = null;
    private GestorFicheroSerializado<Gallo> gestorGallo = null;
    private GestorFicheroSerializado<Canario> gestorCanario = null;
    private GestorFicheroSerializado<Instrumento> gestorInstrumento = null;

    //solo si el archivo existe, se instancia
    public void instanciaArchivos(File artistas, File gallos, File canarios, File instrumentos){
        this.gestorArtista = new GestorFicheroSerializado(artistas);
        this.gestorGallo = new GestorFicheroSerializado(gallos);
        this.gestorCanario = new GestorFicheroSerializado(canarios);
        this.gestorInstrumento = new GestorFicheroSerializado(instrumentos);
    }
    
    //se crean los archivos si no lo estan
    public void creaArchivos(){
        this.gestorArtista = new GestorFicheroSerializado("artistas.ddr");
        this.gestorGallo = new GestorFicheroSerializado("gallos.ddr");
        this.gestorCanario = new GestorFicheroSerializado("canarios.ddr");
        this.gestorInstrumento = new GestorFicheroSerializado("instrumentos.ddr");
    }
    
    /* en el siguiente constructor se instancian los ficheros y se indica mediante un if si estan creados o no para llamar 
    1 de los 2 metodos anteriores */
    public Conector() {
        File artistas = new File("artistas.drr");
        File gallos = new File("gallos.drr");
        File canarios = new File("canarios.drr");
        File instrumentos = new File("instrumentos.drr");
        
        if(artistas.exists() && gallos.exists() && canarios.exists() && instrumentos.exists()){
            instanciaArchivos(artistas, gallos, canarios, instrumentos);
            //System.out.println("Se instancian los archivos");
        }else{
            creaArchivos();
            //System.out.println("Se crean los archivos");
        }
    }
    
    //Setters y Getters
    public GestorFicheroSerializado<Artista> getGestorArtista() {
        return gestorArtista;
    }

    public void setGestorArtista(GestorFicheroSerializado<Artista> gestorArtista) {
        this.gestorArtista = gestorArtista;
    }

    public GestorFicheroSerializado<Gallo> getGestorGallo() {
        return gestorGallo;
    }

    public void setGestorGallo(GestorFicheroSerializado<Gallo> gestorGallo) {
        this.gestorGallo = gestorGallo;
    }

    public GestorFicheroSerializado<Canario> getGestorCanario() {
        return gestorCanario;
    }

    public void setGestorCanario(GestorFicheroSerializado<Canario> gestorCanario) {
        this.gestorCanario = gestorCanario;
    }

    public GestorFicheroSerializado<Instrumento> getGestorInstrumento() {
        return gestorInstrumento;
    }

    public void setGestorInstrumento(GestorFicheroSerializado<Instrumento> gestorInstrumento) {
        this.gestorInstrumento = gestorInstrumento;
    }
    
    
    
}
