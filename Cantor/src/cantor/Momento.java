package cantor;

import java.io.Serializable;

public class Momento implements Serializable{
    public String tipo;
    private boolean alegria;

    
    public boolean isAlegria() {
        return alegria;
    }

    public void setAlegria(boolean alegria) {
        this.alegria = alegria;
    }
    
    public String horario(){
        return "hola";
    }
    
    /*Constructor*/
    public Momento() {
    }
}
