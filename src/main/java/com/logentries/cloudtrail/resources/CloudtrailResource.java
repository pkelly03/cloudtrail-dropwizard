package com.snapci.microblog.resources;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/account/cloudtrail")
@Produces(MediaType.APPLICATION_JSON)
public class CloudtrailResource {

    public CloudtrailResource() {
    }

    @GET
    public Response get() {
        return Response.status(Response.Status.OK).build();
    }

}
