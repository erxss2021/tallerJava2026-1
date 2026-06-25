package library;

import clasesfinal.ISBN;

public class Library {
    private Book[] books;

    public Library() {
        books = new Book[0];
    }

    public void addBook(Book book){
        Book[] temp = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            temp[i] = books[i];
        }
        temp[books.length] = book;
        books = temp;
    }

    public Book findBook(ISBN isbn){
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public boolean removeBook(ISBN isbn){
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }

        Book[] temp = new Book[books.length - 1];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (i != index) {
                temp[j] = books[i];
                j++;
            }
        }
        books = temp;
        return true;
    }

    public Book longestBook(){
        if (books.length == 0) {
            return null;
        }
        Book book = books[0];
        for (Book b : books) {
            if (b.getTitle().length() > book.getTitle().length()) {
                book = b;
            }
        }
        return book;
    }

    public int countAuthors(){
        String[] authors = new String[0];
        for (Book book : books) {
            boolean exists = false;
            for (String title : authors) {
                if (title.equals(book.getAuthor())) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                String[] temp = new String[authors.length + 1];
                for (int i = 0; i < authors.length; i++) {
                    temp[i] = authors[i];
                }
                temp[authors.length] = book.getAuthor();
                authors = temp;
            }
        }
        return authors.length;
    }

    public ISBN[] uniqueISBNs(){
        ISBN[] isbns = new ISBN[0];
        for (Book book : books) {
            boolean found = false;
            for (ISBN isbn : isbns) {
                if (isbn.equals(book.getIsbn())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ISBN[] temp = new ISBN[isbns.length + 1];
                for (int i = 0; i < isbns.length; i++) {
                    temp[i] = isbns[i];
                }
                temp[isbns.length] = book.getIsbn();
                isbns = temp;
            }
        }
        return isbns;
    }

    public void showBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

}