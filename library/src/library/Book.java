package library;

import clasesfinal.ISBN;

public class Book {
    private ISBN isbn;
    private String title;
    private String author;

    public Book(ISBN isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "{isbn: " + isbn + ", title: " + title + ", author: " + author + "}";
    }
}
