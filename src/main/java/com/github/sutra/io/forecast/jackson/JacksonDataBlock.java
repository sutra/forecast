package com.github.sutra.io.forecast.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sutra.io.forecast.DataBlock;
import com.github.sutra.io.forecast.DataPoint;

/**
 * @author Sutra Zhou
 */
public class JacksonDataBlock implements DataBlock {

	@JsonProperty
	private String summary;

	@JsonProperty
	private String icon;

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