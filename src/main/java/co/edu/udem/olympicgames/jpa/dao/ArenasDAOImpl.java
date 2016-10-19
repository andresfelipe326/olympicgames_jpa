package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.edu.udem.olympicgames.jpa.entities.Arenas;

@Repository
public class ArenasDAOImpl implements ArenasDAO {
	
	@PersistenceContext
	private EntityManager em = null;
	
	
	public Arenas findArenas(int id) {
		
		return null;
	}

	public List<Arenas> findArenas() {
		
		
		Query query = em.createQuery("SELECT n FROM Arenas n");
		return query.getResultList();
		
	}

}
