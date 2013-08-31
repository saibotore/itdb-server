/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities.dao;

import java.util.List;

import javax.persistence.EntityManager;

import de.tgehring.itdb.server.entities.Monitor;

/**
 * The Class MonitorDAO represents the Data Access Object for monitors.
 */
public class MonitorDAO implements JPADAO<Monitor> {
	
	/** The EntityManager. */
	private EntityManager em;
	
	/**
	 * Class constructor specifying the EntityManager.
	 *
	 * @param em the em
	 */
	public MonitorDAO(EntityManager em) {
		this.em = em;
	}
	
	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#create(java.lang.Object)
	 */
	@Override
	public void create(Monitor entity) {
		em.persist(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read(long)
	 */
	@Override
	public Monitor read(long id) {
		return em.find(Monitor.class, id);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read()
	 */
	@Override
	public List<Monitor> read() {
		return em.createNamedQuery("Monitor.findAll").getResultList();
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#update(java.lang.Object)
	 */
	@Override
	public void update(Monitor entity) {
		em.merge(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#delete(long)
	 */
	@Override
	public void delete(long id) {
		Monitor monitor = em.find(Monitor.class, id);
		em.remove(monitor);
	}

}
