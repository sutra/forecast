package com.github.sutra.io.forecast;

/**
 * A data block object represents the various weather phenomena occurring over a
 * period of time.
 *
 * @author Sutra Zhou
 */
public interface DataBlock {

	/**
	 * Returns a human-readable text summary of this data block.
	 *
	 * @return A human-readable text summary of this data block.
	 */
	String getSummary();

	/**
	 * Returns a machine-readable text summary of this data block.
	 *
	 * @return A machine-readable text summary of this data block.
	 */
	String getIcon();

	/**
	 * Returns an array of {@link DataPoint data point} objects, which
	 * together describe the weather conditions.
	 *
	 * @return An array of {@link DataPoint data point} objects, ordered by
	 *         time, which together describe the weather conditions at the
	 *         requested location over time.
	 */
	DataPoint[] getData();

}
