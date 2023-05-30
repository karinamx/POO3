
package Controles;

import java.io.Serializable;
import java.io.*;
import java.util.*;
import Documento.CLibro;



public class ArchivoL implements Serializable {
    
    //vamos a crear un objeto para poder guardar los diferentes libros y revistas
    ArrayList<CLibro> listarecuperar = new ArrayList<>();
    
    //metodo para generar la lectura del archivo
    
    public ArrayList<CLibro> leer(){
        try{
        
            try ( //primer tenemos que crear la lectura del buffer
                    ObjectInputStream in = new ObjectInputStream( 
                            new FileInputStream("libro.txt"))) {
                listarecuperar = (ArrayList<CLibro>)in.readObject();
                
                in.close();
            }
            
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Error" + e.getMessage());
        
        }
        return listarecuperar;
    }
    
    //el metodo para escribir
     public void serializar(ArrayList<CLibro> listaserializada){
        try{
        
            //generar el archivo de salida
            FileOutputStream salida = new FileOutputStream("libro.txt");
            //genero la escritura del objeto
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);
            
            //ya que lo tengo lo escribo
            salidaobjeto.writeObject(listaserializada);
            
        }catch(IOException e){
        
            System.out.println("Error... "+ e.getMessage());
        }
    }
}   