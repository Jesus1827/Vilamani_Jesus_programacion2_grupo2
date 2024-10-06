package Libros;
public class MainBook {
    public static void main(String[] args) {
        Author author = new Author("Jaime Aduana Quintana");

        author.addBook(new Book("Amanda el reflejo de nuestra sociendad", author, 5));
        author.addBook("Amanda el reflejo de nuestra sociendad parte 2", 8);

        
        for (Book book : author.getBooks()) {
            System.out.println(book.getInfo());
        }
    }
}