package com.github.sutra.io.forecast;

import java.math.BigDecimal;
import java.util.Date;

/**
 * A data point object represents the various weather phenomena occurring at a
 * specific instant of time, and has many varied properties. All of these
 * properties (except time) are optional, and will only be set if we have that
 * type of information for that location and time. Please note that minutely
 * data points are always aligned to the nearest minute boundary, hourly points
 * to the top of the hour, and daily points to midnight of that day.
 *
 * Data points in the daily data block are special: instead of representing the
 * weather phenomena at a given instant of time, they are an aggregate point
 * representing the weather phenomena that will occur over the entire day. For
 * precipitation fields, this aggregate is a maximum; for other fields, it is an
 * average.
 *
 * @author Sutra Zhou
 */
public interface DataPoint {

	/**
	 * Returns the time at which this data point occurs.
	 *
	 * @return The time at which this data point occurs.
	 */
	Date getTime();

	/**
	 * Returns a human-readable text summary of this data point.
	 *
	 * @return A human-readable text summary of this data point.
	 */
	String getSummary();

	/**
	 * Returns a machine-readable text summary of this data point.
	 *
	 * @return A machine-readable text summary of this data point, suitable
	 * for selecting an icon for display. If defined, this property
	 * will have one of the following values: clear-day,
	 * clear-night, rain, snow, sleet, wind, fog, cloudy,
	 * partly-cloudy-day, or partly-cloudy-night. (Developers
	 * should ensure that a sensible
	 * default is defined, as additional values, such as hail,
	 * thunderstorm, or tornado, may be defined in the future.)
	 */
	String getIcon();

	/**
	 * Returns the sunrise time.
	 *
	 * @return the sunrise time
	 */
	Date getSunriseTime();

	/**
	 * Returns the sunset time.
	 *
	 * @return the sunset time
	 */
	Date getSunsetTime();

	/**
	 * Returns the average expected intensity of precipitation occurring at
	 * the given time conditional on probability.
	 *
	 * @return The average expected intensity (in inches of liquid water per
	 * hour) of precipitation occurring at the given time conditional on
	 * probability (that is, assuming any precipitation occurs at all).
	 * A very rough guide is that a value of 0 corresponds to no
	 * precipitation, 0.002 corresponds to very light sprinkling, 0.017
	 * corresponds to light precipitation, 0.1 corresponds to moderate
	 * precipitation, and 0.4 corresponds to very heavy precipitation.
	 */
	BigDecimal getPrecipIntensity();

	/**
	 * Returns the maximum expected intensity of precipitation on the given
	 * day in inches of liquid water per hour.
	 *
	 * @return The maximum expected intensity of precipitation on the given
	 * day in inches of liquid water per hour.
	 */
	BigDecimal getPrecipIntensityMax();

	/**
	 * Returns the time at which the maximum expected intensity of
	 * precipitation.
	 *
	 * @return The time at which the maximum expected intensity of
	 * precipitation on the given day in inches of liquid water per hour.
	 */
	Date getPrecipIntensityMaxTime();

	/**
	 * Returns the probability of precipitation occurring at the given time.
	 *
	 * @return A numerical value between 0 and 1 (inclusive) representing
	 * the probability of precipitation occurring at the given time. (If
	 * precipIntensity is zero, then this property would be redundant
	 * and will therefore not be defined.)
	 */
	BigDecimal getPrecipProbability();

	/**
	 * Returns the type of precipitation occurring at the given time.
	 *
	 * @return The type of precipitation occurring at the given time. If
	 * defined, this property will have one of the following values:
	 * rain, snow, sleet (which applies to each of freezing rain, ice
	 * pellets, and “wintery mix”), or hail. (If precipIntensity is
	 * zero, then this property will not be defined.)
	 */
	String getPrecipType();

	/**
	 * Returns the amount of snowfall accumulation expected to occur on the
	 * given day.
	 *
	 * @return The amount of snowfall accumulation expected to occur on the
	 * given day. (If no accumulation is expected, this property will
	 * not be defined.)
	 */
	BigDecimal getPrecipAccumulation();

	/**
	 * Returns the temperature at the given time in degrees Fahrenheit.
	 *
	 * @return The temperature at the given time in degrees Fahrenheit.
	 */
	BigDecimal getTemperature();

	/**
	 * Returns the minimum temperature on the given day in degrees
	 * Fahrenheit.
	 *
	 * @return The minimum temperature on the given day in degrees
	 * Fahrenheit.
	 */
	BigDecimal getTemperatureMin();

	/**
	 * Returns the time at which the minimum temperature on the given day.
	 *
	 * @return The time at which the minimum temperature on the given day.
	 */
	Date getTemperatureMinTime();

	/**
	 * Returns the maximum temperature on the given day in degrees
	 * Fahrenheit.
	 *
	 * @return The maximum temperature on the given day in degrees
	 * Fahrenheit.
	 */
	BigDecimal getTemperatureMax();

	/**
	 * Returns the time at which the maximum temperature on the given day.
	 *
	 * @return The time at which the maximum temperature on the given day.
	 */
	Date getTemperatureMaxTime();

	/**
	 * Returns the apparent (or "feels like") temperature at the given time.
	 * <p>
	 * Not defined on daily data points.
	 * </p>
	 * <p>
	 * A numerical value representing the apparent (or “feels like”)
	 * temperature at the given time in degrees Fahrenheit.
	 * </p>
	 *
	 * @return the apparent (or "feels like") temperature at the given time.
	 */
	BigDecimal getApparentTemperature();

	/**
	 * Returns the minimum apparent temperature.
	 *
	 * <p>
	 * Only defined on daily data points.
	 * </p>
	 * <p>
	 * A numerical values representing the minimum apparent temperatures
	 * on the given day in degrees Fahrenheit.
	 * </p>
	 *
	 * @return the minimum apparent temperature.
	 */
	BigDecimal getApparentTemperatureMin();

	/**
	 * Returns the time at which the minimum apparent temperature occurs.
	 *
	 * @return The time at which the minimum apparent temperature occurs.
	 */
	Date getApparentTemperatureMinTime();

	/**
	 * Returns the maximum apparent temperature.
	 * <p>
	 * Only defined on daily data points.
	 * </p>
	 * <p>
	 * A numerical values representing the maximum apparent temperatures
	 * on the given day in degrees Fahrenheit.
	 * </p>
	 *
	 * @return the maximum apparent temperature.
	 */
	BigDecimal getApparentTemperatureMax();

	/**
	 * Returns the time at which the maximum apparent temperature occurs.
	 *
	 * @return The time at which the maximum apparent temperature occurs.
	 */
	Date getApparentTemperatureMaxTime();

	/**
	 * Returns the dew point at the given time in degrees Fahrenheit.
	 *
	 * @return The dew point at the given time in degrees Fahrenheit.
	 */
	BigDecimal getDewPoint();

	/**
	 * Returns the wind speed in miles per hour.
	 *
	 * @return The wind speed in miles per hour.
	 */
	BigDecimal getWindSpeed();

	/**
	 * Returns the direction that the wind is coming from in degrees.
	 *
	 * @return The direction that the wind is coming from in degrees,
	 * with true north at 0° and progressing clockwise. (If windSpeed
 	 * is zero, then this value will not be defined.)
	 */
	Integer getWindBearing();

	/**
	 * Returns the percentage of sky occluded by clouds.
	 *
	 * @return A numerical value between 0 and 1 (inclusive) representing
	 * the percentage of sky occluded by clouds. A value of 0 corresponds to
	 * clear sky, 0.4 to scattered clouds, 0.75 to broken cloud cover,
	 * and 1 to completely overcast skies.
	 */
	BigDecimal getCloudCover();

	/**
	 * Returns the relative humidity.
	 *
	 * @return A numerical value between 0 and 1 (inclusive) representing
	 * the relative humidity.
	 */
	BigDecimal getHumidity();

	/**
	 * Returns the sea-level air pressure in millibars.
	 *
	 * @return The sea-level air pressure in millibars.
	 */
	BigDecimal getPressure();

	/**
	 * Returns the average visibility in miles.
	 *
	 * @return The average visibility in miles, capped at 10 miles.
	 */
	BigDecimal getVisibility();

	/**
	 * Returns the columnar density of total atmospheric ozone at the given
	 * time in Dobson units.
	 *
	 * @return The columnar density of total atmospheric ozone at the given
	 * time in Dobson units.
	 */
	BigDecimal getOzone();

}
