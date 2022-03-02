package poojavaegg.ejercicio05.servicios;

import poojavaegg.ejercicio05.entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    private Scanner leer = new Scanner(System.in);

    public Cuenta cuenta() {

        System.out.println(" INGRESE EL NUMERO DE CUENTA");
        long numerocuenta = leer.nextInt();

        System.out.println(" INGRESE SU DNI");
        long dni = leer.nextInt();

        System.out.println(" INGRESE EL SALDO ACTUAL DE SU CUENTA");
        float saldoactual = leer.nextFloat();

        Cuenta cuenta = new Cuenta();

        cuenta.setNumerocuenta(numerocuenta);
        cuenta.setDni(dni);
        cuenta.setSaldoactual(saldoactual);

        return cuenta;

    }

    public void deposito(Cuenta cuenta) {

        System.out.println(" INGRESE EL VALOR A DEPOSITAR");
        float dep = leer.nextFloat();

        cuenta.setSaldoactual((cuenta.getSaldoactual() + dep));

        System.out.println("SU NUEVO SALDO ES: " + cuenta.getSaldoactual() + " . ");

    }

    public void retiro(Cuenta cuenta) {

        System.out.println(" INGRESE EL VALOR A RETIRAR");
        float ret = leer.nextFloat();

        if (ret < cuenta.getSaldoactual()) {

            cuenta.setSaldoactual((cuenta.getSaldoactual() - ret));

            System.out.println(" SU NUEVO SALDO ES: " + cuenta.getSaldoactual() + " . ");

        } else {

            cuenta.setSaldoactual(0);
            System.out.println(" SU NUEVO SALDO ES: " + cuenta.getSaldoactual() + " . ");

        }

    }

    public void extrara(Cuenta cuenta) {
        float extrara;

        do {

            System.out.println(" INGRESE EL VALOR DE SU EXTRACCIÓN RÁPIDA, SU MAXIMO A RETIRAR ES: " + (cuenta.getSaldoactual() * 0.20) + " . ");
            extrara = leer.nextFloat();

        } while (extrara > (cuenta.getSaldoactual() * 0.20));

        System.out.println(" UD RETIRO: " + extrara + " . ");

        cuenta.setSaldoactual((cuenta.getSaldoactual() - extrara));

        System.out.println(" SU NUEVO SALDO ES: " + cuenta.getSaldoactual() + " . ");

    }

    public void consult(Cuenta cuenta) {

        System.out.println(" SU SALDO ACTUAL ES: " + cuenta.getSaldoactual() + " . ");

    }

    public void datos(Cuenta cuenta) {

        System.out.println(cuenta);

    }

    public int eleccion() {

        int eleccion;
        do {

            System.out.println(" INGRESE LA OPCION QUE DESEA REALIZAR");
            System.out.println(" 1 - DEPOSITO");
            System.out.println(" 2 - RETIRO");
            System.out.println(" 3 - EXTRACCIÓN RÁPIDA");
            System.out.println(" 4 - CONSULTA DE SALDO");
            System.out.println(" 5 - CONSULTA DE DATOS");
            
            
            eleccion = leer.nextInt();

        } while (eleccion > 5 && eleccion < 1);

        return eleccion;

    }
    
    

}
