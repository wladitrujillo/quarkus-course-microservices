package org.agoncal.quarkus.microservices.number;

import java.time.Instant;

public class IsnbNumbers {

    public String isbn13;
    public String isbn10;
    public Instant generationDate;

    @Override
    public String toString() {
        return "IsnbNumbers{" +
                "isbn13='" + isbn13 + '\'' +
                ", isbn10='" + isbn10 + '\'' +
                ", generationDate=" + generationDate +
                '}';
    }
}
