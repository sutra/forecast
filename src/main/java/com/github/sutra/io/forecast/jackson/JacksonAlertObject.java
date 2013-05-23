package com.github.sutra.io.forecast.jackson;

import java.net.URI;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sutra.io.forecast.AlertObject;

/**
 * @author Sutra Zhou
 */
public class JacksonAlertObject implements AlertObject {

	@JsonProperty
	private String title;

	@JsonProperty
	private Long expires;

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
	public URI getUri() {
		return uri;
	}

}