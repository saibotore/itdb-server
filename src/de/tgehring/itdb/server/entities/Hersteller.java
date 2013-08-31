/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Hersteller represents the manufacturer.
 */
@Entity
@NamedQuery(name="Hersteller.findAll", query="SELECT h FROM Hersteller h")
@XmlRootElement
public class Hersteller {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The description. */
	private String bezeichnung;
	
	/** The manufacturer type. */
	@Enumerated(EnumType.STRING)
	private HerstellerTyp typ;
	
	/**
	 * Class constructor.
	 */
	public Hersteller() {
		
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
	 * Gets the manufacturer type.
	 *
	 * @return the manufacturer type
	 */
	public HerstellerTyp getTyp() {
		return typ;
	}
	
	/**
	 * Sets the manufacturer type.
	 *
	 * @param typ the new manufacturer type
	 */
	public void setTyp(HerstellerTyp typ) {
		this.typ = typ;
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
