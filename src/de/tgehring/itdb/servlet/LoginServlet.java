/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.tgehring.itdb.server.entities.Benutzer;
import de.tgehring.itdb.server.service.LoginService;
import de.tgehring.itdb.server.service.exception.LoginServiceException;

/**
 * The Class LoginServlet provides login operations on the database.
 */
@Path("/login")
public class LoginServlet {
	
	/**
	 * Tries to log in a user with the given parameters.
	 *
	 * @param benutzername the username
	 * @param passwort the password
	 * @return the matching user
	 */
	@GET
	@Produces("application/json")
	@Path("/{benutzername}/{passwort}")
	public Benutzer login( @PathParam("benutzername") String benutzername,
	                       @PathParam("passwort") String passwort ) {
		LoginService loginService = LoginService.getInstance();
		try {
			loginService.login(benutzername, passwort);
		} catch (LoginServiceException e) {
			e.printStackTrace();
		}
		return loginService.getBenutzer();
	}
	
	/**
	 * Tries to log off a user.
	 *
	 * @return the string
	 */
	@GET
	@Path("/logoff")
	@Produces(MediaType.TEXT_PLAIN)
	public String logoff() {
		LoginService loginService = LoginService.getInstance();
		try {
			loginService.logoff();
			return "Erfolgreich ausgeloggt";
		} catch (LoginServiceException e) {
			e.printStackTrace();
		}
		return "Ausloggen fehlgeschlagen.";
	}

}
