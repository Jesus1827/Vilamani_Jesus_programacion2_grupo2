package Libros;

class Book {
    private String title;
    private Author author;
    private double price;

    // Constructor
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Método para obtener información del libro
    public String getInfo() {
        return "Title: " + title + ", Author: " + author.getName() + ", Price: bs " + price;
    }
}
