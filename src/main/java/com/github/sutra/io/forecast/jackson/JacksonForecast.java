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
 * @author Sutra Zhou
 */
@JsonIgnoreProperties("offset")
public class JacksonForecast implements Forecast {

	@JsonProperty
	private double latitude;

	@JsonProperty
	private double longitude;

	@JsonProperty("timezone")
	private TimeZone timeZone;

	@JsonProperty
	private JacksonDataPoint currently;

	@JsonProperty
	private JacksonDataBlock minutely;

	@JsonProperty
	private JacksonDataBlock hourly;

	@JsonProperty
	private JacksonDataBlock daily;

	@JsonProperty
	private JacksonAlertObject[] alerts;

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
