
package poojavaegg.fcolecciones.ejercicio06.principal;

import java.util.Scanner;
import poojavaegg.fcolecciones.ejercicio06.entidades.Producto;
import poojavaegg.fcolecciones.ejercicio06.servicio.ProductoServicio;
public class Ejercicio06 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner ( System.in ). useDelimiter("\n");
        ProductoServicio prodS = new ProductoServicio ();
        Producto producto = new Producto ();
        
        int elec ;
        do {
            
            System.out.println("INGRESE LA OPCION QUE DESEA REALIZAR");
            System.out.println();
            System.out.println("1 - AGREGAR UN PRODUCTO");
            System.out.println("2 - MODIFICAR PRECIO");
            System.out.println("3 - ELIMINAR PRODUCTO");
            System.out.println("4 - MOSTRAR PRODUCTOS ACTUALES");
            System.out.println("5 - SALIR");
            elec = leer.nextInt();
            
            switch ( elec ){
                
                case 1 : 
                    prodS.agregaprod(prodS.creaprod());
                    break;
                case 2 :
                    System.out.println("QUE PRODUCTO DESEA MODIFICAR ?");
                    String p = leer.next();
                    prodS.modpreci(p);
                    break;
                case 3 :
                    System.out.println("QUE PRODUCTO DESEA ELIMINAR ?");
                    String p2 = leer.next();
                    prodS.eliminar(p2);
                    break;
                case 4 : 
                    prodS.mostrar();
                    break;
                    
            }
            
        } while (elec != 5);
        
    
        
        
    }
    
}
