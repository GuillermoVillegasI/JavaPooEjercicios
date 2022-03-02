package poojavaegg.ejercicio04.principal;

import poojavaegg.ejercicio04.entidades.rectangulo;
import java.util.Scanner;


public class Ejercicio4 {
    
//    Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método para crear el
//  rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para calcular el
//  perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
//  los métodos getters, setters y constructores correspondientes.
//  Superficie = base * altura / Perímetro = (base + altura) * 2.

    public static void main(String[] args) {
        
        Scanner leer = new Scanner ( System.in );
        
        System.out.println("INGRESE LA BASE Y LA ALTURA DEL RECTANGULO");
        
        rectangulo rec = new rectangulo ();
        
        rec.setBase(leer.nextDouble());
        rec.setAltura(leer.nextDouble());
        
        System.out.println("LA SUPERFICIE DEL RECTANGULO ES: " + rec.sup() + " . ");
        System.out.println("EL PERIMETRO DEL RECTANGULO ES: " + rec.per() + " . ");
        System.out.println();      
        rec.dib(rec.getBase(), rec.getAltura());
        System.out.println();
        
    }
    
}
