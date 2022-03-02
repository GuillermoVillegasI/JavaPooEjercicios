package poojavaegg.fcolecciones.ejercicio04.utilidades;

import java.util.Comparator;
import poojavaegg.fcolecciones.ejercicio04.entidades.Pelicula;

public class Comparadores {

    public static Comparator<Pelicula> Ordpordurasc = new Comparator<Pelicula>() {

        @Override

        public int compare(Pelicula t, Pelicula t1) {

            return t.getDuracion().compareTo(t1.getDuracion());

        }
    };

    public static Comparator<Pelicula> Ordpordurdesc = new Comparator<Pelicula>() {

        @Override

        public int compare(Pelicula t, Pelicula t1) {

            return t1.getDuracion().compareTo(t.getDuracion());

        }
    };

    public static Comparator<Pelicula> Ordportitasc = new Comparator<Pelicula>() {

        @Override

        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo());

        }
    };

    public static Comparator<Pelicula> Ordpordirasc = new Comparator<Pelicula>() {

        @Override

        public int compare(Pelicula t, Pelicula t1) {

            return t.getDirector().compareTo(t1.getDirector());

        }
    };

}
