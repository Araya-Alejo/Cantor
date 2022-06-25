package base_datos;



import cantor.Artista;
import cantor.Canario;
import cantor.Gallo;
import cantor.Instrumento;

public class Conector {
    
    private GestorFicheroSerializado<Artista> gestorArtista = new GestorFicheroSerializado("artistas.ddr");
    private GestorFicheroSerializado<Gallo> gestorGallo = new GestorFicheroSerializado("gallos.ddr");
    private GestorFicheroSerializado<Canario> gestorCanario = new GestorFicheroSerializado("canarios.ddr");
    private GestorFicheroSerializado<Instrumento> gestorInstrumento = new GestorFicheroSerializado("instrumentos.ddr");

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
