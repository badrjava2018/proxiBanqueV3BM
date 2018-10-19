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

@Path("conseillerservice")
public interface ConseilelrWebService {

	@GET
	@Path("/conseiller/{id}/")
	Conseiller getConseiller(@PathParam("id") String id);

	@GET
	@Path("/conseillers")
	List<Conseiller> getConseillers();

	@PUT
	@Path("/conseillers/")
	Response updateConseiller(Conseiller conseiller);

	@POST
	@Path("/conseillers/")
	Response addConseiller(Conseiller conseiller);

	@DELETE
	@Path("/conseillers/{id}/")
	Response deleteConseillers(@PathParam("id") String id);

}
