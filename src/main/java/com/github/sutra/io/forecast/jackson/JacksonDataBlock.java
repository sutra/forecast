package com.github.sutra.io.forecast.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sutra.io.forecast.DataBlock;
import com.github.sutra.io.forecast.DataPoint;

/**
 * {@link DataBlock} implementation using Jackson.
 *
 * @author Sutra Zhou
 */
public class JacksonDataBlock implements DataBlock {

	/**
	 * @see {@link #getSummary()}.
	 */
	@JsonProperty
	private String summary;

	/**
	 * @see {@link #getIcon()}.
	 */
	@JsonProperty
	private String icon;

	/**
	 * @see {@link #getData()}.
	 */
	@JsonProperty
	private JacksonDataPoint[] data;

	/**
	 * {@inheritDoc}
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * {@inheritDoc}
	 */
	public DataPoint[] getData() {
		return data;
	}

}
