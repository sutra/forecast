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
	 * @return A short text summary of the alert.
	 */
	public abstract String getTitle();

	/**
	 * @return The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970)
	 *         at which the alert will cease to be valid.
	 */
	public abstract Date getExpires();

	/**
	 * @return An HTTP(S) URI that contains detailed information about the
	 *         alert.
	 */
	public abstract URI getUri();

}