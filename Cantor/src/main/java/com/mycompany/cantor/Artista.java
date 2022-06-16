package com.mycompany.cantor;



import java.time.LocalDate;

public class Artista extends SerCantor{

    public Artista(String nombre, String tipo, LocalDate fechaNacimiento) {
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
