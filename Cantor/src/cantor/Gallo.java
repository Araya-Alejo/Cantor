package com.mycompany.cantor;



import java.time.LocalDate;

public class Gallo extends SerCantor{

    public Gallo(String nombre, String tipo, LocalDate fechaNacimiento) {
        super(nombre, tipo, fechaNacimiento);
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
