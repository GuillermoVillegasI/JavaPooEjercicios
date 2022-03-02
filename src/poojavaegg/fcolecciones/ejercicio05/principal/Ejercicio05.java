package poojavaegg.fcolecciones.ejercicio05.principal;

import java.util.Scanner;
import poojavaegg.fcolecciones.ejercicio05.entidades.Pais;
import poojavaegg.fcolecciones.ejercicio05.servicios.PaisServicio;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PaisServicio paisS = new PaisServicio();
        Pais pais = new Pais();
        String elec;

        do {
            Pais p = paisS.creapais();
            System.out.println("DESEA INGRESAR OTRO PAIS ? SI-S  ,  NO-N  .");
            elec = leer.next();
        } while (elec.toUpperCase().equals("S"));

        paisS.Muestrapais();
        paisS.borra();

    }

}
