package test;

import clasesfinal.ISBN;
import library.Book;
import library.Library;

public class TestLibrary {
   public static void main(String[] args) {
        Library library = new Library();
        library.addBook(
            new Book(new ISBN("876543217543"), 
                    "Effective Java", 
                    "Joshua Bloch")
        );
        library.addBook(
            new Book(new ISBN("8765432176543"), 
                    "Spring in Action", 
                    "Joshua Bloch")
        );
        library.addBook(
            new Book(new ISBN("8765432174321"), 
                    "Java Concurrency in Action", 
                    "Craing Walls")
        );

        library.showBooks();
        System.out.println("---------------Buscar------------------");
        System.out.println(library.findBook(new ISBN("876543217421")));
        System.out.println("------------------Mayor titulo--------------");
        System.err.println(library.longestBook());
        System.out.println("------------Total autores-------------");
        System.err.println("Total autores: " + library.countAuthors());
        System.out.println("--------------ISBN unicos-------------");
        ISBN[] uniques = library.uniqueISBNs();
        for (ISBN isbn : uniques) {
            System.out.println(isbn);
        }

   }

}
