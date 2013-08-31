/*
 * @author: Tobias Gehring
 * @version 1.0, 01.08.2013
 */
package de.tgehring.itdb.server.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Benutzer represents a user.
 */
@Entity
@NamedQuery(name="Benutzer.findAll", query="SELECT b FROM Benutzer b")
@XmlRootElement
public class Benutzer {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The firstname of the user. */
	private String vorname;
	/** The lastname of the user. */
	private String nachname;
	/** The usename of the user. */
	@Column(unique = true)
	private String benutzername;
	/** The password of the user. */
	private String passwort;
	/** Determines if the user is an admin. */
	private boolean admin;
	
	/**
	 * Class constructor..
	 */
	public Benutzer() {
		
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
	 * Gets the firstname.
	 *
	 * @return the firstname
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * Sets the firstname.
	 *
	 * @param vorname the new firstname
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * Gets the lastname.
	 *
	 * @return the lastname
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * Sets the lastname.
	 *
	 * @param nachname the new lastname
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * Gets the benutzername.
	 *
	 * @return the benutzername
	 */
	public String getBenutzername() {
		return benutzername;
	}

	/**
	 * Sets the benutzername.
	 *
	 * @param benutzername the new benutzername
	 */
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPasswort() {
		return passwort;
	}

	/**
	 * Sets the password.
	 *
	 * @param passwort the new password
	 */
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	/**
	 * Checks if is admin.
	 *
	 * @return true, if is admin
	 */
	public boolean isAdmin() {
		return admin;
	}

	/**
	 * Sets the admin.
	 *
	 * @param admin the new admin
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}
