package com.rajeshduggal.gettingstarted;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

@Path("hello")
@RequestScoped
public class GettingStartedResource {

    @Context
    private UriInfo context;

    public GettingStartedResource() {
    }

    /**
     * Retrieves representation of an instance of com.rajeshduggal.gettingstarted.GettingStartedResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "HHHHelloWorld";
    }

    /**
     * PUT method for updating or creating an instance of GettingStartedResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
