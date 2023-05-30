
package Documento;

import java.util.Scanner;

public class Revista extends CLibro {
    //tipos de revista
    private String tipo_revista;
    
    public Revista(){
    }

    public Revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }
    

    public Revista(String tipo_revista, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.tipo_revista = tipo_revista;
    }

    public String getTipo_revista() {
        return tipo_revista;
    }

    public void setTipo_revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }
    
    public void AgregarRevista(){
        
        Scanner entrada = new Scanner(System.in);
        //instancia del documeno
        CLibro datoslibro = new CLibro();
        
        //ingresados los datos del documento
        datoslibro.aceptarDatos();
        System.out.println("Ingresa el tipo de revista: ");
        tipo_revista = entrada.nextLine();
        
        
        
        
    }
    
    
    
}
