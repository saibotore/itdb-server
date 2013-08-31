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
 * The Class Drucker represents a printer.
 */
@Entity
@NamedQuery(name="Drucker.findAll", query="SELECT d FROM Drucker d")
@XmlRootElement
public class Drucker {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The manufacturer of the printer. */
	@OneToOne(fetch=FetchType.LAZY)
	private Hersteller hersteller;

	/** The supplier of the printer. */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Lieferant lieferant;
	
	/** The invoice of the printer. */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Rechnung rechnung;
	
	/** The material. */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Dvm material;

	/** The inventory number of the printer. */
	@Column(unique=true)
	private String inventarnummer;
	
	/** The device number of the printer. */
	private String gerätenummer;
	
	/** The description of the printer. */
	private String bezeichnung;
	
	/**
	 * Class constructor.
	 */
	public Drucker() {
		
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
	 * Gets the material.
	 *
	 * @return the material
	 */
	public Dvm getMaterial() {
		return material;
	}
	
	/**
	 * Sets the material.
	 *
	 * @param material the new material
	 */
	public void setMaterial(Dvm material) {
		this.material = material;
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
	 * Gets the gerätenummer.
	 *
	 * @return the gerätenummer
	 */
	public String getGerätenummer() {
		return gerätenummer;
	}
	
	/**
	 * Sets the gerätenummer.
	 *
	 * @param gerätenummer the new gerätenummer
	 */
	public void setGerätenummer(String gerätenummer) {
		this.gerätenummer = gerätenummer;
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