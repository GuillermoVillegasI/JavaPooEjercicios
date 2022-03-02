
package poojavaegg.ejercicio0012y3.entidades;


public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int nropaginas;

    public Libro ( int isbn , String titulo , String autor , int nropaginas){
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nropaginas = nropaginas;        
        
    }
       
    public Libro ( ){
        
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNropaginas() {
        return nropaginas;
    }

    public void setNropaginas(int nropaginas) {
        this.nropaginas = nropaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", nropaginas=" + nropaginas + '}';
    }
    
    public void pedirdatos () {
        
        System.out.println("INGRESE EL ISBN DEL LIBRO");
        System.out.println("INGRESE EL TITULO DEL LIBRO");
        System.out.println("INGRESE EL AUTOR DEL LIBRO");
        System.out.println("INGRESE EL NUMERO DE PAGINAS DEL LIBRO");
        
    }
    
}
