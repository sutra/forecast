package com.github.sutra.io.forecast;


/**
 * @author Sutra Zhou
 */
public interface DataBlock {

	/**
	 * @return the summary
	 */
	public abstract String getSummary();

	/**
	 * @return the icon
	 */
	public abstract String getIcon();

	/**
	 * @return the data
	 */
	public abstract DataPoint[] getData();

}