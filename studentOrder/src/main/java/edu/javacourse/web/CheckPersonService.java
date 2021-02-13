package edu.javacourse.web;

import edu.javacourse.city.domain.PersonRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;

@Path("/check")
public class CheckPersonService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PersonRequest checkPerson(@PathParam("id") int simpleId,
                                     @QueryParam("name") String simpleName) {

        PersonRequest pr = new PersonRequest();
        pr.setSurName("Васильева");
        pr.setGivenName("Ирина");
        pr.setPatronymic("Петровна");
        pr.setDateOfBirth(LocalDate.of(1995, 3, 18));
        pr.setStreetCode(1);
        pr.setBuilding("271");
        pr.setApartment("4");

        return pr;
    }
}

