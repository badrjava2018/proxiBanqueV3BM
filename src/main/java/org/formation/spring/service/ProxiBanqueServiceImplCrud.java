package org.formation.spring.service;

import java.util.List;
import java.util.Optional;

import org.formation.spring.dao.CrudClient;
import org.formation.spring.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class ProxiBanqueServiceImplCrud implements IProxiBanqueServiceImplCrud {

	@Autowired
	public CrudClient clientDao;

	@Override
	public void addClient(Client c) {
		clientDao.save(c);

	}

	@Override
	public List<Client> listClients() {
		return clientDao.findAll();
	}

	@Override
	public void deleteClient(int idClient) {
		clientDao.deleteById(idClient);

	}

	@Override
	public Client editClient(int idClient) {
		Optional<Client> optional = clientDao.findById(idClient);
		return optional.get();
	}

	@Override
	public void updateClient(Client c) {
		clientDao.save(c);

	}

}
