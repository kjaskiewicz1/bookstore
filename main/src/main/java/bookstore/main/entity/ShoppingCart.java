package com.example.bookstoreshoppingcart.Model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Long userId;
    private List<Book> books;

    public ShoppingCart(Long userId) {
        this.userId = userId;
        this.books = new ArrayList<>();
    }

    public Long getUserId() {
        return userId;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
