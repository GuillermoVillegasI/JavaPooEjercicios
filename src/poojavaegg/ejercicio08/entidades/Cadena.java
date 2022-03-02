package poojavaegg.ejercicio08.entidades;

public class Cadena {

    private String frase;
    private int longi;
    

    public Cadena() {

    }
    public Cadena ( String frase , int longi ){
        this.frase = frase;
        this.longi = longi;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongi() {
        return longi;
    }

    public void setLongi(int longi) {
        this.longi = longi;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longi=" + longi + '}';
    }
    
    
}
