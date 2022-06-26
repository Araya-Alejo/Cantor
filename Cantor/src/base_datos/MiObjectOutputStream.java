package base_datos;

import java.io.*;

public class MiObjectOutputStream extends ObjectOutputStream{
    
    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out); 
    }
    
    protected MiObjectOutputStream() throws IOException, SecurityException{
        super(); 
    }
    
    @Override
    protected void writeStreamHeader() throws IOException{
        
    }
}