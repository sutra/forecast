package com.github.sutra.io.forecast;

/**
 * A data block object represents the various weather phenomena occurring over a
 * period of time.
 * 
 * @author Sutra Zhou
 */
public interface DataBlock {

	/**
	 * @return A human-readable text summary of this data block.
	 */
	public abstract String getSummary();

	/**
	 * @return A machine-readable text summary of this data block.
	 */
	public abstract String getIcon();

	/**
	 * @return An array of {@link DataPoint data point} objects, ordered by
	 *         time, which together describe the weather conditions at the
	 *         requested location over time.
	 */
	public abstract DataPoint[] getData();

}