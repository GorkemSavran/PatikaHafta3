package com.gorkemsavran;

import java.util.Date;

public class Book implements Comparable<Book> {

    private String name;
    private int pageCount;
    private String author;
    private Date publishDate;

    public Book(final String name, final int pageCount, final String author, final Date publishDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(final Book book) {
        return name.compareTo(book.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }
}
