package com.github.sutra.io.forecast.jackson;

import java.util.Date;

/**
 * @author Sutra Zhou
 */
class UnixTimeUtils {

	private UnixTimeUtils() {
	}

	/**
	 * Returns {@link Date} of the given Unix time.
	 * 
	 * @param unixTime seconds since midnight GMT on 1 Jan 1970
	 * @return {@link Date} of the given Unix time.
	 */
	public static Date toDate(Long unixTime) {
		if (unixTime != null) {
			return new Date(unixTime * 1000);
		} else {
			return null;
		}
	}

}
