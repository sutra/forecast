package com.github.sutra.io.forecast;

import java.util.TimeZone;

/**
 * The API response.
 * 
 * @author Sutra Zhou
 */
public interface Forecast {

	/**
	 * Returns the latitude.
	 * 
	 * @return the latitude
	 */
	public abstract double getLatitude();

	/**
	 * Returns the longitude.
	 * 
	 * @return the longitude
	 */
	public abstract double getLongitude();

	/**
	 * Returns the time zone.
	 * 
	 * @return the timeZone
	 */
	public abstract TimeZone getTimeZone();

	/**
	 * Returns the current weather conditions.
	 * 
	 * @return The current weather conditions.
	 */
	public abstract DataPoint getCurrently();

	/**
	 * @return the minutely
	 */
	public abstract DataBlock getMinutely();

	/**
	 * @return the hourly
	 */
	public abstract DataBlock getHourly();

	/**
	 * @return the daily
	 */
	public abstract DataBlock getDaily();

	/**
	 * @return the alerts
	 */
	public abstract AlertObject[] getAlerts();

	/**
	 * @return the flags
	 */
	public abstract Flags getFlags();

}