package org.formation.spring.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.formation.spring.model.Conseiller;


@Path("conseillerWebService")
public interface ConseilelrWebService {
	
	@GET
	@Path("/conseillers/{id}/")
	Conseiller getConseiller(@PathParam("id") String id);

	@GET
	@Path("/conseillers")
	List<Conseiller> getConseillers();

	@PUT
	@Path("/conseillers/")
	Response updateConseiller(Conseiller Conseiller);

	@POST
	@Path("/conseillers/")
	Response addConseiller(Conseiller Conseiller);

	@DELETE
	@Path("/conseillers/{id}/")
	Response deleteConseillers(@PathParam("id") String id);

}
