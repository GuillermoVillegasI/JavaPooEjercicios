package poojavaegg.fcolecciones.ejercicio03.principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import poojavaegg.fcolecciones.ejercicio03.entidades.Alumno;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Alumno> alum = new ArrayList();
        Alumno alumno = new Alumno();
        String elec;
        String mayu;

        do {

            alum.add(alumno.crear());
            System.out.println("DESEA AGREGAR OTRO ALUMNO ? PRESIONES S o N ");
            elec = leer.next();
            mayu = elec.toUpperCase();

        } while (mayu.equals("S"));

        System.out.println();

        for (Alumno aux : alum) {
            System.out.println(aux);
        }

        System.out.println();

        System.out.println("INGRESE EL NOMBRE DEL ALUMNO QUE DESEA BUSCAR ");
        System.out.println();
        String al = leer.next();

        for (int i = 0; i < alum.size(); i++) {

            if (alum.get(i).getNombre().equals(al)) {

                alumno.notafinal(alum.get(i));

            }

        }

    }
}
