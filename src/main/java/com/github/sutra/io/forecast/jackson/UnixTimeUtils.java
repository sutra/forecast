package com.github.sutra.io.forecast.jackson;

import java.util.Date;

/**
 * Unix time utility class.
 *
 * @author Sutra Zhou
 */
final class UnixTimeUtils {

	/**
	 * The milliseconds per second.
	 */
	public static final long MILLISECONDS_PER_SECOND = 1000L;

	/**
	 * Utility class is not allowed to instantiate.
	 */
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
			return new Date(unixTime * MILLISECONDS_PER_SECOND);
		} else {
			return null;
		}
	}

}
