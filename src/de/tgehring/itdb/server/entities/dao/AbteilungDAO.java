/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities.dao;

import java.util.List;

import javax.persistence.EntityManager;

import de.tgehring.itdb.server.entities.Abteilung;

/**
 * The Class AbteilungDAO represents the Data Access Object for Departments.
 */
public class AbteilungDAO implements JPADAO<Abteilung> {

	/** The EntityManager. */
	private EntityManager em;
	
	/**
	 * Class constructor specifying the EntityManager.
	 *
	 * @param em the EntityManager
	 */
	public AbteilungDAO(EntityManager em) {
		this.em = em;
	}
	
	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#create(java.lang.Object)
	 */
	@Override
	public void create(Abteilung entity) {
		em.persist(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read(long)
	 */
	@Override
	public Abteilung read(long id) {
		return em.find(Abteilung.class, id);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read()
	 */
	@Override
	public List<Abteilung> read() {
		return em.createNamedQuery("Abteilung.findAll").getResultList();
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#update(java.lang.Object)
	 */
	@Override
	public void update(Abteilung entity) {
		em.merge(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#delete(long)
	 */
	@Override
	public void delete(long id) {
		Abteilung abteilung = em.find(Abteilung.class, id);
		em.remove(abteilung);
	}
	
}
