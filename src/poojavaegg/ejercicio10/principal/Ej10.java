
package poojavaegg.ejercicio10.principal;

import poojavaegg.ejercicio10.entidades.Arreglos;


public class Ej10 {
    
//    Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//      programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
//      10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
//      elementos y el combinado de 20.
  
    public static void main(String[] args) {
        
        int [] vectora = new int [ 50 ];
        int [] vectorb = new int [ 20 ];
      
        Arreglos arreglos = new Arreglos ();
                
        arreglos.llenarymostrar(vectora, 50);
        System.out.println();
        arreglos.llenarymostrar(vectorb, 20);
        System.out.println();
        arreglos.ordenar(vectora, vectorb, 50, 20);
        
    }
    
    
    
    
    

    
}
