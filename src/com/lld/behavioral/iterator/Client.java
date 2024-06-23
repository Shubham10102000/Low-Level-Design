package com.lld.behavioral.iterator;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book(100, "Maths"),
                new Book(200, "Science"),
                new Book(300, "English"),
                new Book(400, "Robotics"),
                new Book(500,"Computer"));

        Library lib = new Library(books);
        Iterator itr = lib.createIterator();
        while (itr.hasNext()) {
            Book book = (Book) itr.next();
            System.out.println(String.format("Price of %s book is Rs. %d",book.getName(),book.getPrice()));
        }
    }
}
