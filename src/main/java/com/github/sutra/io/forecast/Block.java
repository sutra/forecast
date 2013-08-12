package com.github.sutra.io.forecast;

/**
 * The block that can be excluded.
 *
 * @author Sutra Zhou
 */
public enum Block {

	/**
	 * The current weather conditions.
	 */
	currently,

	/**
	 * The weather conditions minute-by-minute for the next hour.
	 */
	minutely,

	/**
	 * The weather conditions hour-by-hour for the next two days.
	 */
	hourly,

	/**
	 * The weather conditions day-by-day for the next week.
	 */
	daily,

	/**
	 * An array of alert objects, which, if present, contains any severe
	 * weather alerts, issued by a governmental weather authority, pertinent
	 * to the requested location.
	 */
	alerts,

	/**
	 * An object containing miscellaneous metadata concerning this request.
	 */
	flags

}
