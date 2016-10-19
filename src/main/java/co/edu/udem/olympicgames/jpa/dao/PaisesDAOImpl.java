package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.edu.udem.olympicgames.jpa.entities.Paises;

@Repository
public class PaisesDAOImpl implements PaisesDAO{
	
	@PersistenceContext
	private EntityManager em = null;
	
	
	public Paises findPaises(int id) {
		
		return null;
	}

	public List<Paises> findPaises() {
		
		
		Query query = em.createQuery("SELECT n FROM Paises n");
		return query.getResultList();
		
	}


}
