package org.agoncal.quarkus.microservices.book;

import java.time.Instant;

public class Book {
    public String isbn13;
    public String title;
    public String author;
    public int yearOfPublication;
    public String genre;
    public Instant creationDate;

    @Override
    public String toString() {
        return "Book{" +
                "isbn13='" + isbn13 + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", genre='" + genre + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
