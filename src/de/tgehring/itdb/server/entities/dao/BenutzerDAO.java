/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities.dao;

import java.util.List;

import javax.persistence.EntityManager;

import de.tgehring.itdb.server.entities.Benutzer;

/**
 * The Class BenutzerDAO represents the Data Access Object for users.
 */
public class BenutzerDAO implements JPADAO<Benutzer> {
	
	/** The EntityManager. */
	private EntityManager em;
	
	/**
	 * Class constructor specifying the EntityManager.
	 *
	 * @param em the em
	 */
	public BenutzerDAO(EntityManager em) {
		this.em = em;
	}
	
	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#create(java.lang.Object)
	 */
	@Override
	public void create(Benutzer entity) {
		em.persist(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read(long)
	 */
	@Override
	public Benutzer read(long id) {
		return em.find(Benutzer.class, id);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read()
	 */
	@Override
	public List<Benutzer> read() {
		return em.createNamedQuery("Benutzer.findAll").getResultList();
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#update(java.lang.Object)
	 */
	@Override
	public void update(Benutzer entity) {
		Benutzer b = em.find(Benutzer.class, entity.getId());
		b.setBenutzername(entity.getBenutzername());
		b.setVorname(entity.getVorname());
		b.setNachname(entity.getNachname());
		b.setPasswort(entity.getPasswort());
		b.setAdmin(entity.isAdmin());
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#delete(long)
	 */
	@Override
	public void delete(long id) {
		Benutzer entity = em.find(Benutzer.class, id);
		em.remove(entity);
	}
}
