
package base_datos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorFicheroSerializado<T> {

    //atributos del gestor para poder tratar los datos
    private File fichero;
    private ArrayList<T> datos;

    //se utiliza este constructor si los archivos no estan creados
    public GestorFicheroSerializado(String fichero) {
        this.fichero = new File(fichero);
        this.datos = new ArrayList();
        obtenerDatos();
    }
    
    //se utiliza este constructor si los archivos si estan creados
    public GestorFicheroSerializado(File fichero) {
        this.fichero = fichero;
        this.datos = new ArrayList();
        obtenerDatos();
    }

    //metodo para obtener los datos del archivo
    public void obtenerDatos() {
        if (fichero.exists()) {
            T elemento;
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
                while (true) {
                    elemento = (T) ois.readObject();
                    datos.add(elemento);
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (EOFException ex) {
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    //metodo para guardar un dato en el archivo
    public void guardarDato(T elemento) {
        if (fichero.exists() && fichero.length() > 0) {
            /*cuando el archivo ya contiene datos se hace uso de la clase que hereda 
            de ObjectOutputStream para poder abrir y cerrar el archivo multiples veces*/
            try (MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(fichero, true))) {
                oos.writeObject(elemento);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
                oos.writeObject(elemento);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        datos.add(elemento);
    }

    /*Metodo para obtener un arraylist con los datos*/
    public ArrayList<T> getDatos() {
        return datos;
    }

    /*metodo para mostrar los datos por consola, utilizado en 
    el desarrollo de la aplicacion para verificacion de los datos*/
    public void mostrarDatos() {
        for (T e : datos) {
            System.out.println(e);
        }
    }

    /*Metodo para buscar un dato en especifico*/
    public boolean existeDato(T elemento) {
        for (T e : datos) {
            if (e.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    /*metodo para eliminar un dato en especifico*/
    public void borrarDato(T elemento) {
        if(datos.remove(elemento)){
            ArrayList<T> copia = datos;
            datos = new ArrayList<>();
            fichero.delete();
            for (T e : copia) {
                guardarDato(e);
            }
        }
    }

}