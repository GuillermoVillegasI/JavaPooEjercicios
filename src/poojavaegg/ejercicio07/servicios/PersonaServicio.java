package poojavaegg.ejercicio07.servicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import poojavaegg.ejercicio07.entidades.Persona;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Persona persona = new Persona();

    public Persona persona() {

        return persona;
    }

    public void crearper(Persona persona) {
        String sexo;

        System.out.println(" INGRESE SU PESO ");
        persona.setPeso(leer.nextFloat());

        System.out.println(" INGRESE SU NOMBRE ");
        persona.setNombre(leer.next());

        System.out.println(" INGRESE SU ALTURA ");
        persona.setAltura(leer.nextFloat());
        
        System.out.println(" INGRESE SU EDAD ");
        persona.setEdad(leer.nextInt());
        
        System.out.println("");

        do {

            System.out.println(" INGRESE SU SEXO: H - M - O ");
            sexo = leer.next().toUpperCase();

        } while ((!sexo.equals(
                "H")) && (!sexo.equals("M")) && (!sexo.equals("O")));

        persona.setSexo(sexo);

    }

    public int calcularmc(Persona persona) {

        int rdo = 2;

        float mc = (persona.getPeso() / (persona.getAltura() * persona.getAltura()));

        if (mc < 20) {
            System.out.println(" UD. ESTA POR DEBAJO DE SU PESO IDEAL ");
            rdo = -1;
        }
        if (mc >= 20 && mc <= 25) {
            System.out.println(" UD. ESTA EN SU PESO IDEAL ");
            rdo = 0;
        }
        if (mc > 25) {
            System.out.println(" UD. ESTA POR ENCIMA DE SU PESO IDEAL ");
            rdo = 1;
        }
        return rdo;
    }

    public int mayor(Persona persona) {

        int mayor = 3 ;

        if (persona.getEdad() >= 18) {
            System.out.println(" UD ES MAYOR DE EDAD ");
            mayor = 1;
        }
        if (persona.getEdad()< 18 && persona.getEdad() > 1) {
            System.out.println(" UD ES MENOR DE EDAD");
            mayor = 0 ;
        }

        return mayor;
    }

    public int porcpeso(Persona persona) {

        int rdo = 3;

        float mc = (persona.getPeso() / (persona.getAltura() * persona.getAltura()));

        if (mc < 20) {
            rdo = 1;
        }
        if (mc >= 20 && mc <= 25) {
            rdo = 2;
        }
        if (mc > 25) {
            rdo = 3;
        }
        return rdo;
    }

}
