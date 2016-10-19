package co.edu.udem.olympicgames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.jpa.entities.News;
import co.edu.udem.olympicgames.jpa.entities.Paises;

public class PaisesDAOImplTest {

	@Test
	public void testFindPaises() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<Paises> paisesList = new ArrayList<Paises>();
		
		PaisesDAO paisesDAO = context.getBean(PaisesDAOImpl.class);
		paisesList = paisesDAO.findPaises();
		
		for (Paises paises : paisesList){
			
			System.out.println("Nombre de pais: " + paises.getNombrepais());
			
		}
		
	}


}
