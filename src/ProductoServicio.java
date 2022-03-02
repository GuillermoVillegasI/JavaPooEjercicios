
import java.util.HashMap;
import java.util.Scanner;
import poojavaegg.fcolecciones.ejercicio06.entidades.Producto;


public class ProductoServicio {
    
    Scanner leer = new Scanner ( System.in ). useDelimiter("\n");
    
    HashMap<String , Double> productos = new HashMap();
    
    Producto producto =  new Producto ();
    
    public Producto creaprod (){
        
        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO Y MARCA QUE DESEA AGREGAR");
        String name = leer.next();
        System.out.println("INGRESE EL PRECIO DEL PRODUCTO");
        Double prec = leer.nextDouble();
        
        producto.setNombre(name);
        producto.setPrecio(prec);
        
        return producto;
    }
    
    public void agregaprod ( Producto producto ){
        
        productos.put(producto.getNombre(), producto.getPrecio());
        
    }
    
    
    
}
