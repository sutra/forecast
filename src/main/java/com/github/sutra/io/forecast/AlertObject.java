package com.github.sutra.io.forecast;

import java.net.URI;
import java.util.Date;

/**
 * @author Sutra Zhou
 */
public interface AlertObject {

	/**
	 * @return the title
	 */
	public abstract String getTitle();

	/**
	 * @return the expires
	 */
	public abstract Date getExpires();

	/**
	 * @return the uri
	 */
	public abstract URI getUri();

}