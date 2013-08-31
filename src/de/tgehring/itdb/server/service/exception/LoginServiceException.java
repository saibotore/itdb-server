/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.service.exception;

/**
 * The Class LoginServiceException.
 */
public class LoginServiceException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Instantiates a new login service exception.
	 *
	 * @param message the message
	 */
	public LoginServiceException(String message) {
		super(message);
	}
	
	/**
	 * Instantiates a new LoginServiceException.
	 *
	 * @param message the message
	 * @param throwable the throwable
	 */
	public LoginServiceException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
