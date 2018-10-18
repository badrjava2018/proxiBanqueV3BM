package org.formation;

import static org.junit.Assert.assertNotNull;

import org.formation.spring.dao.CrudClient;
import org.formation.spring.model.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProxiBanqueV3BmApplicationTests {

	@Autowired
	private CrudClient crudClient;

	@Test
	public void contextLoads() {

		assertNotNull(crudClient);
//		
//		Client c = new Client();
//		c.setAdresse("jhhjhjhj");
//		
//		clientDao.save(c);

	}

}
