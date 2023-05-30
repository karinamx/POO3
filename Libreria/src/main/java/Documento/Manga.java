
package Documento;

import java.util.Scanner;

public class Manga extends CLibro {
    
    private String tipo_manga;
    
    public Manga() {
        super();
    }

    public Manga(String tipo_manga) {
        super();
        this.tipo_manga = tipo_manga;
    }
    
    public Manga(String tipo_revista, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.tipo_manga = tipo_revista; 
    }

    public String getTipo_manga() {
        return tipo_manga;
    }

    public void setTipo_manga(String tipo_manga) { 
        this.tipo_manga = tipo_manga;
    }
    
    public void agregarRevista() { // Corregido: nombre del método en minúscula
        
        Scanner entrada = new Scanner(System.in);
        
        // Instancia del documento
        CLibro datoslibro = new CLibro();
        
        // Ingresar los datos del documento
        datoslibro.aceptarDatos();
        
        System.out.println("Ingresa el tipo de Manga: ");
        tipo_manga = entrada.nextLine();
        
        // Resto del código...
        
    }
}


