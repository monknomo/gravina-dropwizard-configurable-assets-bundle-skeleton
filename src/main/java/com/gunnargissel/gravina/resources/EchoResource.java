package com.gunnargissel.gravina.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/echo")
public class EchoResource {

    @GET
    @Path("/{msg}")
    @Produces(MediaType.TEXT_PLAIN)
    public String echo(@PathParam("msg") String msg){
        return msg;
    }
}
