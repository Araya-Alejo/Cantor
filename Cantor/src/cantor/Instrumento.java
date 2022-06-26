package cantor;

import java.io.Serializable;

public class Instrumento implements Serializable{
    public String nombre;
    public String tipo;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean ejecuta(){
        System.out.println("Suena");
        return true;
    }
}
