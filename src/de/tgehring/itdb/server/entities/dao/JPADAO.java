/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities.dao;

import java.util.List;

/**
 * The Interface JPADAO represents Data Access Objects for the Java Persistence API.
 *
 * @param <T> the generic type
 */
public interface JPADAO<T> {
	
	/**
	 * Creates the entity.
	 *
	 * @param entity the entity
	 */
	public void create(T entity);
	
	/**
	 * Gets a specified entity.
	 *
	 * @param id the id
	 * @return the t
	 */
	public T read(long id);
	
	/**
	 * Gets all entities.
	 *
	 * @return the list
	 */
	public List<T> read();
	
	/**
	 * Updates a specified entity.
	 *
	 * @param entity the entity
	 */
	public void update(T entity);
	
	/**
	 * Deletes a specified entity.
	 *
	 * @param id the id
	 */
	public void delete(long id);

}
