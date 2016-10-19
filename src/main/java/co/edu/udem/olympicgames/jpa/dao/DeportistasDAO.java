package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import co.edu.udem.olympicgames.jpa.entities.Deportistas;



public interface DeportistasDAO {
	
	public Deportistas findDeportistas(int id);
	
	public List<Deportistas> findDeportistas();

}
