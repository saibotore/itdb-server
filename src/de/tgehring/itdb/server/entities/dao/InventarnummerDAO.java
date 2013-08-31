/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities.dao;

import javax.persistence.EntityManager;

import de.tgehring.itdb.server.entities.Inventarnummer;

/**
 * The Class InventarnummerDAO represents the Data Access Object for inventory numbers.
 */
public class InventarnummerDAO {

	/** The EntityManager. */
	private EntityManager em;
	
	/**
	 * Class constructor specifying the EntityManager.
	 *
	 * @param em the em
	 */
	public InventarnummerDAO(EntityManager em) {
		this.em = em;
	}
	
	/**
	 * Gets the last inventarnummer.
	 *
	 * @return the last inventarnummer
	 */
	public Inventarnummer getLastInventarnummer() {
		return (Inventarnummer) em.createNamedQuery("Inventarnummer.last").getResultList().get(0);
	}
	
}
