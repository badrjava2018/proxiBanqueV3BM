package org.formation.spring.service;


import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response;

import org.formation.spring.dao.CrudClient;
import org.formation.spring.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("clientWebService")
public class ClientWebServiceImpl implements ClientWebService {

;
	
	@Autowired
	private CrudClient clientDao;

	@Override
	public Client getClient(String id) {
		Optional<Client> optional = clientDao.findById(Integer.valueOf(id));
		return optional.get();
	}

	@Override
	public List<Client> getClients() {
		return clientDao.findAll();
	}

	@Override
	public Response updateClient(Client c) {
		clientDao.save(c);
		return Response.ok().build();
	}

	@Override
	public Response addClient(Client c) {
		clientDao.save(c);
		return Response.ok().build();
	}

	@Override
	public Response deleteClients(String id) {
		clientDao.deleteById(Integer.valueOf(id));
		;
		return Response.ok().build();
	}

}
