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

import co.edu.udem.olympicgames.jpa.entities.Deportistas;
import co.edu.udem.olympicgames.jpa.entities.News;

public class DeportistasDAOImplTest {

	@Test
	public void testFindDeportistas() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<Deportistas> newsList = new ArrayList<Deportistas>();
		
		DeportistasDAO deportistasDAO = context.getBean(DeportistasDAOImpl.class);
		newsList = deportistasDAO.findDeportistas();
		
		for (Deportistas deportistas : newsList){
			
			System.out.println("Nombre Deportistas: " + deportistas.getNomdeportista());
			
		}
		
	}

}
