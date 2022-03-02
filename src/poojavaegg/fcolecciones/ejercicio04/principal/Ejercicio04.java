package poojavaegg.fcolecciones.ejercicio04.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import poojavaegg.fcolecciones.ejercicio04.entidades.Pelicula;
import poojavaegg.fcolecciones.ejercicio04.servicios.PeliculaServicio;
import poojavaegg.fcolecciones.ejercicio04.utilidades.Comparadores;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Pelicula pelicula = new Pelicula();

        PeliculaServicio peliS = new PeliculaServicio();

        ArrayList<Pelicula> peli = new ArrayList();

        String elec;

        do {

            peli.add(peliS.crearpeli());
            System.out.println("DESEA AGREGAR OTRA PELICULA ? S - SI ; N - NO");
            elec = leer.next();
            elec = elec.toUpperCase();

        } while (elec.equals("S"));

        System.out.println();

        for (Pelicula aux : peli) {

            System.out.println(aux);

        }

        System.out.println();

        for (int i = 0; i < peli.size(); i++) {

            if (peli.get(i).getDuracion() > 1) {

                System.out.println("ESTA PELICULA DURA MAS DE UNA HORA " + peli.get(i));

            }

        }

        System.out.println();

        Collections.sort(peli, Comparadores.Ordpordurasc);
        for (Pelicula aux : peli) {
            System.out.println(aux);
        }

        System.out.println();

        Collections.sort(peli, Comparadores.Ordpordurdesc);
        for (Pelicula aux : peli) {
            System.out.println(aux);
        }

        System.out.println();

        Collections.sort(peli, Comparadores.Ordportitasc);
        for (Pelicula aux : peli) {
            System.out.println(aux);
        }

        System.out.println();

        Collections.sort(peli, Comparadores.Ordpordirasc);
        for (Pelicula aux : peli) {
            System.out.println(aux);
        }

        System.out.println();

    }

}
