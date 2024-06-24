package com.lld.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String name;
    private final List<Book> books = new ArrayList<>();

    public void loadBooks() {
        System.out.println("Loading Books from DB");
        // uses database call to fetch books
        for (int i = 1; i < 11; i++) {
            books.add(new Book(i,"Book " + i));
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public BookShop clone() {
        BookShop bookShop = new BookShop();

        for (Book b : this.getBooks()) {
            bookShop.getBooks().add(b);
        }

        return bookShop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }
}
