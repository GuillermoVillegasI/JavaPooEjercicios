package poojavaegg.fcolecciones.ejercicio03.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private ArrayList<Integer> notas = new ArrayList();

    public Alumno() {

    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    public Alumno crear() {

        Alumno alumno = new Alumno();
        String elec;
        String mayu;
        String nombre;

        System.out.println("INGRESE EL NOMBRE DEL ALUMNO ");
        nombre = leer.next();
        alumno.setNombre(nombre);
        System.out.println("INGRESE LA PRIMER NOTA ");
        int nota1 = leer.nextInt();
        alumno.getNotas().add(nota1);
        System.out.println("INGRESE LA SEGUNDA NOTA ");
        int nota2 = leer.nextInt();
        alumno.getNotas().add(nota2);
        System.out.println("INGRESE LA TERCER NOTA ");
        int nota3 = leer.nextInt();
        alumno.getNotas().add(nota3);

        return new Alumno(alumno.getNombre(), alumno.getNotas());

    }

    public void notafinal(Alumno alumno) {

        int prom;
        int cont = 0;

        System.out.println(alumno.getNotas());
        System.out.println();

        for (int i = 0; i < 3; i++) {
            
            cont = cont + (alumno.getNotas().get(i));

        }

        prom = (cont / 3);
        System.out.println("EL PROMEDIO DE SUS NOTAS ES : " + prom + " . ");
        System.out.println();
    }

}
