
package poojavaegg.ejercicio09.principal;

import java.util.Scanner;
import poojavaegg.ejercicio09.entidades.Matematica;
import poojavaegg.ejercicio09.servicios.MatematicaServicio;


public class Ej9 {

//    Realizar una clase llamada Matemática que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
//    un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el Math.random para generar los dos números y se guardaran en el objeto con
//    su respectivos set. Deberá además implementar los siguientes métodos:
//          • Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//          • Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
//          • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//            Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

    public static void main(String[] args) {
        
        Scanner leer = new Scanner ( System.in ). useDelimiter("\n");
        
        MatematicaServicio matematicaServicio = new MatematicaServicio () ;
        
        Matematica matematica = new Matematica ();
        
        Matematica m1 = matematicaServicio.inicio();
        
        matematicaServicio.mayor(m1);
        matematicaServicio.potencia(m1);
        matematicaServicio.raiz(m1);
        
    }
    
}
