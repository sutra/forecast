package com.github.sutra.io.forecast.jackson;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sutra.io.forecast.DataPoint;

/**
 * {@link DataPoint} implementation using Jackson.
 *
 * @author Sutra Zhou
 */
public class JacksonDataPoint implements DataPoint {

	/**
	 * @see {@link #getTime()}.
	 */
	@JsonProperty
	private Long time;

	/**
	 * @see {@link #getSummary()}.
	 */
	@JsonProperty
	private String summary;

	/**
	 * @see {@link #getIcon()}.
	 */
	@JsonProperty
	private String icon;

	/**
	 * @see {@link #getSunriseTime()}.
	 */
	@JsonProperty
	private Long sunriseTime;

	/**
	 * @see {@link #getSunsetTime()}.
	 */
	@JsonProperty
	private Long sunsetTime;

	/**
	 * @see {@link #getPrecipIntensity()}.
	 */
	@JsonProperty
	private Float precipIntensity;

	/**
	 * @see {@link #getPrecipIntensityMax()}.
	 */
	@JsonProperty
	private Float precipIntensityMax;

	/**
	 * @see {@link #getPrecipIntensityMaxTime()}.
	 */
	@JsonProperty
	private Long precipIntensityMaxTime;

	/**
	 * @see {@link #getPrecipProbability()}.
	 */
	@JsonProperty
	private Float precipProbability;

	/**
	 * @see {@link #getPrecipType()}.
	 */
	@JsonProperty
	private String precipType;

	/**
	 * @see {@link #getPrecipAccumulation()}.
	 */
	@JsonProperty
	private Float precipAccumulation;

	/**
	 * @see {@link #getTemperature()}.
	 */
	@JsonProperty
	private Float temperature;

	/**
	 * @see {@link #getTemperatureMin()}.
	 */
	@JsonProperty
	private Float temperatureMin;

	/**
	 * @see {@link #getTemperatureMinTime()}.
	 */
	@JsonProperty
	private Long temperatureMinTime;

	/**
	 * @see {@link #getTemperatureMax()}.
	 */
	@JsonProperty
	private Float temperatureMax;

	/**
	 * @see {@link #getTemperatureMaxTime()}.
	 */
	@JsonProperty
	private Long temperatureMaxTime;

	/**
	 * @see {@link #getDewPoint()}.
	 */
	@JsonProperty
	private Float dewPoint;

	/**
	 * @see {@link #getWindSpeed()}.
	 */
	@JsonProperty
	private Float windSpeed;

	/**
	 * @see {@link #getWindBearing()}.
	 */
	@JsonProperty
	private Integer windBearing;

	/**
	 * @see {@link #getCloudCover()}.
	 */
	@JsonProperty
	private Float cloudCover;

	/**
	 * @see {@link #getHumidity()}.
	 */
	@JsonProperty
	private Float humidity;

	/**
	 * @see {@link #getPressure()}.
	 */
	@JsonProperty
	private Float pressure;

	/**
	 * @see {@link #getVisibility()}.
	 */
	@JsonProperty
	private Float visibility;

	/**
	 * @see {@link #getOzone()}.
	 */
	@JsonProperty
	private Float ozone;

	/**
	 * {@inheritDoc}
	 */
	public Date getTime() {
		return UnixTimeUtils.toDate(time);
	}

	/**
	 * {@inheritDoc}
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * {@inheritDoc}
	 */
	public Date getSunriseTime() {
		return UnixTimeUtils.toDate(sunriseTime);
	}

	/**
	 * {@inheritDoc}
	 */
	public Date getSunsetTime() {
		return UnixTimeUtils.toDate(sunsetTime);
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getPrecipIntensity() {
		return precipIntensity;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getPrecipIntensityMax() {
		return precipIntensityMax;
	}

	/**
	 * {@inheritDoc}
	 */
	public Date getPrecipIntensityMaxTime() {
		return UnixTimeUtils.toDate(precipIntensityMaxTime);
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getPrecipProbability() {
		return precipProbability;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getPrecipType() {
		return precipType;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getPrecipAccumulation() {
		return precipAccumulation;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getTemperature() {
		return temperature;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getTemperatureMin() {
		return temperatureMin;
	}

	/**
	 * {@inheritDoc}
	 */
	public Date getTemperatureMinTime() {
		return UnixTimeUtils.toDate(temperatureMinTime);
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getTemperatureMax() {
		return temperatureMax;
	}

	/**
	 * {@inheritDoc}
	 */
	public Date getTemperatureMaxTime() {
		return UnixTimeUtils.toDate(temperatureMaxTime);
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getDewPoint() {
		return dewPoint;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getWindSpeed() {
		return windSpeed;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getWindBearing() {
		return windBearing;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getCloudCover() {
		return cloudCover;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getHumidity() {
		return humidity;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getPressure() {
		return pressure;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getVisibility() {
		return visibility;
	}

	/**
	 * {@inheritDoc}
	 */
	public Float getOzone() {
		return ozone;
	}

}
