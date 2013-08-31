/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.servlet;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;

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
import de.tgehring.itdb.server.service.CRUDService;

/**
 * The Class CRUDServlet provides CRUD operations on the database.
 */
@Path("/crud")
public class CRUDServlet {
	
	/**
	 * Adds the given department.
	 *
	 * @param abteilung the given department
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/abteilung")
	public Response addAbteilung(JAXBElement<Abteilung> abteilung) {
		CRUDService.getInstance().addAbteilung(abteilung.getValue());
		String result = "Abteilung saved : " + abteilung.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given department.
	 *
	 * @param abteilung the given department
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/abteilung")
	public Response editAbteilung(JAXBElement<Abteilung> abteilung) {
		CRUDService.getInstance().editAbteilung(abteilung.getValue());
		String result = "Abteilung edited : " + abteilung.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Delete the specified department.
	 *
	 * @param id the id of the specified department
	 * @return the response
	 */
	@DELETE
	@Path("/abteilung/{id}")
	public Response deleteAbteilung(@PathParam("id") long id) {
		CRUDService.getInstance().deleteAbteilung(id);
		String result = "Abteilung deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified department.
	 *
	 * @param id the id of the specified department
	 * @return the specified department
	 */
	@GET
	@Produces("application/json")
	@Path("/abteilung/{id}")
	public Abteilung getAbteilung(@PathParam("id") long id) {
		return CRUDService.getInstance().getAbteilung(id);
	}
	
	/**
	 * Gets all departments.
	 *
	 * @return a list of all departments
	 */
	@GET
	@Produces("application/json")
	@Path("/abteilung")
	public List<Abteilung> getAllAbteilung() {
		return CRUDService.getInstance().getAllAbteilung();
	}
	
	/**
	 * Adds the given user.
	 *
	 * @param benutzer the given user
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/benutzer")
	public Response addBenutzer(JAXBElement<Benutzer> benutzer) {
		CRUDService.getInstance().addBenutzer(benutzer.getValue());
		String result = "Benutzer saved : " + benutzer.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given user.
	 *
	 * @param benutzer the given user
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/benutzer")
	public Response editBenutzer(JAXBElement<Benutzer> benutzer) {
		CRUDService.getInstance().editBenutzer(benutzer.getValue());
		String result = "Benutzer edited : " + benutzer.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Delete the specified user.
	 *
	 * @param id the id of the specified user
	 * @return the response
	 */
	@DELETE
	@Path("/benutzer/{id}")
	public Response deleteBenutzer(@PathParam("id") long id) {
		CRUDService.getInstance().deleteBenutzer(id);
		String result = "Benutzer deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified user.
	 *
	 * @param id the id of the specified user
	 * @return the specified user
	 */
	@GET
	@Produces("application/json")
	@Path("/benutzer/{id}")
	public Benutzer getBenutzer(@PathParam("id") long id) {
		return CRUDService.getInstance().getBenutzer(id);
	}
	
	/**
	 * Gets all users.
	 *
	 * @return a list of all users
	 */
	@GET
	@Produces("application/json")
	@Path("/benutzer")
	public List<Benutzer> getAllBenutzer() {
		return CRUDService.getInstance().getAllBenutzer();
	}
	
	/**
	 * Adds the given cpu.
	 *
	 * @param cpu the given cpu
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cpu")
	public Response addCpu(JAXBElement<Cpu> cpu) {
		CRUDService.getInstance().addCpu(cpu.getValue());
		String result = "Cpu saved : " + cpu.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given cpu.
	 *
	 * @param cpu the given cpu
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cpu")
	public Response editCpu(JAXBElement<Cpu> cpu) {
		CRUDService.getInstance().editCpu(cpu.getValue());
		String result = "Cpu edited : " + cpu.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Delete the specified cpu.
	 *
	 * @param id the id of the specified cpu
	 * @return the response
	 */
	@DELETE
	@Path("/cpu/{id}")
	public Response deleteCpu(@PathParam("id") long id) {
		CRUDService.getInstance().deleteAbteilung(id);
		String result = "Abteilung deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified cpu.
	 *
	 * @param id the id of the specified cpu
	 * @return the specified cpu
	 */
	@GET
	@Produces("application/json")
	@Path("/cpu/{id}")
	public Cpu getCpu(@PathParam("id") long id) {
		return CRUDService.getInstance().getCpu(id);
	}
	
	/**
	 * Gets all cpus.
	 *
	 * @return a list of all cpus
	 */
	@GET
	@Produces("application/json")
	@Path("/cpu")
	public List<Cpu> getAllCpu() {
		return CRUDService.getInstance().getAllCpu();
	}
	
	/**
	 * Adds the given printer.
	 *
	 * @param drucker the given printer
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/drucker")
	public Response addDrucker(JAXBElement<Drucker> drucker) {
		CRUDService.getInstance().addDrucker(drucker.getValue());
		String result = "Drucker saved : " + drucker.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given printer.
	 *
	 * @param drucker the given printer
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/drucker")
	public Response editDrucker(JAXBElement<Drucker> drucker) {
		CRUDService.getInstance().editDrucker(drucker.getValue());
		String result = "Drucker edited : " + drucker.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Delete the specified printer.
	 *
	 * @param id the id of the specified printer
	 * @return the response
	 */
	@DELETE
	@Path("/drucker/{id}")
	public Response deleteDrucker(@PathParam("id") long id) {
		CRUDService.getInstance().deleteDrucker(id);
		String result = "Drucker deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified printer.
	 *
	 * @param id the id of the specified printer
	 * @return the drucker
	 */
	@GET
	@Produces("application/json")
	@Path("/drucker/{id}")
	public Drucker getDrucker(@PathParam("id") long id) {
		return CRUDService.getInstance().getDrucker(id);
	}
	
	/**
	 * Gets all printers.
	 *
	 * @return a list of all printers
	 */
	@GET
	@Produces("application/json")
	@Path("/drucker")
	public List<Drucker> getAllDrucker() {
		return CRUDService.getInstance().getAllDrucker();
	}
	
	/**
	 * Adds the given printer material.
	 *
	 * @param dvm the given printer material
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/dvm")
	public Response addDvm(JAXBElement<Dvm> dvm) {
		CRUDService.getInstance().addDvm(dvm.getValue());
		String result = "Dvm saved : " + dvm.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits given printer material.
	 *
	 * @param dvm the given printer material
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/dvm")
	public Response editDvm(JAXBElement<Dvm> dvm) {
		CRUDService.getInstance().editDvm(dvm.getValue());
		String result = "Abteilung edited : " + dvm.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified printer material.
	 *
	 * @param id the id of the specified printer material
	 * @return the response
	 */
	@DELETE
	@Path("/dvm/{id}")
	public Response deleteDvm(@PathParam("id") long id) {
		CRUDService.getInstance().deleteDvm(id);
		String result = "Dvm deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified printer material.
	 *
	 * @param id the id of the specified printer material
	 * @return the printer material
	 */
	@GET
	@Produces("application/json")
	@Path("/dvm/{id}")
	public Dvm getDvm(@PathParam("id") long id) {
		return CRUDService.getInstance().getDvm(id);
	}
	
	/**
	 * Gets all printer materials.
	 *
	 * @return a list of all printer materials
	 */
	@GET
	@Produces("application/json")
	@Path("/dvm")
	public List<Dvm> getAllDvm() {
		return CRUDService.getInstance().getAllDvm();
	}

	/**
	 * Adds the given building.
	 *
	 * @param gebäude the given building
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/gebaeude")
	public Response addGebäude(JAXBElement<Gebäude> gebäude) {
		CRUDService.getInstance().addGebäude(gebäude.getValue());
		String result = "Gebäude saved : " + gebäude.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given building.
	 *
	 * @param gebäude the given building
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/gebaeude")
	public Response editGebäude(JAXBElement<Gebäude> gebäude) {
		CRUDService.getInstance().editGebäude(gebäude.getValue());
		String result = "Gebäude edited : " + gebäude.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified building.
	 *
	 * @param id the id of the specified building
	 * @return the response
	 */
	@DELETE
	@Path("/gebaeude/{id}")
	public Response deleteGebäude(@PathParam("id") long id) {
		CRUDService.getInstance().deleteGebäude(id);
		String result = "Gebäude deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified building.
	 *
	 * @param id the id of the specified building
	 * @return the requested building
	 */
	@GET
	@Produces("application/json")
	@Path("/gebaeude/{id}")
	public Gebäude getGebäude(@PathParam("id") long id) {
		return CRUDService.getInstance().getGebäude(id);
	}
	
	/**
	 * Gets all buildings.
	 *
	 * @return a list of all buildings
	 */
	@GET
	@Produces("application/json")
	@Path("/gebaeude")
	public List<Gebäude> getAllGebäude() {
		return CRUDService.getInstance().getAllGebäude();
	}
	
	/**
	 * Adds the given gpu.
	 *
	 * @param gpu the given gpu
	 * @return the response
	 */
	@POST
	@Produces("application/json")
	@Path("/gpu")
	public Response addGpu(JAXBElement<Gpu> gpu) {
		CRUDService.getInstance().addGpu(gpu.getValue());
		String result = "Gpu saved : " + gpu.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given gpu.
	 *
	 * @param gpu the given gpu
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/gpu")
	public Response editGpu(JAXBElement<Gpu> gpu) {
		CRUDService.getInstance().editGpu(gpu.getValue());
		String result = "Gpu edited : " + gpu.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified gpu.
	 *
	 * @param id the id of the specified gpu
	 * @return the response
	 */
	@DELETE
	@Path("/gpu/{id}")
	public Response deleteGpu(@PathParam("id") long id) {
		CRUDService.getInstance().deleteGpu(id);
		String result = "Abteilung deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified gpu.
	 *
	 * @param id the id of the specified gpu
	 * @return the specified gpu
	 */
	@GET
	@Produces("application/json")
	@Path("/gpu/{id}")
	public Gpu getGpu(@PathParam("id") long id) {
		return CRUDService.getInstance().getGpu(id);
	}
	
	/**
	 * Gets all gpus.
	 *
	 * @return a list of all gpus
	 */
	@GET
	@Produces("application/json")
	@Path("/gpu")
	public List<Gpu> getAllGpu() {
		return CRUDService.getInstance().getAllGpu();
	}
	
	/**
	 * Adds the given manufacturer.
	 *
	 * @param hersteller the given manufacturer
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/hersteller")
	public Response addHersteller(JAXBElement<Hersteller> hersteller) {
		CRUDService.getInstance().addHersteller(hersteller.getValue());
		String result = "Hersteller saved : " + hersteller.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given manufacturer.
	 *
	 * @param hersteller the given manufacturer
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/hersteller")
	public Response editHersteller(JAXBElement<Hersteller> hersteller) {
		CRUDService.getInstance().editHersteller(hersteller.getValue());
		String result = "Hersteller edited : " + hersteller.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified manufacturer.
	 *
	 * @param id the id of the specified manufacturer
	 * @return the response
	 */
	@DELETE
	@Path("/hersteller/{id}")
	public Response deleteHersteller(@PathParam("id") long id) {
		CRUDService.getInstance().deleteHersteller(id);
		String result = "Hersteller deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified manufacturer.
	 *
	 * @param id the id of the specified manufacturer
	 * @return the specified manufacturer
	 */
	@GET
	@Produces("application/json")
	@Path("/hersteller/{id}")
	public Hersteller getHersteller(@PathParam("id") long id) {
		return CRUDService.getInstance().getHersteller(id);
	}
	
	/**
	 * Gets all manufacturer.
	 *
	 * @return a list of all manufacturer
	 */
	@GET
	@Produces("application/json")
	@Path("/hersteller")
	public List<Hersteller> getAllHersteller() {
		return CRUDService.getInstance().getAllHersteller();
	}
	
	/**
	 * Gets all cpu manufacturer.
	 *
	 * @return a list of all cpu manufacturer
	 */
	@GET
	@Produces("application/json")
	@Path("/hersteller/cpu")
	public List<Hersteller> getAllCpuHersteller() {
		return CRUDService.getInstance().getAllCpuHersteller();
	}
	
	/**
	 * Gets all printer manufacturer.
	 *
	 * @return a list of all printer manufacturer
	 */
	@GET
	@Produces("application/json")
	@Path("/hersteller/drucker")
	public List<Hersteller> getAllDruckerHersteller() {
		return CRUDService.getInstance().getAllDruckerHersteller();
	}
	
	/**
	 * Gets all gpu manufacturer.
	 *
	 * @return a list of all gpu manufacturer
	 */
	@GET
	@Produces("application/json")
	@Path("/hersteller/gpu")
	public List<Hersteller> getAllGpuHersteller() {
		return CRUDService.getInstance().getAllGpuHersteller();
	}
	
	/**
	 * Gets all monitor manufacturer.
	 *
	 * @return a list of all monitor manufacturer
	 */
	@GET
	@Produces("application/json")
	@Path("/hersteller/monitor")
	public List<Hersteller> getAllMonitorHersteller() {
		return CRUDService.getInstance().getAllMonitorHersteller();
	}
	
	/**
	 * Gets all computer manufacturer.
	 *
	 * @return a list of all computer manufacturer
	 */
	@GET
	@Produces("application/json")
	@Path("/hersteller/rechner")
	public List<Hersteller> getAllRechnerHersteller() {
		return CRUDService.getInstance().getAllRechnerHersteller();
	}
	
	/**
	 * Gets all tablet manufacturer.
	 *
	 * @return a list of all tablet manufacturer
	 */
	@GET
	@Produces("application/json")
	@Path("/hersteller/tablet")
	public List<Hersteller> getAllTabletHersteller() {
		return CRUDService.getInstance().getAllTabletHersteller();
	}
	
	/**
	 * Adds the given supplier.
	 *
	 * @param lieferant the given supplier
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/lieferant")
	public Response addLieferant(JAXBElement<Lieferant> lieferant) {
		CRUDService.getInstance().addLieferant(lieferant.getValue());
		String result = "Lieferant saved : " + lieferant.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given supplier.
	 *
	 * @param lieferant the given supplier
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/lieferant")
	public Response editLieferant(JAXBElement<Lieferant> lieferant) {
		CRUDService.getInstance().editLieferant(lieferant.getValue());
		String result = "Lieferant edited : " + lieferant.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Delete the specified supplier.
	 *
	 * @param id the id
	 * @return the response
	 */
	@DELETE
	@Path("/lieferant/{id}")
	public Response deleteLieferant(@PathParam("id") long id) {
		CRUDService.getInstance().deleteLieferant(id);
		String result = "Lieferant deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified supplier.
	 *
	 * @param id the id of the specified supplier
	 * @return the specified supplier
	 */
	@GET
	@Produces("application/json")
	@Path("/lieferant/{id}")
	public Lieferant getLieferant(@PathParam("id") long id) {
		return CRUDService.getInstance().getLieferant(id);
	}
	
	/**
	 * Gets all supplier.
	 *
	 * @return a list of all supplier
	 */
	@GET
	@Produces("application/json")
	@Path("/lieferant")
	public List<Lieferant> getAllLieferant() {
		return CRUDService.getInstance().getAllLieferant();
	}
	
	/**
	 * Adds the given monitor.
	 *
	 * @param monitor the given monitor
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/monitor")
	public Response addMonitor(JAXBElement<Monitor> monitor) {
		CRUDService.getInstance().addMonitor(monitor.getValue());
		String result = "Monitor saved : " + monitor.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given monitor.
	 *
	 * @param monitor the given monitor
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/monitor")
	public Response editMonitor(JAXBElement<Monitor> monitor) {
		CRUDService.getInstance().editMonitor(monitor.getValue());
		String result = "Monitor edited : " + monitor.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified monitor.
	 *
	 * @param id the id of the specified monitor
	 * @return the response
	 */
	@DELETE
	@Path("/monitor/{id}")
	public Response deleteMonitor(@PathParam("id") long id) {
		CRUDService.getInstance().deleteMonitor(id);
		String result = "Monitor deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified monitor.
	 *
	 * @param id the id of the specified monitor
	 * @return the monitor
	 */
	@GET
	@Produces("application/json")
	@Path("/monitor/{id}")
	public Monitor getMonitor(@PathParam("id") long id) {
		return CRUDService.getInstance().getMonitor(id);
	}
	
	/**
	 * Gets all monitors.
	 *
	 * @return a list of all monitors
	 */
	@GET
	@Produces("application/json")
	@Path("/monitor")
	public List<Monitor> getAllMonitor() {
		return CRUDService.getInstance().getAllMonitor();
	}
	
	/**
	 * Adds the given computer.
	 *
	 * @param rechner the rechner of the given computer
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/rechner")
	public Response addRechner(JAXBElement<Rechner> rechner) {
		CRUDService.getInstance().addRechner(rechner.getValue());
		String result = "Rechner saved : " + rechner.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given computer.
	 *
	 * @param rechner the given computer
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/rechner")
	public Response editRechner(JAXBElement<Rechner> rechner) {
		CRUDService.getInstance().editRechner(rechner.getValue());
		String result = "Rechner edited : " + rechner.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified computer.
	 *
	 * @param id the id of the specified computer
	 * @return the response
	 */
	@DELETE
	@Path("/rechner/{id}")
	public Response deleteRechner(@PathParam("id") long id) {
		CRUDService.getInstance().deleteRechner(id);
		String result = "Rechner deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified computer.
	 *
	 * @param id the id of the specified computer
	 * @return the computer
	 */
	@GET
	@Produces("application/json")
	@Path("/rechner/{id}")
	public Rechner getRechner(@PathParam("id") long id) {
		return CRUDService.getInstance().getRechner(id);
	}
	
	/**
	 * Gets the specified computer by its inventory number.
	 *
	 * @param iNummer the inventory number
	 * @return the computer
	 */
	@GET
	@Produces("application/json")
	@Path("/rechner/i/{iNummer}")
	public Rechner getRechner(@PathParam("iNummer") String iNummer) {
		List<Rechner> list = CRUDService.getInstance().getAllRechner();
		for(Rechner rechner: list) {
			if(rechner.getInventarnummer().equals(iNummer)) {
				return rechner;
			}
		}
		return null;
	}
	
	/**
	 * Gets all computers.
	 *
	 * @return a list of all computers
	 */
	@GET
	@Produces("application/json")
	@Path("/rechner")
	public List<Rechner> getAllRechner() {
		return CRUDService.getInstance().getAllRechner();
	}
	
	/**
	 * Adds the given invoice.
	 *
	 * @param rechnung the given invoice
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/rechnung")
	public Response addRechnung(JAXBElement<Rechnung> rechnung) {
		CRUDService.getInstance().addRechnung(rechnung.getValue());
		String result = "Rechnung saved : " + rechnung.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given invoice.
	 *
	 * @param rechnung the given invoice
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/rechnung")
	public Response editRechnung(JAXBElement<Rechnung> rechnung) {
		CRUDService.getInstance().editRechnung(rechnung.getValue());
		String result = "Rechnung edited : " + rechnung.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified invoice.
	 *
	 * @param id the id of the specified invoice
	 * @return the response
	 */
	@DELETE
	@Path("/rechnung/{id}")
	public Response deleteRechnung(@PathParam("id") long id) {
		CRUDService.getInstance().deleteRechnung(id);
		String result = "Rechnung deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified invoice.
	 *
	 * @param id the id
	 * @return the specified invoice
	 */
	@GET
	@Produces("application/json")
	@Path("/rechnung/{id}")
	public Rechnung getRechnung(@PathParam("id") long id) {
		return CRUDService.getInstance().getRechnung(id);
	}
	
	/**
	 * Gets all invoices.
	 *
	 * @return a list of all invoices
	 */
	@GET
	@Produces("application/json")
	@Path("/rechnung")
	public List<Rechnung> getAllRechnung() {
		return CRUDService.getInstance().getAllRechnung();
	}
	
	/**
	 * Adds the given software.
	 *
	 * @param software the given software
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/software")
	public Response addSoftware(JAXBElement<Software> software) {
		CRUDService.getInstance().addSoftware(software.getValue());
		String result = "Software saved : " + software.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given software.
	 *
	 * @param software the given software
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/software")
	public Response editSoftware(JAXBElement<Software> software) {
		CRUDService.getInstance().editSoftware(software.getValue());
		String result = "Software edited : " + software.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified software.
	 *
	 * @param id the id of the specified software
	 * @return the response
	 */
	@DELETE
	@Path("/software/{id}")
	public Response deleteSoftware(@PathParam("id") long id) {
		CRUDService.getInstance().deleteSoftware(id);
		String result = "Software deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified software.
	 *
	 * @param id the id of the specified software
	 * @return the software
	 */
	@GET
	@Produces("application/json")
	@Path("/software/{id}")
	public Software getSoftware(@PathParam("id") long id) {
		return CRUDService.getInstance().getSoftware(id);
	}
	
	/**
	 * Gets all software.
	 *
	 * @return a list of all software
	 */
	@GET
	@Produces("application/json")
	@Path("/software")
	public List<Software> getAllSoftware() {
		return CRUDService.getInstance().getAllSoftware();
	}
	
	/**
	 * Adds the given tablet.
	 *
	 * @param tablet the given tablet
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/tablet")
	public Response addTablet(JAXBElement<Tablet> tablet) {
		CRUDService.getInstance().addTablet(tablet.getValue());
		String result = "Tablet saved : " + tablet.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given tablet.
	 *
	 * @param tablet the given tablet
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/tablet")
	public Response editTablet(JAXBElement<Tablet> tablet) {
		CRUDService.getInstance().editTablet(tablet.getValue());
		String result = "Tablet edited : " + tablet.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified tablet.
	 *
	 * @param id the id of the specified tablet
	 * @return the response
	 */
	@DELETE
	@Path("/tablet/{id}")
	public Response deleteTablet(@PathParam("id") long id) {
		CRUDService.getInstance().deleteTablet(id);
		String result = "Tablet deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified tablet.
	 *
	 * @param id the id of the specified tablet
	 * @return the tablet
	 */
	@GET
	@Produces("application/json")
	@Path("/tablet/{id}")
	public Tablet getTablet(@PathParam("id") long id) {
		return CRUDService.getInstance().getTablet(id);
	}
	
	/**
	 * Gets all tablets.
	 *
	 * @return a list of all tablets
	 */
	@GET
	@Produces("application/json")
	@Path("/tablet")
	public List<Tablet> getAllTablet() {
		return CRUDService.getInstance().getAllTablet();
	}
	
	/**
	 * Adds the given todo.
	 *
	 * @param todo the given todo
	 * @return the response
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/todo")
	public Response addTodo(JAXBElement<Todo> todo) {
		CRUDService.getInstance().addTodo(todo.getValue());
		String result = "Todo saved : " + todo.getValue();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Edits the given todo.
	 *
	 * @param todo the given todo
	 * @return the response
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/todo")
	public Response editTodo(JAXBElement<Todo> todo) {
		CRUDService.getInstance().editTodo(todo.getValue());
		String result = "Todo edited : " + todo.getValue().toString();
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Deletes the specified todo.
	 *
	 * @param id the id of the specified todo
	 * @return the response
	 */
	@DELETE
	@Path("/todo/{id}")
	public Response deleteTodo(@PathParam("id") long id) {
		CRUDService.getInstance().deleteTodo(id);
		String result = "Todo deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Gets the specified todo.
	 *
	 * @param id the id of the specified todo
	 * @return the todo
	 */
	@GET
	@Produces("application/json")
	@Path("/todo/{id}")
	public Todo getTodo(@PathParam("id") long id) {
		return CRUDService.getInstance().getTodo(id);
	}
	
	/**
	 * Gets all todos.
	 *
	 * @return a list of all todo
	 */
	@GET
	@Produces("application/json")
	@Path("/todo")
	public List<Todo> getAllTodo() {
		return CRUDService.getInstance().getAllTodo();
	}
	
	/**
	 * Gets the last assigned inventory number.
	 *
	 * @return the last assigned inventory number
	 */
	@GET
	@Produces("application/json")
	@Path("/iNummer")
	public Inventarnummer getLastInventarnummer() {
		return CRUDService.getInstance().getLastInventarnummer();
	}
	
}
