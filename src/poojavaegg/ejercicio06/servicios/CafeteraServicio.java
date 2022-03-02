
package poojavaegg.ejercicio06.servicios;

import java.util.Scanner;
import poojavaegg.ejercicio06.entidades.Cafetera;


public class CafeteraServicio {
    
    private Scanner leer = new Scanner ( System.in ). useDelimiter("\n");
    
    
    Cafetera cafetera = new Cafetera () ;
    
    public Cafetera cafetera (){
        
        System.out.println(" INGRES LA CAPACIDAD MAXIMA DE SU CAFETERA. ");
        int capmax = leer.nextInt() ;
        System.out.println(" INGRESE LA CANTIDAD ACTUAL DE CAFE. ");
        int cantact = leer.nextInt() ;
        
        cafetera.setCapmax(capmax);
        cafetera.setCantact(cantact);
        
        return cafetera ;
        
    }
    
    public void llenarcafetera ( Cafetera cafetera ){
        
        cafetera.setCantact(cafetera.getCapmax());
        
    }
    
    public void servirtaza ( Cafetera cafetera ){
        
        System.out.println(" INGRESE EL TAMAÑO DE LA TAZA. ");
        int tamtaza = leer.nextInt();
        
        if ( tamtaza <= cafetera.getCantact() ){
            
            System.out.println(" LA TAZA SE HA LLENADO. QUE LA DISFRUTES ANIMAL. ");
            
        }else {
            
            int faltante = ( tamtaza - cafetera.getCantact());
            
            System.out.println(" LA TAZA NO SE HA LLENADO , FALTAN: " + faltante + " ML. ");
            
        }
        
    }
    
    public void vaciarcafetera ( Cafetera cafetera){
        
        cafetera.setCantact(0);
        
    }
    
    public void agregarcafe ( Cafetera cafetera) {
        
        System.out.println(" INGRESE LA CANTIDAD DE CAFE QUE DESEA AGREGAR ");
        
        int agrega = leer.nextInt();
        
        if ( agrega + cafetera.getCantact() > cafetera.getCapmax()){
            
            System.out.println(" NO HAY ESPACIO PARA TANTO CAFE ");

        }else {
            
            cafetera.setCantact(agrega + cafetera.getCantact());
            
        }
            
        
    }
    
    public int eleccion() {

        int eleccion;
        do {

            System.out.println(" INGRESE LA OPCION QUE DESEA REALIZAR");
            System.out.println(" 1 - LLENAR CAFETERA");
            System.out.println(" 2 - SERVIR TAZA");
            System.out.println(" 3 - VACIAR CAFETERA");
            System.out.println(" 4 - AGREGAR CAFE");
            
            
            eleccion = leer.nextInt();

        } while (eleccion > 4 && eleccion < 1);

        return eleccion;

    }
    
    
}
