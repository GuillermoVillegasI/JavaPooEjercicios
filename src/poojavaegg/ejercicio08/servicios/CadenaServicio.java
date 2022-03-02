package poojavaegg.ejercicio08.servicios;

import java.util.Scanner;
import poojavaegg.ejercicio08.entidades.Cadena;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena cadena = new Cadena();

    public Cadena cadena() {

        return cadena;

    }

    public void creaca(Cadena cadena) {

        System.out.println(" INGRESE UNA FRASE: ");
        String frase = leer.next();
        cadena.setFrase(frase);
        int longi = frase.length();
        cadena.setLongi(longi);
        System.out.println();
        System.out.println(" SU FRASE ES: " + frase + " . Y SU LONGITUD ES: " + longi + " . ");
        System.out.println();
    }

    public void mostrarvocales(Cadena cadena) {

        String frase = cadena.getFrase();
        int longi = frase.length();
        int cont = 0;

        for (int i = 0; i < longi; i++) {

            String letra = frase.substring(i, i + 1);
            letra = letra.toUpperCase();

            if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {

                cont++;

            }
        }
        System.out.println();
        System.out.println("LA FRASE TIENE: " + cont + " vocales. ");
    }

    public void invfrase(Cadena cadena) {

        String frase = cadena.getFrase();
        int longi = frase.length();
        String invert = "";

        for (int i = longi - 1; i >= 0; i--) {

            invert += frase.charAt(i);

        }
        System.out.println(" LA FRASE INVERTIDA ES; " + invert + " . ");
        System.out.println();
    }

    public void vecesrep(Cadena cadena) {

        String frase = cadena.getFrase();
        frase = frase.toUpperCase();
        System.out.println(" INGRESE LA LETRA QUE DESEA BUSCAR: ");
        String letra = leer.next().toUpperCase();
        int longi = frase.length();
        int cont = 0;

        for (int i = 0; i < longi; i++) {

            if (frase.substring(i, i + 1).equals(letra)) {

                cont++;

            }
        }
        System.out.println(" LA LETRA; " + letra + " SE REPITE " + cont + " VECES. ");
    }

    public void complongi(Cadena cadena) {

        String frase = cadena.getFrase();
        int longi1 = frase.length();
        System.out.println(" INGRESE UNA FRASE ");
        String frase2 = leer.next();
        int longi2 = frase2.length();

        if (longi1 > longi2) {
            System.out.println(" LA LONGITUD DE LA PRIMER FRASE ES MAS GRANDE QUE LA SEGUNDA EN: " + (longi1 - longi2) + " CARACTÉRES. ");
        }
        if (longi2 > longi1) {
            System.out.println(" LA LONGITUD DE LA SEGUNDA FRASE ES MAS GRANDE QUE LA PRIMERA EN: " + (longi2 - longi1) + " CARACTÉRES. ");
        }
        if (longi2 == longi1) {
            System.out.println(" LA LONGITUD DE LA SEGUNDA FRASE ES IGUAL A LA PRIMERA. ");
        }
    }

    public void unir(Cadena cadena) {

        String frase = cadena.getFrase();
        System.out.println(" INGRESE UNA FRASE ");
        String frase2 = leer.next();

        System.out.println(" " + frase + " " + frase2 + " ");

    }

    public void reemp(Cadena cadena) {

        String frase = cadena.getFrase();
        frase = frase.toUpperCase();
        int longi = frase.length();
        System.out.println(" INGRESE EL CARACTER POR EL QUE DESEA REEMPLAZAR LA LETRA A");
        String carac = leer.next();

        for (int i = 0; i < longi; i++) {

            if (frase.substring(i, i + 1).equals("A")) {

                System.out.print(carac);

            } else {

                System.out.print(frase.substring(i, i + 1));

            }

        }
        System.out.println();
    }

    public void contiene(Cadena cadena) {

        boolean bandera = false;
        String frase = cadena.getFrase();
        frase = frase.toUpperCase();
        int longi = frase.length();
        System.out.println(" INGRESE LA LETRA QUE DESEA BUSCAR ");
        String carac = leer.next();

        for (int i = 0; i < longi; i++) {

            if (frase.substring(i, i + 1).equals(carac)) {
                bandera = true;
            }

        }

        System.out.println(bandera);

    }
}
