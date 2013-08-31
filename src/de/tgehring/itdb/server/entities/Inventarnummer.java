/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Inventarnummer represtens the inventory number.
 */
@Entity
@NamedQueries(value = { 
@NamedQuery(name="Inventarnummer.findAll", query="SELECT i FROM Inventarnummer i"),
@NamedQuery(name="Inventarnummer.last", query="SELECT i FROM Inventarnummer i WHERE i.id" +
		" = (SELECT MAX(i.id) FROM Inventarnummer i)")
})
@XmlRootElement
public class Inventarnummer {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The inventory number. */
	@Column(unique=true, nullable=false)
	private String nummer;
	
	/**
	 * Class constructor
	 */
	public Inventarnummer() {
		
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
	 * Gets the inventory number.
	 *
	 * @return the inventory number
	 */
	public String getNummer() {
		return nummer;
	}

	/**
	 * Sets the inventory number.
	 *
	 * @param nummer the new inventory number
	 */
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nummer;
	}
	
}
