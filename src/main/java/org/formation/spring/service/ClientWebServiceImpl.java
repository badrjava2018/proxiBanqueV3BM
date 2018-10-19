package org.formation.spring.service;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response;

import org.formation.spring.dao.CrudClient;
import org.formation.spring.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("clientWebService")
public class ClientWebServiceImpl implements ClientWebService {

	public static final Logger LOGGER = LoggerFactory.getLogger(ClientWebServiceImpl.class);

	@Autowired
	private CrudClient clientDao;

	@Override
	public Client getClient(String id) {
		Optional<Client> optional = clientDao.findById(Integer.valueOf(id));
		return optional.get();
	}

	@Override
	public List<Client> getClients() {
		LOGGER.debug("ma lite de clients ");
		LOGGER.info("infos");

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
        return Response.ok().build();
	}

	

	
}
