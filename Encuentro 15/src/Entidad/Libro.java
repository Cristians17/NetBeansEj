/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos 
 * los atributos pasados por parámetro y un constructor vacío. Crear 
 * un método para cargar un libro pidiendo los datos al usuario y luego 
 * informar mediante otro método el número de ISBN, el título, el autor 
 * del libro y el número de páginas.
 * @author Cristian
 */
public class Libro {
    
    private String titulo;
    private long ISBN;
    private String autor;
    private int numeroPaginas;
    
    
    public Libro(){
        
    }

    public Libro(String titulo, long ISBN, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
