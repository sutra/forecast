package com.github.sutra.io.forecast.jackson;

import java.net.URI;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sutra.io.forecast.AlertObject;

/**
 * {@link AlertObject} implementation using Jackson.
 *
 * @author Sutra Zhou
 */
public class JacksonAlertObject implements AlertObject {

	/**
	 * @see {@link #getTitle()}.
	 */
	@JsonProperty
	private String title;

	/**
	 * @see {@link #getExpires()}.
	 */
	@JsonProperty
	private Long expires;

	/**
	 * @see {@link #getDescription()}.
	 */
	@JsonProperty
	private String description;

	/**
	 * @see {@link #getUri()}.
	 */
	@JsonProperty
	private URI uri;

	/**
	 * {@inheritDoc}
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * {@inheritDoc}
	 */
	public Date getExpires() {
		return UnixTimeUtils.toDate(expires);
	}

	/**
	 * {@inheritDoc}
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * {@inheritDoc}
	 */
	public URI getUri() {
		return uri;
	}

}
