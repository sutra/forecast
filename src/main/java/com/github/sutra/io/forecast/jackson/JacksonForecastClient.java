package com.github.sutra.io.forecast.jackson;

import java.io.IOException;
import java.math.BigDecimal;
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
 * {@link ForecastClient} implementation using Jackson.
 *
 * @author Sutra Zhou
 */
public class JacksonForecastClient implements ForecastClient {

	/**
	 * The default API endpoint.
	 */
	private static final String DEFAULT_FORECAST_IO_API_ENDPOINT =
			"https://api.forecast.io";

	/**
	 * The API end point.
	 */
	private URL forecastEndpoint;

	/**
	 * The object mapper for converting JSON constructs to Java objects.
	 */
	private ObjectMapper mapper;

	/**
	 * Constructs a client with the specified API key.
	 *
	 * @param apiKey the API key.
	 */
	public JacksonForecastClient(String apiKey) {
		this(Utils.buildURL(DEFAULT_FORECAST_IO_API_ENDPOINT), apiKey);
	}

	/**
	 * Constructs a client with the specified API key and object mapper.
	 *
	 * @param apiKey the API key.
	 * @param mapper the object mapper for converting JSOn constructs to
	 * Java objects.
	 */
	public JacksonForecastClient(String apiKey, ObjectMapper mapper) {
		this(Utils.buildURL(DEFAULT_FORECAST_IO_API_ENDPOINT),
				apiKey,
				mapper);
	}

	/**
	 * Constructs a client with the specified end point and API key.
	 *
	 * @param endpoint the API end point.
	 * @param apiKey the API key.
	 */
	public JacksonForecastClient(URL endpoint, String apiKey) {
		this(endpoint, apiKey, new ObjectMapper());
	}

	/**
	 * Constructs a client with the specified end point, API key
	 * and object mapper.
	 *
	 * @param endpoint the API end point.
	 * @param apiKey the API key.
	 * @param mapper the object mapper for converting JSON constructs to
	 * Java objects.
	 */
	public JacksonForecastClient(URL endpoint, String apiKey,
			ObjectMapper mapper) {
		this.mapper = mapper;
		forecastEndpoint = Utils.buildURL(endpoint,
				"forecast/" + apiKey + "/");
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(BigDecimal latitude, BigDecimal longitude)
			throws IOException {
		return forecast(latitude, longitude, (Units) null);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(BigDecimal latitude, BigDecimal longitude,
			Units units)
			throws IOException {
		return forecast(latitude, longitude, units, (Block[]) null);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(BigDecimal latitude, BigDecimal longitude,
			Units units,
			Block[] excludes)
			throws IOException {
		return forecast(latitude, longitude, (Date) null, units,
				excludes);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(BigDecimal latitude, BigDecimal longitude,
			Units units,
			Block[] excludes,
			Block extend)
			throws IOException {
		return forecast(latitude, longitude, (Date) null, units,
				excludes);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(BigDecimal latitude, BigDecimal longitude,
			Date time)
			throws IOException {
		return forecast(latitude, longitude, time, (Units) null);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(BigDecimal latitude, BigDecimal longitude,
			Date time,
			Units units)
			throws IOException {
		return forecast(latitude, longitude, time, units,
				(Block[]) null);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(BigDecimal latitude, BigDecimal longitude,
			Date time,
			Units units,
			Block[] excludes)
			throws IOException {
		return forecast(latitude, longitude, time, units, excludes,
				(Block) null);
	}

	/**
	 * {@inheritDoc}
	 */
	public Forecast forecast(BigDecimal latitude, BigDecimal longitude,
			Date time,
			Units units,
			Block[] excludes,
			Block extend)
			throws IOException {
		String path = Utils.buildPath(latitude, longitude, time, units,
				excludes, extend);
		URL url = new URL(forecastEndpoint, path);
		return forecast(url);
	}

	/**
	 * Query forecast from the specified URL.
	 *
	 * @param url the URL.
	 * @return the forecast.
	 * @throws IOException indicates error in converting JSON constructs
	 * to Java objects.
	 */
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
