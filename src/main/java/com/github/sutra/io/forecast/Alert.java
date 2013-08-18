package com.github.sutra.io.forecast;

import java.net.URI;
import java.util.Date;

/**
 * An alert object represents a severe weather warning issued for the requested
 * location by a governmental authority.
 *
 * @author Sutra Zhou
 */
public interface Alert {

	/**
	 * Returns a short text summary of the alert.
	 *
	 * @return A short text summary of the alert.
	 */
	String getTitle();

	/**
	 * Returns the time at which the alert will cease to be valid.
	 *
	 * @return The time at which the alert will cease to be valid.
	 */
	Date getExpires();

	/**
	 * Returns a detailed text description of the alert
	 * from the appropriate weather service.
	 *
	 * @return a detailed text description of the alert
	 * from the appropriate weather service.
	 */
	String getDescription();

	/**
	 * Returns an HTTP(S) URL that contains detailed information about the
	 * alert.
	 *
	 * @return An HTTP(S) URI that contains detailed information about the
	 *         alert.
	 */
	URI getUri();

}
