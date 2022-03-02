
package poojavaegg.fcolecciones.ejemploarraylist;

import java.util.ArrayList;


public class Ejemplo {

    public static void main(String[] args) {
        //////////////////////
        /////////List/////////
        //////////////////////
        int[] vector = new int[6];
        ArrayList<String> nombres = new ArrayList();
        
        
        // Agregar cosas al ArrayList
        String n = "Valen";
        nombres.add(n);
        nombres.add("Ivo");
        nombres.add("Juan");
        
        
        

        //Remover cosas al ArrayList
        nombres.remove("Ivo"); // Con el objeto
       // nombres.remove(0); //Con un índice
        
        
        

        //Recorrer el ArrayList
        System.out.println("Los nombres de la lista son: \n");
        for (String aux : nombres) {
            System.out.println(aux);
        }
        
        
        
        //Obtener la longitud del ArrayList
        int size = nombres.size();
        System.out.println("La longitud del ArrayList es: " + nombres.size());
        
        
        
        

        //Verificar si un elemento está en el ArrayList
        if (nombres.contains("Valen")) {
            System.out.println("Valen está ready");
        } else {
            System.out.println("Valen no está ready");
        }

        
        

        int x = vector[0];
        //Obtener un elemento en base al índice
        String nombre = nombres.get(0);
        System.out.println(nombre);
        
        

        
        vector[0] = 3;
        //Setear un elemento en base al índice
        nombres.set(0, "Pepe");

        
        

        //Borrar el contenido del ArrayList
        nombres.clear();

        
        //Verificar si el ArrayList está vacío o no
        if (nombres.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("Los nombres de la lista son: \n");
            for (String aux : nombres) {
                System.out.println(aux);
            }
        }
    }
    
}
