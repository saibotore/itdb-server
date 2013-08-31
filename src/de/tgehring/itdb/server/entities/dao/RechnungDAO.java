/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities.dao;

import java.util.List;

import javax.persistence.EntityManager;

import de.tgehring.itdb.server.entities.Rechnung;

/**
 * The Class RechnungDAO represents the Data Access Object for invoices.
 */
public class RechnungDAO  implements JPADAO<Rechnung> {
	
	/** The EntityManager. */
	private EntityManager em;
	
	/**
	 * Class constructor specifying the EntityManager.
	 *
	 * @param em the em
	 */
	public RechnungDAO(EntityManager em) {
		this.em = em;
	}
	
	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#create(java.lang.Object)
	 */
	@Override
	public void create(Rechnung entity) {
		em.persist(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read(long)
	 */
	@Override
	public Rechnung read(long id) {
		return em.find(Rechnung.class, id);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read()
	 */
	@Override
	public List<Rechnung> read() {
		return em.createNamedQuery("Rechnung.findAll").getResultList();
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#update(java.lang.Object)
	 */
	@Override
	public void update(Rechnung entity) {
		em.merge(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#delete(long)
	 */
	@Override
	public void delete(long id) {
		Rechnung rechnung = em.find(Rechnung.class, id);
		em.remove(rechnung);
	}

}
