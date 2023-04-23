package org.agoncal.quarkus.microservices.number;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.json.bind.annotation.JsonbTransient;
import java.time.Instant;

public class IsnbNumbers {

    @JsonProperty("isbn_13")
    public String isbn13;
    @JsonProperty("isbn_10")
    public String isbn10;
    @JsonbTransient
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
