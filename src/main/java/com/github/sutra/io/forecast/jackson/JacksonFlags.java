package com.github.sutra.io.forecast.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sutra.io.forecast.Flags;

/**
 * {@link Flags} implementation using Jackson.
 *
 * @author Sutra Zhou
 */
public class JacksonFlags implements Flags {

	/**
	 * @see {@link #getDarkskyStations()}.
	 */
	@JsonProperty("darksky-stations")
	private String[] darkskyStations;

	/**
	 * @see {@link #getDatapointStations()}.
	 */
	@JsonProperty("datapoint-stations")
	private String[] datapointStations;

	/**
	 * @see {@link #getIsdStations()}.
	 */
	@JsonProperty("isd-stations")
	private String[] isdStations;

	/**
	 * @see {@link #getLampStations()}.
	 */
	@JsonProperty("lamp-stations")
	private String[] lampStations;

	/**
	 * @see {@link #getMetarStations()}.
	 */
	@JsonProperty("metar-stations")
	private String[] metarStations;

	/**
	 * @see {@link #getMadisStations()}.
	 */
	@JsonProperty("madis-stations")
	private String[] madisStations;

	/**
	 * @see {@link #getMetnoLicense()}.
	 */
	@JsonProperty("metno-license")
	private String metnoLicense;

	/**
	 * @see {@link #getSources()}.
	 */
	@JsonProperty
	private String[] sources;

	/**
	 * @see {@link #getUnits()}.
	 */
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
	public String[] getMadisStations() {
		return madisStations;
	}

	/**
	 * @return the metnoLicense
	 */
	public String getMetnoLicense() {
		return metnoLicense;
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
