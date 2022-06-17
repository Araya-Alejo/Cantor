package base_datos;

public class Main {

    public static void main(String[] args) {
        
        Conector con = new Conector();
        con.connect();
        con.close();
        
        
    }
    
}
