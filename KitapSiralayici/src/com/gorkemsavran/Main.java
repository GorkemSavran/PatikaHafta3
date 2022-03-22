package com.gorkemsavran;

import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();

        Book book1 = new Book("a", 10, "fdsa", new Date());
        Book book2 = new Book("b", 7, "gfdsgf", new Date());
        Book book3 = new Book("c", 4, "hgfdhgfd", new Date());
        Book book4 = new Book("d", 6, "bsdbfds", new Date());
        Book book5 = new Book("e", 11, "ndfngfd", new Date());

        books.add(book4);
        books.add(book1);
        books.add(book3);
        books.add(book2);
        books.add(book5);

        books.stream().map(Book::getName).forEach(System.out::println);

        System.out.println("-------------------------------------------------------");

        Set<Book> booksByPageCount = new TreeSet<>(Comparator.comparing(Book::getPageCount));

        booksByPageCount.add(book4);
        booksByPageCount.add(book1);
        booksByPageCount.add(book3);
        booksByPageCount.add(book2);
        booksByPageCount.add(book5);

        booksByPageCount.stream().map(Book::getPageCount).forEach(System.out::println);
    }
}
