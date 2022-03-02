
package poojavaegg.ejercicio12.entidades;
import java.util.Date;

public class Person {
    
   private String nom ;
   private Date nac ;
   
   public Person (){
       
   }
   public Person ( String nom , Date nac){
      this.nom = nom;
      this.nac = nac;
   } 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getNac() {
        return nac;
    }

    public void setNac(Date nac) {
        this.nac = nac;
    }

    @Override
    public String toString() {
        return "Person{" + "nom=" + nom + ", nac=" + nac + '}';
    }
   
   
   
}
