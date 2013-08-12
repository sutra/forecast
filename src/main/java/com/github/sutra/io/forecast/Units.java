package com.github.sutra.io.forecast;

/**
 * The units.
 *
 * @author Sutra Zhou
 */
public enum Units {

	/**
	 * The default units.
	 */
	us,

	/**
	 * Returns results in SI units.
	 * In particular, properties now have the following units:
	 * <ul>
	 * <li>
	 * summary: Any summaries containing temperature or snow
	 * accumulation units will have their values in degrees Celsius
	 * or in centimeters (respectively).
	 * </li>
	 * <li>
	 * precipIntensity: Millimeters per hour.
	 * </li>
	 * <li>
	 * precipAccumulation: Centimeters.
	 * </li>
	 * <li>
	 * temperature: Degrees Celsius.
	 * </li>
	 * <li>
	 * dewPoint: Degrees Celsius.
	 * </li>
	 * <li>
	 * windSpeed: Meters per second.
	 * </li>
	 * <li>
	 * pressure: Hectopascals (which are, conveniently, equivalent to
	 * the default millibars).
	 * </li>
	 * <li>
	 * visibility: Kilometers.
	 * </li>
	 * </ul>
	 */
	si,

	/**
	 * Identical to si, except that windSpeed is in kilometers per hour.
	 */
	ca,

	/**
	 * Identical to si, except that windSpeed is in miles per hour,
	 * as in the US. (This option is provided because adoption of SI
	 * in the UK has been inconsistent.)
	 */
	uk,

	/**
	 * Selects the relevant units automatically, based on geographic
	 * location.
	 */
	auto

}
