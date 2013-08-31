/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities;

import javax.persistence.Column;
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
 * The Class Monitor represents the monitor of a computer.
 */
@Entity
@NamedQuery(name="Monitor.findAll", query="SELECT m FROM Monitor m")
@XmlRootElement
public class Monitor {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The manufacturer of the monitor. */
	@OneToOne(fetch=FetchType.LAZY)
	private Hersteller hersteller;

	/** The supplier of the monitor. */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Lieferant lieferant;
	
	/** The invoice of the monitor. */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Rechnung rechnung;

	/** The inventory number of the monitor. */
	@Column(unique=true)
	private String inventarnummer;
	
	/** The device number of the monitor. */
	private String gerätenummer;
	
	/** The inch of the monitor. */
	private int zoll;
	
	/** Determines whether the monitor is touchable or not  */
	private boolean touch;
	
	/** The description. */
	private String bezeichnung;
	
	/**
	 * Class constructor.
	 */
	public Monitor() {
		
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
	 * Gets the inventory number.
	 *
	 * @return the inventory number
	 */
	public String getInventarnummer() {
		return inventarnummer;
	}
	
	/**
	 * Sets the inventory number.
	 *
	 * @param inventarnummer the new inventory number
	 */
	public void setInventarnummer(String inventarnummer) {
		this.inventarnummer = inventarnummer;
	}
	
	/**
	 * Gets the device number.
	 *
	 * @return the device number
	 */
	public String getGerätenummer() {
		return gerätenummer;
	}
	
	/**
	 * Sets the device number.
	 *
	 * @param gerätenummer the new device number
	 */
	public void setGerätenummer(String gerätenummer) {
		this.gerätenummer = gerätenummer;
	}
	
	/**
	 * Gets the inch.
	 *
	 * @return the inch
	 */
	public int getZoll() {
		return zoll;
	}
	
	/**
	 * Sets the inch.
	 *
	 * @param zoll the new inch
	 */
	public void setZoll(int zoll) {
		this.zoll = zoll;
	}
	
	/**
	 * Checks if the monitor is touchable.
	 *
	 * @return true, if is touchable
	 */
	public boolean isTouch() {
		return touch;
	}
	
	/**
	 * Sets the touch.
	 *
	 * @param touch the new touch
	 */
	public void setTouch(boolean touch) {
		this.touch = touch;
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
