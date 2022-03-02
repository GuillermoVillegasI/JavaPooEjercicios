
package poojavaegg.ejercicio05.entidades;


public class Cuenta {
    
    
    private long numerocuenta;
    private long dni;
    private float saldoactual;
    
    public Cuenta ( ){
        
    }
    
    public Cuenta ( long numerocuenta , long dni , float saldocuenta ){
        
       this.numerocuenta = numerocuenta;
       this.dni = dni;
       this.saldoactual = saldoactual;
         
    }

    public long getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(long numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public float getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(float saldoactual) {
        this.saldoactual = saldoactual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numerocuenta=" + numerocuenta + ", dni=" + dni + ", saldoactual=" + saldoactual + '}';
    }


    
    
}
