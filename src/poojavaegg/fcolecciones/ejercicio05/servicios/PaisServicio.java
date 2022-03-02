package poojavaegg.fcolecciones.ejercicio05.servicios;

import java.util.Scanner;
import java.util.TreeSet;
import poojavaegg.fcolecciones.ejercicio05.entidades.Pais;

public class PaisServicio {

    TreeSet<String> pa = new TreeSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pais pais = new Pais();

    public Pais creapais() {

        System.out.println("INGRESE UN PAIS");
        String pai = leer.next();
        pa.add(pai);
        pais.setPnom(pai);
        System.out.println();
        return pais;

    }

    public void Muestrapais() {

        for (String aux : pa) {
            System.out.println(aux);
        }

    }

    public void borra() {

        System.out.println("INGRESE EL PAIS QUE DESEA BUSCAR Y ELIMINAR; ");
        String elim = leer.next();
        int cont = 0;
        for (int i = 0; i < pa.size(); i++) {

            if (pa.contains(elim)) {

                pa.remove(elim);
                cont++;
            }

        }
        
        if (cont == 0) {
            System.out.println("EL PAIS NO SE ENCUENTRA EN LA LISTA");
        }
        
        for (String aux : pa) {
            System.out.println(aux);
        }
        

    }

}
