
package poojavaegg.ejercicio08.principal;

import java.util.Scanner;
import poojavaegg.ejercicio08.entidades.Cadena;
import poojavaegg.ejercicio08.servicios.CadenaServicio;


public class Ej8 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner ( System.in ). useDelimiter("\n");
        
        CadenaServicio cadenaServicio = new CadenaServicio () ;
        
        Cadena cadena = new Cadena () ;
        
        Cadena c1 = cadenaServicio.cadena();
        cadenaServicio.creaca(c1);
        System.out.println(c1);
        cadenaServicio.mostrarvocales(c1);
        cadenaServicio.invfrase(c1);
        cadenaServicio.vecesrep(c1);
        cadenaServicio.complongi(c1);
        cadenaServicio.unir(c1);
        cadenaServicio.reemp(c1);
        cadenaServicio.contiene(c1);
        
                
    }
    
    
}
