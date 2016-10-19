package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import co.edu.udem.olympicgames.jpa.entities.News;

public interface NewsDAO {
	
	public News findNews(int id);
	
	public List<News> findNews();

}
