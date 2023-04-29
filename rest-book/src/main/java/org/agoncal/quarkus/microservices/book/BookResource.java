package org.agoncal.quarkus.microservices.book;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.Instant;

@Path("/api/books")
public class BookResource {

    @Inject
    Logger logger;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createABook(
            @FormParam("title") String title,
            @FormParam("author") String author,
            @FormParam("yearOfPublication") int yearOfPublication,
            @FormParam("genre") String genre) {
        Book book = new Book();
        book.isbn13 = "We will get it later from the number microservices";
        book.title = title;
        book.author = author;
        book.yearOfPublication = yearOfPublication;
        book.genre = genre;
        book.creationDate = Instant.now();
        logger.info("Book created:" + book);
        return Response
                .status(201)
                .entity(book)
                .build();
    }
}