/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.service;

import java.util.List;

import de.tgehring.itdb.server.entities.Benutzer;
import de.tgehring.itdb.server.service.exception.LoginServiceException;

/**
 * The Class LoginService represents the service containing login operations.
 */
public class LoginService {
	
	/** The instance. */
	private static LoginService instance = null;
	
	/** The user. */
	private Benutzer benutzer = null;
	
	/**
	 * Class constructor.
	 */
	private LoginService() {
		
	}
	
	/**
	 * Gets the single instance of the LoginService.
	 *
	 * @return single instance of the LoginService
	 */
	public static LoginService getInstance() {
		if(instance == null) {
			instance = new LoginService();
		}
		return instance;
	}
	
	/**
	 * If there is a user with the given properties the user will be logged in.
	 *
	 * @param benutzername the username
	 * @param passwort the password
	 * @throws LoginServiceException if the given properties are invalid
	 */
	public void login(String benutzername, String passwort) throws LoginServiceException {
		if(benutzer == null) {
			List<Benutzer> benutzerList = CRUDService.getInstance().getAllBenutzer();
			for(Benutzer b: benutzerList) {
				if(b.getBenutzername().equals(benutzername)) {
					if(b.getPasswort().equals(passwort)) {
						if(benutzer == null) {
							benutzer = b;
						} else {
							throw new LoginServiceException("Mehrere Benutzer zu den Daten gefunden.");
						}
					}
				}
			}
		} else {
			throw new LoginServiceException("Ein Benutzer ist bereits eingeloggt.");
		}
	}
	
	/**
	 * Logoff.
	 *
	 * @throws LoginServiceException if there is nobody to logg off
	 */
	public void logoff() throws LoginServiceException {
		if(benutzer != null) {
			setBenutzer(null);
		} else {
			throw new LoginServiceException("Ein Benutzer ist bereits eingeloggt.");
		}
	}

	/**
	 * Gets the user that is logged in.
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
	
	

}
