
package poojavaegg.ejercicio12.principal;

import java.util.Scanner;
import java.util.Date;
import poojavaegg.ejercicio12.entidades.Person;
import poojavaegg.ejercicio12.servicios.PersonServicio;


public class Ej12 {
    

    public static void main(String[] args) {
        
        Scanner leer  =  new Scanner ( System.in ). useDelimiter("\n");
        Person person = new Person ();
        PersonServicio personServicio =  new PersonServicio();
        
        Person p1 = personServicio.crearper();
        personServicio.edad(p1);
        if ( personServicio.menor(p1) == true ){
            System.out.println(" UD ES MENOR QUE SU COMPAÑERO ");
        }else {
            System.out.println(" UD ES MAYOR QUE SU COMPAÑERO ");
        }
        personServicio.mostrar(p1);
        
        
    }
    
}
