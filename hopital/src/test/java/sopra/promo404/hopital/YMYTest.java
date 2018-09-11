package sopra.promo404.hopital;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sopra.promo404.hopital.dao.IRepositoryConsultation;
import sopra.promo404.hopital.dao.IRepositoryPatient;
import sopra.promo404.hopital.model.Consultation;
import sopra.promo404.hopital.model.Patient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YMYTest {
	@Autowired
	private IRepositoryPatient patientRepo;
	
	@Autowired
	private IRepositoryConsultation consuRepo;

	@Test
	public void contextLoads() {
		
		Consultation consu = new Consultation();
		
		consuRepo.save(consu);
	
		ArrayList<Consultation> listConsu = new ArrayList<Consultation>();
		listConsu.add(consu);

		Patient dupont = new Patient("DUPONT");
		
		dupont.setConsultations(listConsu);

		patientRepo.save(dupont);
		

	}

}
