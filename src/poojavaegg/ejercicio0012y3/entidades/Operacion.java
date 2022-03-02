
package poojavaegg.ejercicio0012y3.entidades;

public class Operacion {
    
    private int numero1;
    private int numero2;
    
    public Operacion ( int numero1 , int numero2){
        
        this.numero1 = numero1;
        this.numero2 = numero2;
        
    }
    
    public Operacion () {
        
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //    public int obtenerEdadPerruna() 
    //    return edad * 7;  
    
    public int suma(){
        return numero1 + numero2; 
    }
    
    public int resta(){
        return numero1 - numero2;
    }
        
    public void mult ( int numero1 ,int numero2 ) {
        
        if ( numero1 == 0 || numero2 == 0 ){
            
            System.out.println("LA MULTIPLICACION ES POR CERO, POR LO TANTO EL RESULTADO ES: " + numero1 * numero2 + " . ");
            
        }else {
            
            System.out.println("LA MULTIPLICACION ES; " + numero1 * numero2 + " . ");
                        
        }
            
        
    }  
    
    public void div ( int numero1 , int numero2 ){
        
        if ( numero1 == 0 || numero2 == 0 ){
            
            System.out.println( "LA DIVISION ES POR CERO, POR LO TANTO EL RESULTADO ES: " + numero1 / numero2 + " . "); 
            
        }else {
            
            System.out.println( "LA DIVISION ES: " + numero1/numero2 + " . " );
            
        }
        
    }
        
        
    
    
}
