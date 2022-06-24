package cantor;




import java.time.LocalDate;

import java.time.Period;


public abstract class SerCantor implements PuedeCantar{
    public final String nombre;
    public String tipo;
    public final LocalDate fechaNacimiento;
    public Momento cuando;

    public SerCantor(String nombre, String tipo, String stringfechaN, Momento momento) {
        this.nombre = nombre;
        this.tipo = tipo;
        int dia = Integer.valueOf(stringfechaN.substring(0, 2));
        int mes = Integer.valueOf(stringfechaN.substring(2, 4));
        int ano = Integer.valueOf(stringfechaN.substring(4, 8));
        LocalDate fn = LocalDate.of(ano, mes, dia);
        this.fechaNacimiento = fn;
        this.cuando = momento;
    }
    
    
    
    public abstract void hacerCantar(SerCantor objSC);
    
    public int calcularEdad(){
        LocalDate fechaHoy = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaHoy).getYears();
        return edad;
    }
}
