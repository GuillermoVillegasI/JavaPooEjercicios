
package poojavaegg.ejercicio0012y3.principal;

import java.util.Scanner;
import poojavaegg.ejercicio0012y3.entidades.Circunferencia;


public class Ejercicio2 {

//    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
//      a) Método constructor que inicialice el radio pasado como parámetro.
//      b) Métodos get y set para el atributo radio de la clase Circunferencia.
//      c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
//      d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//      e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
                
        System.out.println("INGRESE EL RADIO");
        
        Circunferencia circunferencia = new Circunferencia( (leer.nextFloat())  );
        
        
        System.out.println(circunferencia);
        
        circunferencia.area();
        circunferencia.perimetro();
        
    }
    
}
