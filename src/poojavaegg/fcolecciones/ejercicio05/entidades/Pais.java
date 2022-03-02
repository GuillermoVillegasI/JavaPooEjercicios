package poojavaegg.fcolecciones.ejercicio05.entidades;

import java.util.Objects;
import java.util.Scanner;

public class Pais implements Comparable<Pais> {

    private String pnom;

    public Pais() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Pais(String pnom) {

    }

    public String getPnom() {
        return pnom;
    }

    public void setPnom(String pnom) {
        this.pnom = pnom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.pnom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.pnom, other.pnom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pais{" + "pnom=" + pnom + '}';
    }

    @Override
    public int compareTo(Pais t) {
        
        return pnom.compareTo(t.getPnom());
        
    }

}
