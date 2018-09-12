package sopra.promo404.hopital;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sopra.promo404.hopital.dao.IRepositorySalle;
import sopra.promo404.hopital.model.Salle;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HopitalApplicationTests {

	@Autowired
	private IRepositorySalle salleRepo;

	@Test
	public void contextLoads() {

		Salle salleMarcAntoine = new Salle();
		
		salleMarcAntoine.setNom("Marc Antoine");
		
		salleRepo.save(salleMarcAntoine);
	}

}
