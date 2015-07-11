package com.javacodegeeks.areyes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/customer")
public class CustomerRestService {
 
	@GET
	@Path("/printmessage/{param}/{param1}")
	public Response printMessage(@PathParam("param") String msg, @PathParam("param1") String msg1) {
 
		String result = "Restful Return! : " + msg;
		return Response.status(200).entity(result).build();
 
	}
 
}
