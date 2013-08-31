/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Software represents the used software on computer.
 */
@Entity
@NamedQuery(name="Software.findAll", query="SELECT s FROM Software s")
@XmlRootElement
public class Software {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The supplier. */
	@OneToOne(fetch=FetchType.LAZY)
	private Lieferant lieferant;
	
	/** The invoice. */
	@OneToOne(fetch=FetchType.LAZY)
	private Rechnung rechnung;
	
	/** The maximum licences . */
	private int maxLizenzen;
	
	/** The number of used licences. */
	private int anzahlLizenzen;
	
	/** The description. */
	private String bezeichnung;
	
	/**
	 * Class constructor.
	 */
	public Software() {
		
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
	 * Gets the number of maximum licenses.
	 *
	 * @return the max lizenzen
	 */
	public int getMaxLizenzen() {
		return maxLizenzen;
	}
	
	/**
	 * Sets number of maximum licenses.
	 *
	 * @param maxLizenzen the new number of maximum licenses
	 */
	public void setMaxLizenzen(int maxLizenzen) {
		this.maxLizenzen = maxLizenzen;
	}
	
	/**
	 * Gets the number of used licenses.
	 *
	 * @return the number of used licenses
	 */
	public int getAnzahlLizenzen() {
		return anzahlLizenzen;
	}
	
	/**
	 * Sets the number of used licenses.
	 *
	 * @param anzahlLizenzen the new number of used licenses
	 */
	public void setAnzahlLizenzen(int anzahlLizenzen) {
		this.anzahlLizenzen = anzahlLizenzen;
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
