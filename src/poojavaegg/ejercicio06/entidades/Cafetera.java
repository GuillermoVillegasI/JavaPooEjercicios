
package poojavaegg.ejercicio06.entidades;

import java.util.Scanner;


public class Cafetera {
    
    Scanner leer = new Scanner ( System.in ). useDelimiter("\n");
    
    private int capmax ;
    private int cantact ;
    
    public Cafetera (){
        
    }
    
    public Cafetera ( int capmax , int cantact ){
        
        this.capmax = capmax;
        this.cantact = cantact;
        
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getCapmax() {
        return capmax;
    }

    public void setCapmax(int capmax) {
        this.capmax = capmax;
    }

    public int getCantact() {
        return cantact;
    }

    public void setCantact(int cantact) {
        this.cantact = cantact;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "leer=" + leer + ", capmax=" + capmax + ", cantact=" + cantact + '}';
    }
    
    
    
}
