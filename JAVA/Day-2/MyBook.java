package com.lab;


import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

public class MyBook {

    private static List<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public static void removeBook(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed: " + bookToRemove);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public static void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
   
        Book book1 = new Book("Atomic habits", "George Orwell", "1234567890");
        Book book2 = new Book("Wings of Fire", "Harper Lee", "0987654321");

        addBook(book1);
        addBook(book2);

        listBooks();


        removeBook("1234567890");

        listBooks();
    }
}
