package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import co.edu.udem.olympicgames.jpa.entities.Arenas;


public interface ArenasDAO {
	
	public Arenas findArenas(int id);

	public List<Arenas> findArenas();

}
