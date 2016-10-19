package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.edu.udem.olympicgames.jpa.entities.News;


@Repository
public class NewsDAOImpl implements NewsDAO {

	@PersistenceContext
	private EntityManager em = null;
	
	
	public News findNews(int id) {
		
		return null;
	}

	public List<News> findNews() {
		
		
		Query query = em.createQuery("SELECT n FROM News n");
		return query.getResultList();
		
	}

}
