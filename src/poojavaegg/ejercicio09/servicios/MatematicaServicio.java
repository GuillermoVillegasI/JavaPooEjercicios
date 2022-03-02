package poojavaegg.ejercicio09.servicios;

import java.util.Scanner;
import poojavaegg.ejercicio09.entidades.Matematica;

public class MatematicaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Matematica matematica = new Matematica();

    public Matematica matematica() {
        return matematica;
    }

    public Matematica inicio() {

        float n1 = (float) (Math.random() * 100 - 50);
        matematica.setN1(n1);
        float n2 = (float) (Math.random() * 100 - 50);
        matematica.setN2(n2);

        System.out.println("PRIMER NUMERO: " + matematica.getN1() + " . ");
        System.out.println("SEGUNDO NUMERO: " + matematica.getN2() + " . ");
        System.out.println();
        return matematica;

    }

    public void mayor(Matematica matematica) {

        if (matematica.getN1() > matematica.getN2()) {

            System.out.println(" EL PRIMER NUMERO ES MAYOR AL SEGUNDO");

        } else if (matematica.getN1() < matematica.getN2()) {

            System.out.println(" EL SEGUNDO NUMERO ES MAYOR AL PRIMERO");

        } else if (matematica.getN1() == matematica.getN2()) {

            System.out.println(" LOS NUMEROS SON IGUALES");

        }

        System.out.println();

    }

    public void potencia(Matematica matematica) {

        float n1 = matematica.getN1();
        float n2 = matematica.getN2();

        n1 = (Math.round(n1));
        System.out.println(n1);
        n2 = (Math.round(n2));
        System.out.println(n2);
        System.out.println();

        if (n1 > n2) {

            System.out.println(" EL PRIMER NUMERO ELEVADO AL SEGUNDO ES: " + Math.pow(n1, n2) + " . ");

        } else if (n2 > n1) {

            System.out.println(" EL SEGUNDO NUMERO ELEVADO AL PRIMERO ES: " + Math.pow(n2, n1) + " . ");

        } else if (n1 == n2) {

            System.out.println(" LOS NUMEROS SON IGUALES , LA POTENCIA ES; " + Math.pow(n2, n1) + " . ");

        }
        System.out.println();
    }

    public void raiz(Matematica matematica) {

        float n1 = matematica.getN1();
        float n2 = matematica.getN2();

        n1 = (Math.abs(n1));
        n2 = (Math.abs(n2));

        System.out.println(n1);
        System.out.println(n2);
        System.out.println();

        if (n1 != n2) {

            float n3 = (Math.min(n1, n2));
            System.out.println(" LA RAIZ DEL NUMERO MENOR ES " + (Math.sqrt(n3)) + " . ");

        }else {
            
            System.out.println(" LOS NUMEROS SON IGUALES , LA RAIZ ES: " +  (Math.sqrt(n1)) + " . ");
            
        }
        System.out.println();
    }

}
