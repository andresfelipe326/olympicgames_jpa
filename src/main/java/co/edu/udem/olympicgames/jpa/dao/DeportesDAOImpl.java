package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.edu.udem.olympicgames.jpa.entities.Deportes;


@Repository
public class DeportesDAOImpl implements DeportesDAO {
	
	@PersistenceContext
	private EntityManager em = null;
	
	
	public Deportes findDeportes(int id) {
		
		return null;
	}

	public List<Deportes> findDeportes() {
		
		
		Query query = em.createQuery("SELECT n FROM Deportes n");
		return query.getResultList();
		
	}

}
