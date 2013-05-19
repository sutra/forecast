package com.github.sutra.io.forecast;

import java.net.URI;
import java.util.Date;

/**
 * An alert object represents a severe weather warning issued for the requested
 * location by a governmental authority.
 * 
 * @author Sutra Zhou
 */
public interface AlertObject {

	/**
	 * Returns a short text summary of the alert.
	 * 
	 * @return A short text summary of the alert.
	 */
	public abstract String getTitle();

	/**
	 * Returns the time at which the alert will cease to be valid.
	 * 
	 * @return The time at which the alert will cease to be valid.
	 */
	public abstract Date getExpires();

	/**
	 * Returns an HTTP(S) URL that contains detailed information about the
	 * alert.
	 * 
	 * @return An HTTP(S) URI that contains detailed information about the
	 *         alert.
	 */
	public abstract URI getUri();

}