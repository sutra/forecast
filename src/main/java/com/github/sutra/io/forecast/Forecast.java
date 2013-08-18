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
	double getLatitude();

	/**
	 * Returns the longitude.
	 *
	 * @return the longitude
	 */
	double getLongitude();

	/**
	 * Returns the time zone.
	 *
	 * @return the timeZone
	 */
	TimeZone getTimeZone();

	/**
	 * Returns the current weather conditions.
	 *
	 * @return The current weather conditions.
	 */
	DataPoint getCurrently();

	/**
	 * @return the minutely
	 */
	DataBlock getMinutely();

	/**
	 * @return the hourly
	 */
	DataBlock getHourly();

	/**
	 * @return the daily
	 */
	DataBlock getDaily();

	/**
	 * @return the alerts
	 */
	Alert[] getAlerts();

	/**
	 * @return the flags
	 */
	Flags getFlags();

}
