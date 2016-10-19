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

public class NewsDAOImplTest {

	

	@Test
	public void testFindNews() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<News> newsList = new ArrayList<News>();
		
		NewsDAO newsDAO = context.getBean(NewsDAOImpl.class);
		newsList = newsDAO.findNews();
		
		for (News news : newsList){
			
			System.out.println("title: " + news.getTitle());
			
		}
		
	}

}
