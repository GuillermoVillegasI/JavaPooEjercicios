package poojavaegg.ejercicio0012y3.entidades;





public class Circunferencia {
    
    private float radio;
    
    public Circunferencia (float radio ){
        
        this.radio=radio;
        
    }
    
    public Circunferencia () {
        
        
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    public void area(){
        
        
        double area = ( Math.PI * Math.pow(radio, 2));
        System.out.println("EL AREA ES: " + area + " . ");
        
        
    }
    
     public void perimetro(){
        
        double perimetro = ( 2 * Math.PI * radio);
         System.out.println("EL PERIMETRO ES: " + perimetro + " . ");
    }
    
    
     
     
}
