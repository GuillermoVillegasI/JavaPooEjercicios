package poojavaegg.ejercicio05.principal;

import poojavaegg.ejercicio05.entidades.Cuenta;
import poojavaegg.ejercicio05.servicios.CuentaServicio;
import java.util.Scanner;

public class Ej5 {

//    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
//    operaciones asociadas a dicha clase son:
//      • Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//      • Agregar los métodos getters y setters correspondientes
//      • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//      • Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
//      • Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//          pondrá el saldo actual en 0.
//      • Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
//      • Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//      • Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CuentaServicio cuentaservicio = new CuentaServicio();

        Cuenta c1 = cuentaservicio.cuenta();

        System.out.println(c1);


        switch (cuentaservicio.eleccion()) {

            case 1:
                cuentaservicio.deposito(c1);
                break;
            case 2:
                cuentaservicio.retiro(c1);
                break;
            case 3:
                cuentaservicio.extrara(c1);
                break;
            case 4:
                cuentaservicio.consult(c1);
                break;
            case 5:
                cuentaservicio.datos(c1);
                break;
        }
    }

}
