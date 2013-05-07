package com.github.sutra.io.forecast;

import java.util.Date;

/**
 * @author Sutra Zhou
 */
public interface DataPoint {

	/**
	 * @return the time
	 */
	public abstract Date getTime();

	/**
	 * @return the summary
	 */
	public abstract String getSummary();

	/**
	 * @return the icon
	 */
	public abstract String getIcon();

	/**
	 * @return the sunriseTime
	 */
	public abstract Integer getSunriseTime();

	/**
	 * @return the sunsetTime
	 */
	public abstract Integer getSunsetTime();

	/**
	 * @return the precipIntensity
	 */
	public abstract Float getPrecipIntensity();

	/**
	 * @return the precipIntensityMax
	 */
	public abstract Float getPrecipIntensityMax();

	/**
	 * @return the precipIntensityMaxTime
	 */
	public abstract Integer getPrecipIntensityMaxTime();

	/**
	 * @return the precipProbability
	 */
	public abstract Float getPrecipProbability();

	/**
	 * @return the precipType
	 */
	public abstract String getPrecipType();

	/**
	 * @return the precipAccumulation
	 */
	public abstract Float getPrecipAccumulation();

	/**
	 * @return the temperature
	 */
	public abstract Float getTemperature();

	/**
	 * @return the temperatureMin
	 */
	public abstract Float getTemperatureMin();

	/**
	 * @return the temperatureMinTime
	 */
	public abstract Integer getTemperatureMinTime();

	/**
	 * @return the temperatureMax
	 */
	public abstract Float getTemperatureMax();

	/**
	 * @return the temperatureMaxTime
	 */
	public abstract Integer getTemperatureMaxTime();

	/**
	 * @return the dewPoint
	 */
	public abstract Float getDewPoint();

	/**
	 * @return the windSpeed
	 */
	public abstract Float getWindSpeed();

	/**
	 * @return the windBearing
	 */
	public abstract Integer getWindBearing();

	/**
	 * @return the cloudCover
	 */
	public abstract Float getCloudCover();

	/**
	 * @return the humidity
	 */
	public abstract Float getHumidity();

	/**
	 * @return the pressure
	 */
	public abstract Float getPressure();

	/**
	 * @return the visibility
	 */
	public abstract Float getVisibility();

	/**
	 * @return the ozone
	 */
	public abstract Float getOzone();

}