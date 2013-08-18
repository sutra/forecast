package com.github.sutra.io.forecast.jackson;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import com.github.sutra.io.forecast.Block;
import com.github.sutra.io.forecast.Units;

/**
 * Utility class for forecast implementation using Jackson.
 *
 * @author Sutra Zhou
 */
final class Utils {

	/**
	 * The string buffer capacity multiple, it should be greater than the
	 * maximum length of the {@link Block} string.
	 */
	private static final int CAPACITY_MULTIPLE = 16;

	/**
	 * Utility class is not allowed to instantiate.
	 */
	private Utils() {
	}

	/**
	 * Builds URL object with the specified URL string.
	 *
	 * @param url the URL string.
	 * @return the URL object.
	 */
	public static URL buildURL(String url) {
		try {
			return new URL(url);
		} catch (MalformedURLException e) {
			throw new IllegalArgumentException(e);
		}
	}

	/**
	 * Builds URL object with the specified context and spec.
	 *
	 * @param context the context.
	 * @param spec the spec.
	 * @return the URL object.
	 */
	public static URL buildURL(URL context, String spec) {
		try {
			return new URL(context, spec);
		} catch (MalformedURLException e) {
			throw new IllegalArgumentException(e);
		}
	}

	/**
	 * Joins the array with the separator.
	 *
	 * @param array the array to join.
	 * @param separator the separator.
	 * @return the string joined with the separator.
	 */
	public static String join(Object[] array, char separator) {
		if (array == null) {
			return null;
		}

		int len = array.length;
		StringBuilder buf = new StringBuilder(len
				* CAPACITY_MULTIPLE);

		for (int i = 0; i < len; i++) {
			if (i > 0) {
				buf.append(separator);
			}
			if (array[i] != null) {
				buf.append(array[i]);
			}
		}
		return buf.toString();
	}

	/**
	 * Builds URL path for the forecast inquiry.
	 *
	 * @param latitude the latitude.
	 * @param longitude the longitude.
	 * @param time the time.
	 * @param units the units.
	 * @param excludes the excludes blocks.
	 * @param extend return hourly data for the next seven days,
	 * rather than the next two.
	 * (This option is ignored on time machine requests.
	 * When using this option, we strongly recommend ensuring
	 * that your HTTP client supports compression.)
	 * @return the URL path.
	 */
	public static String buildPath(double latitude, double longitude,
			Date time,
			Units units,
			Block[] excludes,
			Block extend) {
		StringBuilder buf = new StringBuilder();

		buf.append(latitude).append(",").append(longitude);

		if (time != null) {
			buf.append(',').append(
				time.getTime()
				/ UnixTimeUtils.MILLISECONDS_PER_SECOND);
		}

		boolean query = false;

		if (units != null) {
			if (query) {
				buf.append('&');
			} else {
				buf.append('?');
				query = true;
			}
			buf.append("units=").append(units);
		}

		if (excludes != null) {
			if (query) {
				buf.append('&');
			} else {
				buf.append('?');
				query = true;
			}
			buf.append("exclude=").append(
					Utils.join(excludes, ','));
		}

		if (extend != null) {
			if (query) {
				buf.append('&');
			} else {
				buf.append('?');
				query = true;
			}
			buf.append("extend=").append(extend);
		}

		return buf.toString();
	}

}
