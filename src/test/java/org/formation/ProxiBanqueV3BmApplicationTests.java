package org.formation;

import static org.junit.Assert.assertNotNull;

import org.formation.spring.dao.CrudClient;

import org.formation.spring.model.Client;
import org.formation.spring.model.Conseiller;
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

//	private CrudConseiller crudconseiller;

	@Test
	public void contextLoads() {

		assertNotNull(crudClient);
		
		Client c = new Client();
		c.setAdresse("kijpoj,lo");
		c.setId(5);
		c.setNom("kml$mp$^l^p");

		crudClient.save(c);
//		
//		Conseiller c1 = new Conseiller();
//		c1.setAdresse("paris");
//		c1.setId(5);
//		c1.setNom("klkkkl");
//		c1.setPrenom("ljk^p^p$^$^$^");
//		
//		crudconseiller.save(c1);

	}
	
	
	
	
	

}

