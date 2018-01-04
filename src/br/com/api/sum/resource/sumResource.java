package br.com.api.sum.resource;

import br.com.api.sum.model.sum;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.thoughtworks.xstream.XStream;

@Path("sum")
public class sumResource {
	
	@Path("{value1}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String Soma(@PathParam("value1") int value1, @PathParam("value1") int value2) {
		sum sum = new sum(value1, value2);
		return new XStream().toXML( sum.Total());		
	}
}
