package org.formation.spring.service;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response;

import org.formation.spring.dao.CrudConseillerDao;

import org.formation.spring.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("conseillerWebService")
public class ConseillerWebServiceImpl implements ConseilelrWebService {

	@Autowired
	CrudConseillerDao conseillerdao;

	@Override
	public Conseiller getConseiller(String id) {

		Optional<Conseiller> optional = conseillerdao.findById(Integer.valueOf(id));
		return optional.get();

	}

	@Override
	public List<Conseiller> getConseillers() {

		return conseillerdao.findAll();
	}

	@Override
	public Response updateConseiller(Conseiller conseiller) {

		conseillerdao.save(conseiller);
		return Response.ok().build();

	}

	@Override
	public Response addConseiller(Conseiller conseiller) {

		conseillerdao.save(conseiller);
		return Response.ok().build();

	}

	@Override
	public Response deleteConseillers(String id) {

		conseillerdao.deleteById(Integer.valueOf(id));

		return Response.ok().build();

	}

}
