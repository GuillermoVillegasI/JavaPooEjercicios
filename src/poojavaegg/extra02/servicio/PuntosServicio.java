
package poojavaegg.extra02.servicio;

import java.util.Scanner;
import poojavaegg.extra02.entidades.Puntos;


public class PuntosServicio {
    
    Scanner leer = new Scanner ( System.in );
    Puntos puntos = new Puntos ();
    
    public Puntos crearpuntos (){
        
        System.out.println("INGRESE EL VALOR DE X1");
        puntos.setX1(leer.nextInt());
        System.out.println("INGRESE EL VALOR DE Y1");
        puntos.setY1(leer.nextInt());
        System.out.println("INGRESE EL VALOR DE X2");
        puntos.setX2(leer.nextInt());
        System.out.println("INGRESE EL VALOR DE Y2");
        puntos.setY2(leer.nextInt());
        
        return puntos;
    }
    
    public void calculo ( Puntos puntos ){
        
        float dist ;
        float parte;
        
        parte = ((puntos.getX2()-puntos.getX1())^2)+((puntos.getY2()-puntos.getY1())^2);
        dist = (float)(Math.sqrt(parte));
        
        System.out.println("LA DISTANCIA ENTRE LOS DOS PUNTOS ES: " + dist + " . ");
    }
}
