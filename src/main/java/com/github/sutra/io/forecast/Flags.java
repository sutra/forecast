package com.github.sutra.io.forecast;

/**
 * The flags object contains various metadata information related to the
 * request.
 * 
 * @author Sutra Zhou
 */
public interface Flags {

	/**
	 * @return the darkskyStations
	 */
	public abstract String[] getDarkskyStations();

	/**
	 * @return the datapointStations
	 */
	public abstract String[] getDatapointStations();

	/**
	 * @return the isdStations
	 */
	public abstract String[] getIsdStations();

	/**
	 * @return the lampStations
	 */
	public abstract String[] getLampStations();

	/**
	 * @return the metarStations
	 */
	public abstract String[] getMetarStations();

	/**
	 * @return the sources
	 */
	public abstract String[] getSources();

	/**
	 * @return the units
	 */
	public abstract String getUnits();

}