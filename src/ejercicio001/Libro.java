/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
*/
package ejercicio001;

import java.util.Scanner;
import java.util.Locale;

public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int nroDePaginas;
    
    public Libro() {
    }
    
    public Libro(int isbn, String titulo, String autor, int nroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroDePaginas = nroDePaginas;
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

    public int getNroDePaginas() {
        return nroDePaginas;
    }

    public void setNroDePaginas(int nroDePaginas) {
        this.nroDePaginas = nroDePaginas;
    }
    
    public void cargarLibro() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese el ISBN del libro: ");
        this.isbn = read.nextInt();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = read.next();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = read.next();
        System.out.print("Ingrese el número de páginas del libro: ");
        this.nroDePaginas = read.nextInt();
    }
    
    public void mostrarLibro() {
        System.out.printf("El código ISBN del libro es: %d\n", isbn);
        System.out.printf("El título del libro es: %s\n", titulo);
        System.out.printf("El autor del libro es: %s\n", autor);
        System.out.printf("El número de páginas del libro es: %d\n", nroDePaginas);
    }
}
