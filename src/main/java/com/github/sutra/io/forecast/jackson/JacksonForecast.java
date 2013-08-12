package com.github.sutra.io.forecast.jackson;

import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sutra.io.forecast.AlertObject;
import com.github.sutra.io.forecast.DataBlock;
import com.github.sutra.io.forecast.DataPoint;
import com.github.sutra.io.forecast.Flags;
import com.github.sutra.io.forecast.Forecast;

/**
 * {@link Forecast} implementation using Jackson.
 *
 * @author Sutra Zhou
 */
@JsonIgnoreProperties("offset")
public class JacksonForecast implements Forecast {

	/**
	 * @see {@link #getLatitude()}.
	 */
	@JsonProperty
	private double latitude;

	/**
	 * @see {@link #getLongitude()}.
	 */
	@JsonProperty
	private double longitude;

	/**
	 * @see {@link #getTimeZone()}.
	 */
	@JsonProperty("timezone")
	private TimeZone timeZone;

	/**
	 * @see {@link #getCurrently()}.
	 */
	@JsonProperty
	private JacksonDataPoint currently;

	/**
	 * @see {@link #getMinutely()}.
	 */
	@JsonProperty
	private JacksonDataBlock minutely;

	/**
	 * @see {@link #getHourly()}.
	 */
	@JsonProperty
	private JacksonDataBlock hourly;

	/**
	 * @see {@link #getDaily()}.
	 */
	@JsonProperty
	private JacksonDataBlock daily;

	/**
	 * @see {@link #getAlerts()}.
	 */
	@JsonProperty
	private JacksonAlertObject[] alerts;

	/**
	 * @see {@link #getFlags()}.
	 */
	@JsonProperty
	private JacksonFlags flags;

	/**
	 * {@inheritDoc}
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * {@inheritDoc}
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * {@inheritDoc}
	 */
	public TimeZone getTimeZone() {
		return timeZone;
	}

	/**
	 * {@inheritDoc}
	 */
	public DataPoint getCurrently() {
		return currently;
	}

	/**
	 * {@inheritDoc}
	 */
	public DataBlock getMinutely() {
		return minutely;
	}

	/**
	 * {@inheritDoc}
	 */
	public DataBlock getHourly() {
		return hourly;
	}

	/**
	 * {@inheritDoc}
	 */
	public DataBlock getDaily() {
		return daily;
	}

	/**
	 * {@inheritDoc}
	 */
	public AlertObject[] getAlerts() {
		return alerts;
	}

	/**
	 * {@inheritDoc}
	 */
	public Flags getFlags() {
		return flags;
	}

}
