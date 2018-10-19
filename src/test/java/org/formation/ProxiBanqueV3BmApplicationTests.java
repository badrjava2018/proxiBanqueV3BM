package org.formation;

import static org.junit.Assert.assertNotNull;

import org.formation.spring.dao.CrudClient;
import org.formation.spring.dao.CrudCompteCourantDao;
import org.formation.spring.dao.CrudConseillerDao;
import org.formation.spring.model.Client;
import org.formation.spring.model.CompteCourant;
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
	@Autowired
	private CrudConseillerDao crudConseiller;

	@Autowired
	private CrudCompteCourantDao crudcomptecourant;

//	private CrudConseiller crudconseiller;

	@Test
	public void contextLoads() {

		assertNotNull(crudClient);
		assertNotNull(crudConseiller);
		assertNotNull(crudcomptecourant);

//		CompteCourant compte10 = new CompteCourant(17, 4870, 100);
//
//		
//
//		Client c10 = new Client();
//		c10.setAdresse("rue de bastille");
//		c10.setNom("hjiyhhjhjhh");
//		c10.setPrenom("maroua");
//		c10.addCompteCourant(compte10);
//		
//		crudClient.save(c10);
		
//		CompteCourant compte11 = new CompteCourant(17548, 54890, 1000);
//
//		Client c11 = new Client();
//
//		c11.setAdresse("rue du nord");
//		c11.setNom("Ahmed");
//		c11.setPrenom("badr");
//		c11.addCompteCourant(compte11);
		
		
		
		Conseiller c2= new Conseiller();
		c2.setNom("amir");
		c2.setPrenom("youssef");
		c2.setAdresse("rue de Seville");
		
		
		Client c3 = new Client();
		c3.setAdresse("rue de bastille");
		c3.setNom("hjiyhhjhjhh");
		c3.setPrenom("maroua");
		c3.setConseiller(c2);
		
		crudClient.save(c3);
		crudConseiller.save(c2);
		
		
		
		
		

//		CompteCourant compte1 = new CompteCourant(25468, 5426.54, 100, c);
//
//		Conseiller c1 = new Conseiller();
//		c1.setAdresse("rue de france");
//		c1.setNom("françois");
//		c1.setPrenom("amir");
//		c1.addClient(c);

		
//		crudClient.save(c11);

//		Conseiller c1 = new Conseiller();
//		c1.setAdresse("paris");
//		c1.setId(5);
//		c1.setNom("klkkkl");
//		c1.setPrenom("ljk^p^p$^$^$^");
//		
//		crudconseiller.save(c1);

	}

}
