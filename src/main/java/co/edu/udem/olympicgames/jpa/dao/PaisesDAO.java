package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;


import co.edu.udem.olympicgames.jpa.entities.Paises;

public interface PaisesDAO {
	
public Paises findPaises(int id);
	
	public List<Paises> findPaises();

}
