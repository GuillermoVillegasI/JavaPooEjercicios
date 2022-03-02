
package poojavaegg.ejercicio12.servicios;

import java.util.Scanner;
import java.util.Date;
import poojavaegg.ejercicio12.entidades.Person;

public class PersonServicio {
    
    Scanner leer = new Scanner ( System.in ). useDelimiter("\n");
    Person person = new Person ();
    
    public Person crearper (){
        
        System.out.println("INGRESE SU NOMBRE");
        person.setNom(leer.next());
        System.out.println("INGRESE SU DIA DE NACIMIENTO");
        int dia = leer.nextInt();
        System.out.println("INGRESE SU MES DE NACIMIENTO");
        int mes = leer.nextInt();
        mes = mes - 1 ;
        System.out.println("INGESE SU AÑO DE NACIEMIENTO");
        int anio = leer.nextInt();
        anio = anio - 1900;
        
        Date nac = new Date ( anio , mes , dia );
        
        person.setNac(nac);
        System.out.println();
                       
        return person;
    }
    
    public void edad ( Person person){
        
        Date actual = new Date ();
        Date nac = person.getNac();
        int edad ;
        edad = ( actual.getYear() - nac.getYear());
        System.out.println("UD TIENE: " + edad + " ANIOS DE EDAD. ");
        System.out.println();
    }
    
    public boolean menor ( Person Person){
        System.out.println();
        boolean men = false;
        Date actual = new Date ();
        Date nac = person.getNac();
        int edad ;
        edad = ( actual.getYear() - nac.getYear());
        
        
        System.out.println("INGRESE LA EDAD DE SU COMPAÑERO");
        int ed = leer.nextInt();
        
        if (ed > edad){
            men = true;
        }       
        
       return men;
    }
    
    public void mostrar (Person Person){
        System.out.println();
        System.out.println(" SU NOMBRE ES: " + person.getNom() + " Y SU FECHA DE NACIMIENTO ES: " + person.getNac() + " .");
        
    }
    
    
    
}
