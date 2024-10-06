package Libros;

import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;
    private List<Book> books;

    // Constructor
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Método para agregar un libro
    public void addBook(Book book) {
        books.add(book);
    }

    // Metodo addBook sobrecargado
    public void addBook(String title, double price) {
        Book newBook = new Book(title, this, price);
        books.add(newBook);
    }

    // Obtener lista de libros
    public List<Book> getBooks() {
        return books;
    }

    // Obtener nombre del autor
    public String getName() {
        return name;
    }
}