/*
 * @author: Tobias Gehring
 * @version 1.0, 01.08.2013
 */
package de.tgehring.itdb.server.history.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Cpu represents a cpu of a computer.
 */
@Entity
@NamedQuery(name="Cpu.findAll", query="SELECT c FROM Cpu c")
@XmlRootElement
public class Cpu extends HistoryEntity {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The manufacturer of the cpu. */
	@OneToOne(fetch=FetchType.LAZY)
	private Hersteller hersteller;

	/** The supplier of the cpu. */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Lieferant lieferant;
	
	/** The invoice of the cpu. */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Rechnung rechnung;
	
	/** The socket of the cpu. */
	private String sockel;
	
	/** The clocking of the cpu. */
	private String taktung;
	
	/** The description of the cpu. */
	private String bezeichnung;
	
	/**
	 * Class constructor.
	 */
	public Cpu() {
		
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Gets the manufacturer.
	 *
	 * @return the manufacturer
	 */
	public Hersteller getHersteller() {
		return hersteller;
	}
	
	/**
	 * Sets the manufacturer.
	 *
	 * @param hersteller the new manufacturer
	 */
	public void setHersteller(Hersteller hersteller) {
		this.hersteller = hersteller;
	}
	
	/**
	 * Gets the supplier.
	 *
	 * @return the supplier
	 */
	public Lieferant getLieferant() {
		return lieferant;
	}
	
	/**
	 * Sets the supplier.
	 *
	 * @param lieferant the new supplier
	 */
	public void setLieferant(Lieferant lieferant) {
		this.lieferant = lieferant;
	}
	
	/**
	 * Gets the invoice.
	 *
	 * @return the invoice
	 */
	public Rechnung getRechnung() {
		return rechnung;
	}
	
	/**
	 * Sets the invoice.
	 *
	 * @param rechnung the new invoice
	 */
	public void setRechnung(Rechnung rechnung) {
		this.rechnung = rechnung;
	}
	
	/**
	 * Gets the socket.
	 *
	 * @return the socket
	 */
	public String getSockel() {
		return sockel;
	}
	
	/**
	 * Sets the socket.
	 *
	 * @param sockel the new socket
	 */
	public void setSockel(String sockel) {
		this.sockel = sockel;
	}
	
	/**
	 * Gets the clocking.
	 *
	 * @return the clocking
	 */
	public String getTaktung() {
		return taktung;
	}
	
	/**
	 * Sets the clocking.
	 *
	 * @param taktung the new clocking
	 */
	public void setTaktung(String taktung) {
		this.taktung = taktung;
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param bezeichnung the new description
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
}
