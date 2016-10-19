package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import co.edu.udem.olympicgames.jpa.entities.Deportes;
import co.edu.udem.olympicgames.jpa.entities.Deportistas;

public interface DeportesDAO {
	
	public Deportes findDeportes(int id);

	public List<Deportes> findDeportes();

}
