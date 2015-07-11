package com.javacodegeeks.jersey.main;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 

@Path("account")
public class AccountDetailsService {
 
    @GET
    @Path("/details/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAccountDetails(@PathParam("param") String accountName) {
    	String output = "Account Name : " + accountName;
		return Response.status(200).entity(output).build();
    }
}