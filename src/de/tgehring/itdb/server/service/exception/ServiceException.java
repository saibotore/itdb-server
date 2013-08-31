/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.service.exception;

/**
 * The Class ServiceException.
 */
public class ServiceException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Instantiates a new ServiceException.
	 *
	 * @param message the message
	 */
	public ServiceException(String message) {
		super(message);
	}

}