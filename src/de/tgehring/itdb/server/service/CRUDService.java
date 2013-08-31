/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.tgehring.itdb.server.entities.Abteilung;
import de.tgehring.itdb.server.entities.Benutzer;
import de.tgehring.itdb.server.entities.Cpu;
import de.tgehring.itdb.server.entities.Drucker;
import de.tgehring.itdb.server.entities.Dvm;
import de.tgehring.itdb.server.entities.Gebäude;
import de.tgehring.itdb.server.entities.Gpu;
import de.tgehring.itdb.server.entities.Hersteller;
import de.tgehring.itdb.server.entities.Inventarnummer;
import de.tgehring.itdb.server.entities.Lieferant;
import de.tgehring.itdb.server.entities.Monitor;
import de.tgehring.itdb.server.entities.Rechner;
import de.tgehring.itdb.server.entities.Rechnung;
import de.tgehring.itdb.server.entities.Software;
import de.tgehring.itdb.server.entities.Tablet;
import de.tgehring.itdb.server.entities.Todo;
import de.tgehring.itdb.server.entities.dao.AbteilungDAO;
import de.tgehring.itdb.server.entities.dao.BenutzerDAO;
import de.tgehring.itdb.server.entities.dao.CpuDAO;
import de.tgehring.itdb.server.entities.dao.DruckerDAO;
import de.tgehring.itdb.server.entities.dao.DvmDAO;
import de.tgehring.itdb.server.entities.dao.GebäudeDAO;
import de.tgehring.itdb.server.entities.dao.GpuDAO;
import de.tgehring.itdb.server.entities.dao.HerstellerDAO;
import de.tgehring.itdb.server.entities.dao.InventarnummerDAO;
import de.tgehring.itdb.server.entities.dao.LieferantDAO;
import de.tgehring.itdb.server.entities.dao.MonitorDAO;
import de.tgehring.itdb.server.entities.dao.RechnerDAO;
import de.tgehring.itdb.server.entities.dao.RechnungDAO;
import de.tgehring.itdb.server.entities.dao.SoftwareDAO;
import de.tgehring.itdb.server.entities.dao.TabletDAO;
import de.tgehring.itdb.server.entities.dao.TodoDAO;

/**
 * The Class CRUDService represents the service containing CRUD operations.
 */
public class CRUDService {
	
	/** The instance. */
	private static CRUDService instance = null;
	
	/** The Constant PERSISTENCE_UNIT_NAME. */
	private static final String PERSISTENCE_UNIT_NAME = "ITDB";
	
	/** The EntityManagerFactory. */
	private static EntityManagerFactory factory;
	
	/** The EntityManager. */
	private EntityManager em;
	
	/**
	 * Class constructor.
	 */
	private CRUDService() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	/**
	 * Gets the single instance of CRUDService.
	 *
	 * @return single instance of CRUDService
	 */
	public static CRUDService getInstance() {
		if(instance == null) {
			instance = new CRUDService();
		}
		return instance;
	}
	
	/**
	 * Adds the given department.
	 *
	 * @param abteilung the department
	 */
	public void addAbteilung(Abteilung abteilung) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new AbteilungDAO(em).create(abteilung);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given department.
	 *
	 * @param abteilung the department
	 */
	public void editAbteilung(Abteilung abteilung) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new AbteilungDAO(em).update(abteilung);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified department.
	 *
	 * @param id the id of the department
	 */
	public void deleteAbteilung(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new AbteilungDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified department.
	 *
	 * @param id the id of the department
	 * @return the specified department
	 */
	public Abteilung getAbteilung(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Abteilung abteilung = new AbteilungDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return abteilung;
	}
	
	/**
	 * Gets all departments.
	 *
	 * @return a list of all departments
	 */
	public List<Abteilung> getAllAbteilung() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Abteilung> abteilungen = new AbteilungDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return abteilungen;
	}
	
	/**
	 * Adds the given user.
	 *
	 * @param benutzer the given user
	 */
	public void addBenutzer(Benutzer benutzer) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new BenutzerDAO(em).create(benutzer);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given user.
	 *
	 * @param benutzer the given user
	 */
	public void editBenutzer(Benutzer benutzer) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new BenutzerDAO(em).update(benutzer);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete specified user.
	 *
	 * @param id the id of the user
	 */
	public void deleteBenutzer(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new BenutzerDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified user.
	 *
	 * @param id the id of the user
	 * @return the specified user
	 */
	public Benutzer getBenutzer(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Benutzer benutzer = new BenutzerDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return benutzer;
	}
	
	/**
	 * Gets all users.
	 *
	 * @return a list of all users
	 */
	public List<Benutzer> getAllBenutzer() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Benutzer> benutzerList = new BenutzerDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return benutzerList;
	}
	
	/**
	 * Adds the given cpu.
	 *
	 * @param cpu the given cpu
	 */
	public void addCpu(Cpu cpu) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new CpuDAO(em).create(cpu);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given cpu.
	 *
	 * @param cpu the given cpu
	 */
	public void editCpu(Cpu cpu) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new CpuDAO(em).update(cpu);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified cpu.
	 *
	 * @param id the id of the cpu
	 */
	public void deleteCpu(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new CpuDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified cpu.
	 *
	 * @param id the id of the cpu
	 * @return the specified cpu
	 */
	public Cpu getCpu(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Cpu cpu = new CpuDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return cpu;
	}
	
	/**
	 * Gets all cpus.
	 *
	 * @return a list of all cpus
	 */
	public List<Cpu> getAllCpu() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Cpu> cpuList = new CpuDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return cpuList;
	}
	
	/**
	 * Adds the given printer.
	 *
	 * @param drucker the given printer
	 */
	public void addDrucker(Drucker drucker) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new DruckerDAO(em).create(drucker);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given printer.
	 *
	 * @param drucker the given printer
	 */
	public void editDrucker(Drucker drucker) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new DruckerDAO(em).update(drucker);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified printer.
	 *
	 * @param id the id of the specified printer
	 */
	public void deleteDrucker(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new DruckerDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified printer.
	 *
	 * @param id the id of the specified printer
	 * @return the specified printer
	 */
	public Drucker getDrucker(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Drucker drucker = new DruckerDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return drucker;
	}
	
	/**
	 * Gets all printer.
	 *
	 * @return a list of all printer
	 */
	public List<Drucker> getAllDrucker() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Drucker> druckerList = new DruckerDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return druckerList;
	}
	
	/**
	 * Adds the given printer material.
	 *
	 * @param dvm the given printer material
	 */
	public void addDvm(Dvm dvm) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new DvmDAO(em).create(dvm);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given printer material.
	 *
	 * @param dvm the given printer material
	 */
	public void editDvm(Dvm dvm) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new DvmDAO(em).update(dvm);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified printer material.
	 *
	 * @param id the id of the specified printer material
	 */
	public void deleteDvm(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new DvmDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified printer material.
	 *
	 * @param id the id of the specified printer material
	 * @return the specified printer material
	 */
	public Dvm getDvm(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Dvm dvm = new DvmDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return dvm;
	}
	
	/**
	 * Gets all printer material.
	 *
	 * @return a list of all printer materials
	 */
	public List<Dvm> getAllDvm() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Dvm> dvmList = new DvmDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return dvmList;
	}

	/**
	 * Adds the given building.
	 *
	 * @param gebäude the given building
	 */
	public void addGebäude(Gebäude gebäude) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new GebäudeDAO(em).create(gebäude);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given building.
	 *
	 * @param gebäude the given building
	 */
	public void editGebäude(Gebäude gebäude) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new GebäudeDAO(em).update(gebäude);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified building.
	 *
	 * @param id the id of the specified building
	 */
	public void deleteGebäude(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new GebäudeDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified building.
	 *
	 * @param id the id of the specified building
	 * @return the specified building
	 */
	public Gebäude getGebäude(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Gebäude gebäude = new GebäudeDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return gebäude;
	}
	
	/**
	 * Gets all buildings.
	 *
	 * @return a list of all buildings
	 */
	public List<Gebäude> getAllGebäude() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Gebäude> gebäudeList = new GebäudeDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return gebäudeList;
	}
	
	/**
	 * Adds the given gpu.
	 *
	 * @param gpu the given gpu
	 */
	public void addGpu(Gpu gpu) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new GpuDAO(em).create(gpu);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given gpu.
	 *
	 * @param gpu the given gpu
	 */
	public void editGpu(Gpu gpu) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new GpuDAO(em).update(gpu);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified gpu.
	 *
	 * @param id the id of the specified gpu
	 */
	public void deleteGpu(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new GpuDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified gpu.
	 *
	 * @param id the id of the specified gpu
	 * @return the specified gpu
	 */
	public Gpu getGpu(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Gpu gpu = new GpuDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return gpu;
	}
	
	/**
	 * Gets all gpus.
	 *
	 * @return a list of all gpus
	 */
	public List<Gpu> getAllGpu() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Gpu> gpuList = new GpuDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return gpuList;
	}
	
	/**
	 * Adds the given manufacturer.
	 *
	 * @param hersteller the given manufacturer
	 */
	public void addHersteller(Hersteller hersteller) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new HerstellerDAO(em).create(hersteller);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given manufacturer.
	 *
	 * @param hersteller the given manufacturer
	 */
	public void editHersteller(Hersteller hersteller) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new HerstellerDAO(em).update(hersteller);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Deletes the specified manufacturer.
	 *
	 * @param id the id of the specified manufacturer
	 */
	public void deleteHersteller(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new HerstellerDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified manufacturer.
	 *
	 * @param id the id of the specified manufacturer
	 * @return the specified manufacturer
	 */
	public Hersteller getHersteller(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Hersteller hersteller = new HerstellerDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return hersteller;
	}
	
	/**
	 * Gets all manufacturers.
	 *
	 * @return a list of all manufacturers
	 */
	public List<Hersteller> getAllHersteller() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Hersteller> herstellerList = new HerstellerDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return herstellerList;
	}
	
	/**
	 * Gets all cpu manufacturers.
	 *
	 * @return a list of all cpu manufacturers
	 */
	public List<Hersteller> getAllCpuHersteller() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Hersteller> herstellerList = new HerstellerDAO(em).getAllCpuHersteller();
		em.getTransaction().commit();
		em.close();
		return herstellerList;
	}
	
	/**
	 * Gets all gpu manufacturers.
	 *
	 * @return a list of all gpu manufacturers
	 */
	public List<Hersteller> getAllGpuHersteller() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Hersteller> herstellerList = new HerstellerDAO(em).getAllGpuHersteller();
		em.getTransaction().commit();
		em.close();
		return herstellerList;
	}
	
	/**
	 * Gets all printer manufacturers.
	 *
	 * @return a list of all printer manufacturers
	 */
	public List<Hersteller> getAllDruckerHersteller() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Hersteller> herstellerList = new HerstellerDAO(em).getAllDruckerHersteller();
		em.getTransaction().commit();
		em.close();
		return herstellerList;
	}
	
	/**
	 * Gets all monitor manufacturers.
	 *
	 * @return a list of all monitor manufacturers
	 */
	public List<Hersteller> getAllMonitorHersteller() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Hersteller> herstellerList = new HerstellerDAO(em).getAllMonitorHersteller();
		em.getTransaction().commit();
		em.close();
		return herstellerList;
	}
	
	/**
	 * Gets all computer manufacturers.
	 *
	 * @return a list of all computer manufacturers
	 */
	public List<Hersteller> getAllRechnerHersteller() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Hersteller> herstellerList = new HerstellerDAO(em).getAllRechnerHersteller();
		em.getTransaction().commit();
		em.close();
		return herstellerList;
	}
	
	/**
	 * Gets all tablet manufacturers.
	 *
	 * @return a list of all tablet manufacturers
	 */
	public List<Hersteller> getAllTabletHersteller() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Hersteller> herstellerList = new HerstellerDAO(em).getAllTabletHersteller();
		em.getTransaction().commit();
		em.close();
		return herstellerList;
	}
	
	/**
	 * Adds the given supplier.
	 *
	 * @param lieferant the given supplier
	 */
	public void addLieferant(Lieferant lieferant) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new LieferantDAO(em).create(lieferant);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given supplier.
	 *
	 * @param lieferant the given supplier
	 */
	public void editLieferant(Lieferant lieferant) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new LieferantDAO(em).update(lieferant);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified supplier.
	 *
	 * @param id the id of the specified supplier
	 */
	public void deleteLieferant(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new LieferantDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified supplier.
	 *
	 * @param id the id of the specified supplier
	 * @return the specified supplier
	 */
	public Lieferant getLieferant(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Lieferant lieferant = new LieferantDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return lieferant;
	}
	
	/**
	 * Gets all supplier.
	 *
	 * @return a list of all supplier
	 */
	public List<Lieferant> getAllLieferant() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Lieferant> lieferantList = new LieferantDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return lieferantList;
	}
	
	/**
	 * Adds the given monitor.
	 *
	 * @param monitor the given monitor
	 */
	public void addMonitor(Monitor monitor) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new MonitorDAO(em).create(monitor);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given monitor.
	 *
	 * @param monitor the given monitor
	 */
	public void editMonitor(Monitor monitor) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new MonitorDAO(em).update(monitor);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified monitor.
	 *
	 * @param id the id of the specified monitor
	 */
	public void deleteMonitor(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new MonitorDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified monitor.
	 *
	 * @param id the id of the specified monitor
	 * @return the specified monitor
	 */
	public Monitor getMonitor(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Monitor monitor = new MonitorDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return monitor;
	}
	
	/**
	 * Gets all monitors.
	 *
	 * @return a list of all monitors
	 */
	public List<Monitor> getAllMonitor() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Monitor> monitorList = new MonitorDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return monitorList;
	}
	
	/**
	 * Adds the given computer.
	 *
	 * @param rechner the given computer
	 */
	public void addRechner(Rechner rechner) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new RechnerDAO(em).create(rechner);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given computer.
	 *
	 * @param rechner the given computer
	 */
	public void editRechner(Rechner rechner) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new RechnerDAO(em).update(rechner);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified computer.
	 *
	 * @param id the id of specified computer
	 */
	public void deleteRechner(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new RechnerDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified computer.
	 *
	 * @param id the id of the specified computer
	 * @return the specified computer
	 */
	public Rechner getRechner(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Rechner rechner = new RechnerDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return rechner;
	}
	
	/**
	 * Gets all computers.
	 *
	 * @return a list of all computers
	 */
	public List<Rechner> getAllRechner() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Rechner> rechnerList = new RechnerDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return rechnerList;
	}
	
	/**
	 * Adds the given invoice.
	 *
	 * @param rechnung the given invoice
	 */
	public void addRechnung(Rechnung rechnung) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new RechnungDAO(em).create(rechnung);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given invoice.
	 *
	 * @param rechnung the given invoice
	 */
	public void editRechnung(Rechnung rechnung) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new RechnungDAO(em).update(rechnung);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified invoice.
	 *
	 * @param id the id of the specified invoice
	 */
	public void deleteRechnung(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new RechnungDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified invoice.
	 *
	 * @param id the id of the specified invoice
	 * @return the specified invoice
	 */
	public Rechnung getRechnung(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Rechnung rechnung = new RechnungDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return rechnung;
	}
	
	/**
	 * Gets all invoices.
	 *
	 * @return a list of all invoices
	 */
	public List<Rechnung> getAllRechnung() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Rechnung> rechnungList = new RechnungDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return rechnungList;
	}
	
	/**
	 * Adds the given software.
	 *
	 * @param software the given software
	 */
	public void addSoftware(Software software) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new SoftwareDAO(em).create(software);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given software.
	 *
	 * @param software the given software
	 */
	public void editSoftware(Software software) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new SoftwareDAO(em).update(software);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Delete the specified software.
	 *
	 * @param id the id of the specified software
	 */
	public void deleteSoftware(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new SoftwareDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified software.
	 *
	 * @param id the id of the specified software
	 * @return the specified software
	 */
	public Software getSoftware(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Software software = new SoftwareDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return software;
	}
	
	/**
	 * Gets all software.
	 *
	 * @return a list of all software
	 */
	public List<Software> getAllSoftware() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Software> softwareList = new SoftwareDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return softwareList;
	}
	
	/**
	 * Adds the given tablet.
	 *
	 * @param tablet the given tablet
	 */
	public void addTablet(Tablet tablet) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new TabletDAO(em).create(tablet);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the specified tablet.
	 *
	 * @param tablet the specified tablet
	 */
	public void editTablet(Tablet tablet) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new TabletDAO(em).update(tablet);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Deletes the specified tablet.
	 *
	 * @param id the id of the specified tablet
	 */
	public void deleteTablet(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new TabletDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified tablet.
	 *
	 * @param id the id of the specified tablet
	 * @return the specified tablet
	 */
	public Tablet getTablet(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Tablet tablet = new TabletDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return tablet;
	}
	
	/**
	 * Gets all tablets.
	 *
	 * @return a list of all tablets
	 */
	public List<Tablet> getAllTablet() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Tablet> tablet = new TabletDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return tablet;
	}
	
	/**
	 * Adds the given todo.
	 *
	 * @param todo the given todo
	 */
	public void addTodo(Todo todo) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new TodoDAO(em).create(todo);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Edits the given todo.
	 *
	 * @param todo the given todo
	 */
	public void editTodo(Todo todo) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new TodoDAO(em).update(todo);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Deletes the specified todo.
	 *
	 * @param id the id of the specified todo
	 */
	public void deleteTodo(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		new TodoDAO(em).delete(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Gets the specified todo.
	 *
	 * @param id the id of the specified todo
	 * @return the the specified todo
	 */
	public Todo getTodo(long id) {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Todo todo = new TodoDAO(em).read(id);
		em.getTransaction().commit();
		em.close();
		return todo;
	}
	
	/**
	 * Gets all todos.
	 *
	 * @return a list of all todos
	 */
	public List<Todo> getAllTodo() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Todo> todo = new TodoDAO(em).read();
		em.getTransaction().commit();
		em.close();
		return todo;
	}

	/**
	 * Gets the last inventory number.
	 *
	 * @return the last inventory number
	 */
	public Inventarnummer getLastInventarnummer() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Inventarnummer nummer = new InventarnummerDAO(em).getLastInventarnummer();
		em.getTransaction().commit();
		em.close();
		return nummer;
	}
	

}
