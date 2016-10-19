package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.edu.udem.olympicgames.jpa.entities.Deportistas;

@Repository
public class DeportistasDAOImpl implements DeportistasDAO{
	
	@PersistenceContext
	private EntityManager em = null;
	
	
	public Deportistas findDeportistas(int id) {
		
		return null;
	}

	public List<Deportistas> findDeportistas() {
		
		
		Query query = em.createQuery("SELECT n FROM Deportistas n");
		return query.getResultList();
		
	}

}
