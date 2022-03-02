

package poojavaegg.ejercicio0012y3.principal;

import java.util.Scanner;
import poojavaegg.ejercicio0012y3.entidades.Libro;


public class Ejercicio1 {
    
//    1-Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por
//  parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//  el autor del libro y el numero de páginas.
    

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in). useDelimiter("\n");
//        
//        System.out.println("INGRESE EL ISBN DEL LIBRO");
//        int isbn = leer.nextInt();
//        System.out.println("INGRESE EL TITULO DEL LIBRO");
//        String titulo = leer.next();
//        System.out.println("INGRESE EL AUTOR DEL LIBRO");
//        String autor = leer.next();
//        System.out.println("INGRESE EL NUMERO DE PAGINAS DEL LIBRO");
//        int nropaginas = leer.nextInt();

//        int isbn;
//        String titulo;
//        String autor;
//        int nropaginas;


        
        Libro libro=new Libro();
        
        System.out.println("Ingrese ISBN: ");
        libro.setIsbn(leer.nextInt());
        System.out.println("Ingrese El Titulo: ");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese El Autor: ");
        libro.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas: ");
        libro.setNropaginas(leer.nextInt());
        
        System.out.println(libro);
    }

        

//
//        Libro libro = new Libro( isbn , titulo , autor , nropaginas);
//        
//        
//        System.out.println("EL ISBN ES: " + libro.getIsbn());
//        System.out.println("EL TITULO ES: " + libro.getTitulo());
//        System.out.println("EL AUTOR ES: " + libro.getAutor());
//        System.out.println("EL NUMERO DE PAGINAS ES: " + libro.getNropaginas());
//        
//        System.out.println(libro);
//        
    }
    
        
