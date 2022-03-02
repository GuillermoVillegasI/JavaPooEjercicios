
package poojavaegg.fcolecciones.ejercicio01.principal;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio01 {


    public static void main(String[] args) {
        Scanner leer = new Scanner ( System.in ). useDelimiter ("\n");
        ArrayList<String> masc = new ArrayList();
        boolean bandera = false;
        String sale ;
        do {
            
            System.out.println(" INGRESE UNA RAZA DE PERRO ");
            masc.add(leer.next());
            System.out.println(" SI DESEA SALIR PRESIONE S , SI DESEA AGREGAR OTRA RAZA PRESIONE O");
            sale = leer.next();
            
        } while (!(sale.toUpperCase().equals("S")));
        
        for (String aux : masc) {
            
            System.out.println(aux);
            
        }
        
        System.out.println(" INGRESE LA RAZA QUE DESEA BUSCAR Y ELIMINAR ");
        String busca = leer.next();
        busca.toUpperCase();
        
        for (int i = 0; i < masc.size(); i++) {
            
            if (masc.get(i).equals(busca)){
                
                masc.remove(i);
                
            }
            
        }
        
        for (String aux : masc) {
            System.out.println(aux);
        }
        
        
    }
    
}
