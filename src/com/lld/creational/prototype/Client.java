package com.lld.creational.prototype;

public class Client {
    public static void main(String[] args) {
        BookShop bookShop1 = new BookShop();
        bookShop1.setName("Crossword - Akota");
        bookShop1.loadBooks();
        System.out.println(bookShop1);

        BookShop bookShop2 = bookShop1.clone();
        // not loading from db cloning from prototype
        bookShop2.setName("Crossword - Alkapuri");
        System.out.println(bookShop2);

    }
}
