package cantor;




import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public abstract class SerCantor implements PuedeCantar{
    public final String nombre;
    public String tipo;
    public final LocalDate fechaNacimiento;
    public Momento cuando;

    public SerCantor(String nombre, String tipo, String stringfechaN) {
        this.nombre = nombre;
        this.tipo = tipo;
        int dia = 
        LocalDate fn = LocalDate.of(0, Month.MARCH, 0);
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public abstract void hacerCantar(SerCantor objSC);
    
    public int calcularEdad(){
        LocalDate fechaHoy = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaHoy).getYears();
        return edad;
    }
}
