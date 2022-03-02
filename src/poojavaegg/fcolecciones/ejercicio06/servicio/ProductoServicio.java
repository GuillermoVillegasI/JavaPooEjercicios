package poojavaegg.fcolecciones.ejercicio06.servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import poojavaegg.fcolecciones.ejercicio06.entidades.Producto;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashMap<String, Double> productos = new HashMap();

    Producto producto = new Producto();

    public Producto creaprod() {

        System.out.println("INGRESE EL NOMBRE Y MARCA DEL PRODUCTO QUE DESEA AGREGAR");
        String name = leer.next();
        name = name.toUpperCase();
        System.out.println("INGRESE EL PRECIO DEL PRODUCTO");
        Double prec = leer.nextDouble();

        producto.setNombre(name);
        producto.setPrecio(prec);

        return producto;
    }

    public void agregaprod(Producto producto) {

        productos.put(producto.getNombre(), producto.getPrecio());

    }
    
    public void modpreci (String p){
        
        int cont = 0;
        p = p.toUpperCase();
        System.out.println("INGRESE EL NUEVO PRECIO: ");
        Double nupre = leer.nextDouble();
        
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            
            if (aux.getKey().equals(p)) {
                aux.setValue(nupre);
                cont ++;
            }
            if ( cont == 0){
                System.out.println(" EL PRODUCTO INGRESADO NO SE ENCUENTRA CARGADO");
            }
        }
        
    }
    public void mostrar (){
        
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("PRODUCTO: " + key + " PRECIO: " + value+" $ ");
        }
        
    }
    
    
    
    /// revisar eliminar
    /// revisar !!!
    
    public void eliminar ( String p ){
        int cont = 0;
        p = p.toUpperCase();
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            
            if (aux.getKey().equals(p)) {
                productos.remove(aux.getKey());
                cont ++;
            }
            if ( cont == 0){
                System.out.println(" EL PRODUCTO INGRESADO NO SE ENCUENTRA CARGADO");
            }
        }
        
    }

}
