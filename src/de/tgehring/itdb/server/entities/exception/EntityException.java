/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.entities.exception;

/**
 * The Class EntityException represents an Exception for entities.
 */
public class EntityException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Instantiates a new EntityException.
	 *
	 * @param message the message
	 */
	public EntityException(String message) {
		super(message);
	}

}