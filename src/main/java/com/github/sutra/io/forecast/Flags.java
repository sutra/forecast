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
	String[] getDarkskyStations();

	/**
	 * @return the datapointStations
	 */
	String[] getDatapointStations();

	/**
	 * @return the isdStations
	 */
	String[] getIsdStations();

	/**
	 * @return the lampStations
	 */
	String[] getLampStations();

	/**
	 * @return the metarStations
	 */
	String[] getMetarStations();

	/**
	 * @return the sources
	 */
	String[] getSources();

	/**
	 * Returns the presence of this property indicates that data from <a
	 * href="http://api.met.no">api.met.no</a> was utilized in order to
	 * facilitate this request (as per their license agreement).
	 *
	 * @return the presence of this property indicates that data from <a
	 * href="http://api.met.no">api.met.no</a> was utilized in order to
	 * facilitate this request (as per their license agreement).
	 */
	String getMetnoLicense();

	/**
	 * @return the units
	 */
	String getUnits();

}
