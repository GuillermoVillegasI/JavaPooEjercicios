
package poojavaegg.fcolecciones.ejercicio04.servicios;

import java.util.Scanner;
import poojavaegg.fcolecciones.ejercicio04.entidades.Pelicula;


public class PeliculaServicio {
    
    Scanner leer = new Scanner ( System.in ). useDelimiter ("\n");
    Pelicula pelicula = new Pelicula ();
    
    public Pelicula crearpeli (){
        
        System.out.println("INGRESE EL NOMBRE DE LA PELICULA");
        pelicula.setTitulo(leer.next());
        System.out.println("INGRESE EL NOMBRE DEL DIRECTOR DE LA PELICULA");
        pelicula.setDirector(leer.next());
        System.out.println("INGRESE LA DURACIÓN DE LA PELICULA");
        pelicula.setDuracion(leer.nextInt());
        
        return new Pelicula( pelicula.getTitulo() , pelicula.getDirector() , pelicula.getDuracion() );
        
    }

}
