package co.edu.udem.olympicgames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.jpa.entities.Deportes;


public class DeportesDAOImplTest {

	@Test
	public void testFindDeportes() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<Deportes> newsList = new ArrayList<Deportes>();
		
		DeportesDAO deportesDAO = context.getBean(DeportesDAOImpl.class);
		newsList = deportesDAO.findDeportes();
		
		for (Deportes deportes : newsList){
			
			System.out.println("Nombre deporte: " + deportes.getNomdeporte());
			
		}
		
	}

}
