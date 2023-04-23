package org.agoncal.quarkus.microservices.number;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.Instant;
import java.util.Random;

@Path("/api/numbers")
@Tag(name = "Number REST Endpoint")
public class NumberResource {

    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Generates book numbers",
            description = "ISBN 13 and ISBN 10 numbers"
    )
    public IsnbNumbers generateIsbnNumbers() {
        IsnbNumbers isnbNumbers = new IsnbNumbers();
        isnbNumbers.isbn13 = "13-" + new Random().nextInt(100_000_000);
        isnbNumbers.isbn10 = "10-" + new Random().nextInt(100_000);
        isnbNumbers.generationDate = Instant.now();
        logger.info("Numbers generated " + isnbNumbers);
        return isnbNumbers;
    }
}