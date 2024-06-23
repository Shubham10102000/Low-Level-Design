package com.lld.behavioral.iterator;

import java.util.List;

public class Library implements Aggregate {

    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
