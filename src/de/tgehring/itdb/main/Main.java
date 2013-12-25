package de.tgehring.itdb.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.tgehring.itdb.server.service.CRUDService;

public class Main {
	
	public static void main(String[] args) {
		String punit = "ITDB";
		EntityManagerFactory factory;
		EntityManager em;
		factory = Persistence.createEntityManagerFactory(punit);
		em = factory.createEntityManager();
		em.close();
	}

}
