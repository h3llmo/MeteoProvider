package com.damosoft.meteo.ws;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@Path("/MyRestService")
@ApplicationPath("/resources")
public class MeteoProvider extends Application{
    @Path("/sayHello")
    @GET
    public String getHello() {
        return "hello world";
    }

    @GET
    @Path("{location}")
    public Response getMeteo(@PathParam("location") final String location) {
        return Response.ok("25.0").build();
    }
}
