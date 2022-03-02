
package poojavaegg.extra02.principal;

import java.util.Scanner;
import poojavaegg.extra02.entidades.Puntos;
import poojavaegg.extra02.servicio.PuntosServicio;


public class Extra02 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner ( System.in );
        Puntos puntos = new Puntos ();
        PuntosServicio puntosServicio = new PuntosServicio () ;
        
        Puntos p1 = puntosServicio.crearpuntos();
        System.out.println(p1);
        puntosServicio.calculo(p1);
        
    }
    
}
