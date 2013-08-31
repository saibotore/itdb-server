/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities.dao;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;

import de.tgehring.itdb.server.entities.Hersteller;
import de.tgehring.itdb.server.entities.HerstellerTyp;

/**
 * The Class HerstellerDAO represents the Data Access Object for manufacturers.
 */
public class HerstellerDAO implements JPADAO<Hersteller> {
	
	/** The EntityManager. */
	private EntityManager em;
	
	/**
	 * Class constructor specifying the EntityManager.
	 *
	 * @param em the em
	 */
	public HerstellerDAO(EntityManager em) {
		this.em = em;
	}
	
	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#create(java.lang.Object)
	 */
	@Override
	public void create(Hersteller entity) {
		em.persist(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read(long)
	 */
	@Override
	public Hersteller read(long id) {
		return em.find(Hersteller.class, id);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#read()
	 */
	@Override
	public List<Hersteller> read() {
		return em.createNamedQuery("Hersteller.findAll").getResultList();
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#update(java.lang.Object)
	 */
	@Override
	public void update(Hersteller entity) {
		em.merge(entity);
	}

	/* (non-Javadoc)
	 * @see de.tgehring.itdb.server.entities.dao.JPADAO#delete(long)
	 */
	@Override
	public void delete(long id) {
		Hersteller hersteller = em.find(Hersteller.class, id);
		em.remove(hersteller);
	}

	/**
	 * Gets the all cpu hersteller.
	 *
	 * @return the all cpu hersteller
	 */
	public List<Hersteller> getAllCpuHersteller() {
		List<Hersteller> result = em.createNamedQuery("Hersteller.findAll").getResultList();
		List<Hersteller> cpu = new LinkedList<Hersteller>();
		for(Hersteller hersteller: result) {
			if(hersteller.getTyp().equals(HerstellerTyp.Cpu)) {
				cpu.add(hersteller);
			}
		}
		return cpu;
	}
	
	/**
	 * Gets the all gpu hersteller.
	 *
	 * @return the all gpu hersteller
	 */
	public List<Hersteller> getAllGpuHersteller() {
		List<Hersteller> result = em.createNamedQuery("Hersteller.findAll").getResultList();
		List<Hersteller> gpu = new LinkedList<Hersteller>();
		for(Hersteller hersteller: result) {
			if(hersteller.getTyp().equals(HerstellerTyp.Gpu)) {
				gpu.add(hersteller);
			}
		}
		return gpu;
	}
	
	/**
	 * Gets the all drucker hersteller.
	 *
	 * @return the all drucker hersteller
	 */
	public List<Hersteller> getAllDruckerHersteller() {
		List<Hersteller> result = em.createNamedQuery("Hersteller.findAll").getResultList();
		List<Hersteller> drucker = new LinkedList<Hersteller>();
		for(Hersteller hersteller: result) {
			if(hersteller.getTyp().equals(HerstellerTyp.Drucker)) {
				drucker.add(hersteller);
			}
		}
		return drucker;
	}
	
	/**
	 * Gets the all monitor hersteller.
	 *
	 * @return the all monitor hersteller
	 */
	public List<Hersteller> getAllMonitorHersteller() {
		List<Hersteller> result = em.createNamedQuery("Hersteller.findAll").getResultList();
		List<Hersteller> monitor = new LinkedList<Hersteller>();
		for(Hersteller hersteller: result) {
			if(hersteller.getTyp().equals(HerstellerTyp.Monitor)) {
				monitor.add(hersteller);
			}
		}
		return monitor;
	}
	
	/**
	 * Gets the all rechner hersteller.
	 *
	 * @return the all rechner hersteller
	 */
	public List<Hersteller> getAllRechnerHersteller() {
		List<Hersteller> result = em.createNamedQuery("Hersteller.findAll").getResultList();
		List<Hersteller> rechner = new LinkedList<Hersteller>();
		for(Hersteller hersteller: result) {
			if(hersteller.getTyp().equals(HerstellerTyp.Rechner)) {
				rechner.add(hersteller);
			}
		}
		return rechner;
	}
	
	/**
	 * Gets the all tablet hersteller.
	 *
	 * @return the all tablet hersteller
	 */
	public List<Hersteller> getAllTabletHersteller() {
		List<Hersteller> result = em.createNamedQuery("Hersteller.findAll").getResultList();
		List<Hersteller> tablet = new LinkedList<Hersteller>();
		for(Hersteller hersteller: result) {
			if(hersteller.getTyp().equals(HerstellerTyp.Tablet)) {
				tablet.add(hersteller);
			}
		}
		return tablet;
	}

}
