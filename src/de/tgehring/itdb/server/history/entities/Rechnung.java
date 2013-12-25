/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.history.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Rechnung represents an invoice.
 */
@Entity
@NamedQuery(name="Rechnung.findAll", query="SELECT r FROM Rechnung r")
@XmlRootElement
public class Rechnung extends HistoryEntity {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The invoice number. */
	@Column(unique = true)
	private String rechnungsnummer;
	
	/** The invoice amount. */
	private double rechnungsbetrag;
	
	/** The invoice date. */
	private String rechnungsdatum;
	
	/**
	 * Class constructor.
	 */
	public Rechnung() {
		
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
	 * Gets the invoice number.
	 *
	 * @return the invoice number
	 */
	public String getRechnungsnummer() {
		return rechnungsnummer;
	}

	/**
	 * Sets the invoice number.
	 *
	 * @param rechnungsnummer the new invoice number
	 */
	public void setRechnungsnummer(String rechnungsnummer) {
		this.rechnungsnummer = rechnungsnummer;
	}

	/**
	 * Gets the invoice amount.
	 *
	 * @return the invoice amount
	 */
	public double getRechnungsbetrag() {
		return rechnungsbetrag;
	}

	/**
	 * Sets the invoice amount.
	 *
	 * @param rechnungsbetrag the new invoice amount
	 */
	public void setRechnungsbetrag(double rechnungsbetrag) {
		this.rechnungsbetrag = rechnungsbetrag;
	}

	/**
	 * Gets the invoice date.
	 *
	 * @return the invoice date
	 */
	public String getRechnungsdatum() {
		return this.rechnungsdatum;
	}

	/**
	 * Sets the invoice date.
	 *
	 * @param rechnungsdatum the new invoice date
	 */
	public void setRechnungsdatum(String rechnungsdatum) {
		this.rechnungsdatum = rechnungsdatum;
	}
	
	

}
