package com.github.sutra.io.forecast.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sutra.io.forecast.Flags;

/**
 * @author Sutra Zhou
 */
public class JacksonFlags implements Flags {

	@JsonProperty("darksky-stations")
	private String[] darkskyStations;

	@JsonProperty("datapoint-stations")
	private String[] datapointStations;

	@JsonProperty("isd-stations")
	private String[] isdStations;

	@JsonProperty("lamp-stations")
	private String[] lampStations;

	@JsonProperty("metar-stations")
	private String[] metarStations;

	@JsonProperty
	private String[] sources;

	@JsonProperty
	private String units;

	/**
	 * {@inheritDoc}
	 */
	public String[] getDarkskyStations() {
		return darkskyStations;
	}

	/**
	 * {@inheritDoc}
	 */
	public String[] getDatapointStations() {
		return datapointStations;
	}

	/**
	 * {@inheritDoc}
	 */
	public String[] getIsdStations() {
		return isdStations;
	}

	/**
	 * {@inheritDoc}
	 */
	public String[] getLampStations() {
		return lampStations;
	}

	/**
	 * {@inheritDoc}
	 */
	public String[] getMetarStations() {
		return metarStations;
	}

	/**
	 * {@inheritDoc}
	 */
	public String[] getSources() {
		return sources;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getUnits() {
		return units;
	}

}