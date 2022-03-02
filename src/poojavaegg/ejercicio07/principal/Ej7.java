package poojavaegg.ejercicio07.principal;

import java.util.Scanner;
import poojavaegg.ejercicio07.entidades.Persona;
import poojavaegg.ejercicio07.servicios.PersonaServicio;

public class Ej7 {

//   Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
//   otro atributo, puede hacerlo. Los métodos que se implementarán son:
//      • Un constructor por defecto.
//      • Un constructor con todos los atributos como parámetro.
//      • Métodos getters y setters de cada atributo.
//      • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//      Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
//      • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg /(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//      que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//      está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//      función devuelve un 1.
//      • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
//  A continuación, en la clase main hacer lo siguiente:
//  Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//  tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
//  Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables, para después en el main, calcular un porcentaje de esas 4
//  personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
//  cuantos menores.
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PersonaServicio personaServicio = new PersonaServicio();

        Persona persona = new Persona();

        float flaco = 0;
        float justo = 0;
        float gordo = 0;
        float mayor = 0;
        float menor = 0;

        Persona p1 = personaServicio.persona();
//        Persona p2 = personaServicio.persona();
//        Persona p3 = personaServicio.persona();
//        Persona p4 = personaServicio.persona();
        
//            personaServicio.crearper();
            personaServicio.calcularmc(p1);
            personaServicio.mayor(p1);
//            personaServicio.crearper(p2);
//            personaServicio.calcularmc(p2);
//            personaServicio.mayor(p2);
//            personaServicio.crearper(p3);
//            personaServicio.calcularmc(p3);
//            personaServicio.mayor(p3);
//            personaServicio.crearper(p4);
//            personaServicio.calcularmc(p4);
//            personaServicio.mayor(p4);



//        Persona[] personas = new Persona[4];
//
//        personas[0] = p1;
//        personas[1] = p2;
//        personas[2] = p3;
//        personas[3] = p4;
//
//        for (int i = 0; i < 4; i++) {
//
//            if (personaServicio.porcpeso(personas[i]) == (1)) {
//                flaco++;
//            }
//            if (personaServicio.porcpeso(personas[i]) == (2)) {
//                justo++;
//            }
//            if (personaServicio.porcpeso(personas[i]) == (3)) {
//                gordo++;
//            }
//
//        }
//
//        System.out.println(flaco);
//        System.out.println(justo);
//        System.out.println(gordo);
//        System.out.println(" PORCENTAJE DE PERSONAS CON PESO MENOR AL IDEAL : " + (flaco / 4) * 100 + "% . ");
//        System.out.println(" PORCENTAJE DE PERSONAS CON PESO IDEAL : " + (justo / 4) * 100 + "% . ");
//        System.out.println(" PORCENTAJE DE PERSONAS CON PESO MAYOR AL IDEAL : " + (gordo / 4) * 100 + "% . ");
//
    }
    
}
