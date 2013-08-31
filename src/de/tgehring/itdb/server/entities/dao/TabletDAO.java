/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities.dao;

import java.util.List;

import javax.persistence.EntityManager;

import de.tgehring.itdb.server.entities.Tablet;

/**
 * The Class TabletDAO represents the Data Access Object for tablets.
 */
public class TabletDAO implements JPADAO<Tablet> {
	
	/** The EntityManager. */
	private EntityManager em;
	
	/**
	 * Class constructor specifying the EntityManager.
	 *
	 * @param em the em
	 */
	public TabletDAO(EntityManager em) {
		this.em = em;
	}
	
	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#create(java.lang.Object)
	 */
	@Override
	public void create(Tablet entity) {
		em.persist(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read(long)
	 */
	@Override
	public Tablet read(long id) {
		return em.find(Tablet.class, id);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read()
	 */
	@Override
	public List<Tablet> read() {
		return em.createNamedQuery("Tablet.findAll").getResultList();
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#update(java.lang.Object)
	 */
	@Override
	public void update(Tablet entity) {
		em.merge(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#delete(long)
	 */
	@Override
	public void delete(long id) {
		Tablet tablet = em.find(Tablet.class, id);
		em.remove(tablet);
	}

}
