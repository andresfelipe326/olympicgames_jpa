package co.edu.udem.olympicgames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.jpa.entities.Arenas;


public class ArenasDAOImplTest {

	@Test
	public void testFindDeportes() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<Arenas> arenasList = new ArrayList<Arenas>();
		
		ArenasDAO arenasDAO = context.getBean(ArenasDAOImpl.class);
		arenasList = arenasDAO.findArenas();
		
		for (Arenas arenas : arenasList){
			
			System.out.println("Nombre de Arena: " + arenas.getNomarena());
			
		}
		
	}

}
