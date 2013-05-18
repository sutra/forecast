package com.github.sutra.io.forecast;

import java.io.IOException;
import java.util.Date;


/**
 * The entry of the API.
 * 
 * @author Sutra Zhou
 */
public interface ForecastClient {

	/**
	 * Returns the current forecast (for the next week).
	 * 
	 * @param latitude the requested latitude.
	 * @param longitude the requested longitude.
	 * @return the current forecast (for the next week).
	 * @throws IOException indicate I/O exception
	 */
	public abstract Forecast forecast(double latitude, double longitude)
			throws IOException;

	/**
	 * Returns the current forecast (for the next week).
	 * 
	 * @param latitude the requested latitude.
	 * @param longitude the requested longitude.
	 * @param units the units
	 * @return the current forecast (for the next week) with the specified units.
	 * @throws IOException indicate I/O exception
	 */
	public abstract Forecast forecast(double latitude, double longitude,
			Units units) throws IOException;

	/**
	 * Returns the current forecast (for the next week).
	 * 
	 * @param latitude the requested latitude.
	 * @param longitude the requested longitude.
	 * @param units the units.
	 * @param excludes the excluded blocks.
	 * @return the current forecast (for the next week) with the specified units
	 *         excludes the specified blocks.
	 * @throws IOException indicate I/O exception
	 */
	public abstract Forecast forecast(double latitude, double longitude,
			Units units, Block[] excludes) throws IOException;

	/**
	 * Returns a specific time, past or future (for many places, 60 years in the
	 * past to 10 years in the future) forcast.
	 * 
	 * @param latitude the requested latitude.
	 * @param longitude the requested longitude.
	 * @param time the time that to query.
	 * @return the forecast of the specified time.
	 * @throws IOException indicate I/O exception
	 */
	public abstract Forecast forecast(double latitude, double longitude,
			Date time) throws IOException;

	/**
	/**
	 * Returns a specific time, past or future (for many places, 60 years in the
	 * past to 10 years in the future) forcast.
	 * 
	 * @param latitude the requested latitude.
	 * @param longitude the requested longitude.
	 * @param time the time that to query.
	 * @param units the units.
	 * @return the forecast of the specified time with the speicified units.
	 * @throws IOException indicate I/O exception
	 */
	public abstract Forecast forecast(double latitude, double longitude,
			Date time, Units units) throws IOException;

	/**
	 * Returns a specific time, past or future (for many places, 60 years in the
	 * past to 10 years in the future) forcast.
	 * 
	 * @param latitude the requested latitude.
	 * @param longitude the requested longitude.
	 * @param time the time that to query.
	 * @param units the units.
	 * @param excludes the excluded blocks.
	 * @return the forecast of the specified time with the speicified units.
	 * @throws IOException indicate I/O exception
	 */
	public abstract Forecast forecast(double latitude, double longitude,
			Date time, Units units, Block[] excludes) throws IOException;

}