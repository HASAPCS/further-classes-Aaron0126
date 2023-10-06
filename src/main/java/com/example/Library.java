package com.example;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books;

    public Library() {
        // TODO: Initialize the list of books
        this.books = new ArrayList<Book>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public Book findBookByISBN(String ISBN){
        for(Book book: books) {
            if(ISBN.equals(book.getISBN())){
                return book;
            }
        }
        return null;
    }
    // TODO: Implement methods to add a book, check out a book, return a book, and find a book by ISBN
}
