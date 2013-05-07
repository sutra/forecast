package com.github.sutra.io.forecast;

import java.io.IOException;
import java.util.Date;


/**
 * @author Sutra Zhou
 */
public interface ForecastClient {

	public abstract Forecast forecast(double latitude, double longitude)
			throws IOException;

	public abstract Forecast forecast(double latitude, double longitude,
			Units units) throws IOException;

	public abstract Forecast forecast(double latitude, double longitude,
			Units units, Block[] excludes) throws IOException;

	public abstract Forecast forecast(double latitude, double longitude,
			Date time) throws IOException;

	public abstract Forecast forecast(double latitude, double longitude,
			Date time, Units units) throws IOException;

	public abstract Forecast forecast(double latitude, double longitude,
			Date time, Units units, Block[] excludes) throws IOException;

}