package poojavaegg.ejercicio11.principal;

import java.util.Scanner;
import java.util.Date;
//import poojavaegg.ejercicio11.entidades.Fecha;

public class Ej11 {

//    Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
//  clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
//  de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se puede conseguir instanciando un objeto Date con constructor
//  vacío.
//  Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//  Ejemplo fecha actual: Date fechaActual = new Date();
//  Si necesiten acá tienen más información en clase Date: Documentacion Oracle
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println(" INGRESE EL DIA");
        int dia = leer.nextInt();
        System.out.println(" INGRESE EL MES");
        int mes = leer.nextInt();
        mes = mes - 1;
        System.out.println(" INGRESE EL AÑO");
        int anio = leer.nextInt();
        anio = anio - 1900 ;
        
        Date fecha = new Date ( anio , mes , dia );
        
        System.out.println(fecha);
        
        Date actual = new Date () ;
        
        System.out.println(actual);

        int dif ;
        
        dif = ( actual.getYear() - anio);
        
        System.out.println(" LA DIFERENCIA DE AÑOS ES: " + dif + " . ");

    }

}
