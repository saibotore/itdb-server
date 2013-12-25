/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.history.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Tablet represents used Tablets in the company.
 */
@Entity
@NamedQuery(name="Tablet.findAll", query="SELECT t FROM Tablet t")
@XmlRootElement
public class Tablet extends HistoryEntity {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/** The user. */
	@OneToOne(fetch=FetchType.LAZY)
	private Benutzer benutzer;
	
	/** The manufacturer. */
	@OneToOne(fetch=FetchType.LAZY)
	private Hersteller hersteller;

	/** The supplier. */
	@OneToOne(fetch=FetchType.LAZY)
	private Lieferant lieferant;
	
	/** The invoice. */
	@OneToOne(fetch=FetchType.LAZY)
	private Rechnung rechnung;
	
	/** The description. */
	private String bezeichnung;
	
	/** The ip. */
	private String ip;
	
	/** The subnet. */
	private String subnet;
	
	/** The gateway. */
	private String gateway;
	
	/** The primary dns. */
	private String dnsPrimary;
	
	/** The secondary dns. */
	private String dnsSecondary;
	
	/**
	 * Class constructor.
	 */
	public Tablet() {
		
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
	 * Gets the user.
	 *
	 * @return the user
	 */
	public Benutzer getBenutzer() {
		return benutzer;
	}
	
	/**
	 * Sets the user.
	 *
	 * @param benutzer the new user
	 */
	public void setBenutzer(Benutzer benutzer) {
		this.benutzer = benutzer;
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
	
	/**
	 * Gets the ip.
	 *
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	
	/**
	 * Sets the ip.
	 *
	 * @param ip the new ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	/**
	 * Gets the subnet.
	 *
	 * @return the subnet
	 */
	public String getSubnet() {
		return subnet;
	}
	
	/**
	 * Sets the subnet.
	 *
	 * @param subnet the new subnet
	 */
	public void setSubnet(String subnet) {
		this.subnet = subnet;
	}
	
	/**
	 * Gets the gateway.
	 *
	 * @return the gateway
	 */
	public String getGateway() {
		return gateway;
	}
	
	/**
	 * Sets the gateway.
	 *
	 * @param gateway the new gateway
	 */
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	
	/**
	 * Gets the primary dns.
	 *
	 * @return the dns primary
	 */
	public String getDnsPrimary() {
		return dnsPrimary;
	}
	
	/**
	 * Sets the primary dns.
	 *
	 * @param dnsPrimary the new primary dns
	 */
	public void setDnsPrimary(String dnsPrimary) {
		this.dnsPrimary = dnsPrimary;
	}
	
	/**
	 * Gets the secondary dns.
	 *
	 * @return the secondary dns
	 */
	public String getDnsSecondary() {
		return dnsSecondary;
	}
	
	/**
	 * Sets the secondary dns.
	 *
	 * @param dnsSecondary the new secondary dns
	 */
	public void setDnsSecondary(String dnsSecondary) {
		this.dnsSecondary = dnsSecondary;
	}
	
}
