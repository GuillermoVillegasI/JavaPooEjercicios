
package poojavaegg.extra01.principal;

import java.util.Scanner;
import poojavaegg.extra01.entidades.Cancion;


public class Extra1 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner ( System.in ). useDelimiter("\n");
        Cancion cancion = new Cancion ();
        
        System.out.println(" INGRESE EL TITULO DE LA CANCION ");
        cancion.setTitulo(leer.next());
        System.out.println(" INGRESE EL AUTOR DE LA CANCION ");
        cancion.setAutor(leer.next());
        
        System.out.println(cancion);
        
    }
    
}
