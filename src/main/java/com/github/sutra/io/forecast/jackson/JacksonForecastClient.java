package com.github.sutra.io.forecast.jackson;

import java.io.IOException;
import java.net.URL;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.sutra.io.forecast.Block;
import com.github.sutra.io.forecast.Forecast;
import com.github.sutra.io.forecast.ForecastClient;
import com.github.sutra.io.forecast.Units;

/**
 * @author Sutra Zhou
 */
public class JacksonForecastClient implements ForecastClient {

	private static final String DEFAULT_FORECAST_IO_API_ENDPOINT = "https://api.forecast.io";

	private URL forecastEndpoint;

	private ObjectMapper mapper;

	public JacksonForecastClient(String apiKey) {
		this(Utils.buildURL(DEFAULT_FORECAST_IO_API_ENDPOINT), apiKey);
	}

	public JacksonForecastClient(String apiKey, ObjectMapper mapper) {
		this(Utils.buildURL(DEFAULT_FORECAST_IO_API_ENDPOINT), apiKey, mapper);
	}

	public JacksonForecastClient(URL endpoint, String apiKey) {
		this(endpoint, apiKey, new ObjectMapper());
	}

	public JacksonForecastClient(URL endpoint, String apiKey, ObjectMapper mapper) {
		this.mapper = mapper;
		this.forecastEndpoint = Utils.buildURL(endpoint, "forecast/" + apiKey + "/");
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(double latitude, double longitude)
			throws IOException {
		return forecast(latitude, longitude, (Units) null);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(double latitude, double longitude, Units units)
			throws IOException {
		return forecast(latitude, longitude, units, (Block[]) null);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(double latitude, double longitude, Units units,
			Block[] excludes) throws IOException {
		return forecast(latitude, longitude, (Date) null, units, excludes);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(double latitude, double longitude, Date time)
			throws IOException {
		return forecast(latitude, longitude, time, (Units) null);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(double latitude, double longitude, Date time,
			Units units) throws IOException {
		return forecast(latitude, longitude, time, units, (Block[]) null);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(double latitude, double longitude, Date time,
			Units units, Block[] excludes) throws IOException {
		String path = Utils.buildPath(latitude, longitude, time, units, excludes);
		URL url = new URL(forecastEndpoint, path);
		return forecast(url);
	}

	private Forecast forecast(URL url) throws IOException {
		try {
			return mapper.readValue(url, JacksonForecast.class);
		} catch (JsonParseException e) {
			throw new IOException(e);
		} catch (JsonMappingException e) {
			throw new IOException(e);
		}
	}

}
