package base_datos;

import java.io.*;

/*Esta clase se crea con el fin de solucionar un error que nos dio al abrir y cerrar el archivo
muchas veces, este error está relacionado con la cabecera que incluye el ObjectOutputStream cuando guarda un 
objeto, que lo hace con el metodo writeStreamHeader. Hereda de ObjectOutputStream para sobreescribir ese metodo*/
public class MiObjectOutputStream extends ObjectOutputStream{
    
    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out); 
    }
    
    protected MiObjectOutputStream() throws IOException, SecurityException{
        super(); 
    }
    
    //se sobreescribe el metodo para que no haga nada
    @Override
    protected void writeStreamHeader() throws IOException{
        
    }
}