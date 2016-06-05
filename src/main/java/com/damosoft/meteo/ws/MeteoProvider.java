package com.damosoft.meteo.ws;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by User on 05/06/2016.
 */
@ApplicationPath("meteo")
@Path("services")
public class MeteoProvider {
    @Path("{location}")
    public Response getMeteo(@PathParam("location") final String location) {
        return Response.ok("25.0").build();
    }
}
