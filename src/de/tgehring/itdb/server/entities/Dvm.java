/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Dvm represents the material of a printer.
 */
@Entity
@NamedQuery(name="Dvm.findAll", query="SELECT d FROM Dvm d")
@XmlRootElement
public class Dvm {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** The toner description. */
	@Column(nullable=true)
	private String tonerbezeichnung;
	
	/** The color black (big). */
	@Column(nullable=true)
	private String schwarzgross;
	
	/** The color black. */
	@Column(nullable=true)
	private String schwarz;
	
	/** The color pack. */
	@Column(nullable=true)
	private String colorpack;
	
	/** The color cyan. */
	@Column(nullable=true)
	private String cyan;
	
	/** The color magenta. */
	@Column(nullable=true)
	private String magenta;
	
	/** The color yellow. */
	@Column(nullable=true)
	private String yellow;
	
	/** The head unit. */
	@Column(nullable=true)
	private String leitereinheit;
	
	/**
	 * Class constructor.
	 */
	public Dvm() {
		
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
	 * Gets the toner description.
	 *
	 * @return the toner description
	 */
	public String getTonerbezeichnung() {
		return tonerbezeichnung;
	}
	
	/**
	 * Sets the toner description.
	 *
	 * @param tonerbezeichnung the new toner description
	 */
	public void setTonerbezeichnung(String tonerbezeichnung) {
		this.tonerbezeichnung = tonerbezeichnung;
	}
	
	/**
	 * Gets the color black (big).
	 *
	 * @return the color black (big)
	 */
	public String getSchwarzgross() {
		return schwarzgross;
	}
	
	/**
	 * Sets the color black (big).
	 *
	 * @param schwarzgross the new color black (big)
	 */
	public void setSchwarzgross(String schwarzgross) {
		this.schwarzgross = schwarzgross;
	}
	
	/**
	 * Gets the color black.
	 *
	 * @return the color black
	 */
	public String getSchwarz() {
		return schwarz;
	}
	
	/**
	 * Sets the color black.
	 *
	 * @param schwarz the new color black
	 */
	public void setSchwarz(String schwarz) {
		this.schwarz = schwarz;
	}
	
	/**
	 * Gets the color pack.
	 *
	 * @return the color pack
	 */
	public String getColorpack() {
		return colorpack;
	}
	
	/**
	 * Sets the color pack.
	 *
	 * @param colorpack the new color pack
	 */
	public void setColorpack(String colorpack) {
		this.colorpack = colorpack;
	}
	
	/**
	 * Gets the color cyan.
	 *
	 * @return the color cyan
	 */
	public String getCyan() {
		return cyan;
	}
	
	/**
	 * Sets the color cyan.
	 *
	 * @param cyan the new color cyan
	 */
	public void setCyan(String cyan) {
		this.cyan = cyan;
	}
	
	/**
	 * Gets the color magenta.
	 *
	 * @return the color magenta
	 */
	public String getMagenta() {
		return magenta;
	}
	
	/**
	 * Sets the color magenta.
	 *
	 * @param magenta the new color magenta
	 */
	public void setMagenta(String magenta) {
		this.magenta = magenta;
	}
	
	/**
	 * Gets the color yellow.
	 *
	 * @return the color yellow
	 */
	public String getYellow() {
		return yellow;
	}
	
	/**
	 * Sets the color yellow.
	 *
	 * @param yellow the new color yellow
	 */
	public void setYellow(String yellow) {
		this.yellow = yellow;
	}
	
	/**
	 * Gets the head unit.
	 *
	 * @return the head unit
	 */
	public String getLeitereinheit() {
		return leitereinheit;
	}
	
	/**
	 * Sets the head unit.
	 *
	 * @param leitereinheit the new head unit
	 */
	public void setLeitereinheit(String leitereinheit) {
		this.leitereinheit = leitereinheit;
	}
	
}
