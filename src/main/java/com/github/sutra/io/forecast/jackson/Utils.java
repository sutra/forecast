package com.github.sutra.io.forecast.jackson;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import com.github.sutra.io.forecast.Block;
import com.github.sutra.io.forecast.Units;

/**
 * @author Sutra Zhou
 */
class Utils {

	private Utils() {
	}

	public static URL buildURL(String url) {
		try {
			return new URL(url);
		} catch (MalformedURLException e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static URL buildURL(URL context, String spec) {
		try {
			return new URL(context, spec);
		} catch (MalformedURLException e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static String join(Object[] array, char separator) {
		if (array == null) {
			return null;
		}

		int len = array.length;
		StringBuilder buf = new StringBuilder(len * 16);
	
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

	public static String buildPath(double latitude, double longitude, Date time,
			Units units, Block[] excludes) {
		StringBuilder buf = new StringBuilder();

		buf.append(latitude).append(",").append(longitude);

		if (time != null) {
			buf.append(',').append(time.getTime() / 1000L);
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
			buf.append("exclude=").append(Utils.join(excludes, ','));
		}

		return buf.toString();
	}

}
