package com.github.sutra.io.forecast.jackson;

import java.math.BigDecimal;
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
	 * @see {@link #getMoonPhase()}.
	 */
	@JsonProperty
	private BigDecimal moonPhase;

	/**
	 * @see {@link #getPrecipIntensity()}.
	 */
	@JsonProperty
	private BigDecimal precipIntensity;

	/**
	 * @see {@link #getPrecipIntensityMax()}.
	 */
	@JsonProperty
	private BigDecimal precipIntensityMax;

	/**
	 * @see {@link #getPrecipIntensityMaxTime()}.
	 */
	@JsonProperty
	private Long precipIntensityMaxTime;

	/**
	 * @see {@link #getPrecipProbability()}.
	 */
	@JsonProperty
	private BigDecimal precipProbability;

	/**
	 * @see {@link #getPrecipType()}.
	 */
	@JsonProperty
	private String precipType;

	/**
	 * @see {@link #getPrecipAccumulation()}.
	 */
	@JsonProperty
	private BigDecimal precipAccumulation;

	/**
	 * @see {@link #getTemperature()}.
	 */
	@JsonProperty
	private BigDecimal temperature;

	/**
	 * @see {@link #getTemperatureMin()}.
	 */
	@JsonProperty
	private BigDecimal temperatureMin;

	/**
	 * @see {@link #getTemperatureMinTime()}.
	 */
	@JsonProperty
	private Long temperatureMinTime;

	/**
	 * @see {@link #getTemperatureMax()}.
	 */
	@JsonProperty
	private BigDecimal temperatureMax;

	/**
	 * @see {@link #getTemperatureMaxTime()}.
	 */
	@JsonProperty
	private Long temperatureMaxTime;

	/**
	 * @see {@link #getApparentTemperature()}.
	 */
	@JsonProperty
	private BigDecimal apparentTemperature;

	/**
	 * @see {@link #getApparentTemperatureMin()}.
	 */
	@JsonProperty
	private BigDecimal apparentTemperatureMin;

	/**
	 * @see {@link #getApparentTemperatureMinTime()}.
	 */
	@JsonProperty
	private Long apparentTemperatureMinTime;

	/**
	 * @see {@link #getApparentTemperatureMax()}.
	 */
	@JsonProperty
	private BigDecimal apparentTemperatureMax;

	/**
	 * @see {@link #getApparentTemperatureMaxTime()}.
	 */
	@JsonProperty
	private Long apparentTemperatureMaxTime;

	/**
	 * @see {@link #getDewPoint()}.
	 */
	@JsonProperty
	private BigDecimal dewPoint;

	/**
	 * @see {@link #getWindSpeed()}.
	 */
	@JsonProperty
	private BigDecimal windSpeed;

	/**
	 * @see {@link #getWindBearing()}.
	 */
	@JsonProperty
	private Integer windBearing;

	/**
	 * @see {@link #getCloudCover()}.
	 */
	@JsonProperty
	private BigDecimal cloudCover;

	/**
	 * @see {@link #getHumidity()}.
	 */
	@JsonProperty
	private BigDecimal humidity;

	/**
	 * @see {@link #getPressure()}.
	 */
	@JsonProperty
	private BigDecimal pressure;

	/**
	 * @see {@link #getVisibility()}.
	 */
	@JsonProperty
	private BigDecimal visibility;

	/**
	 * @see {@link #getOzone()}.
	 */
	@JsonProperty
	private BigDecimal ozone;

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
	public BigDecimal getMoonPhase() {
		return moonPhase;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getPrecipIntensity() {
		return precipIntensity;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getPrecipIntensityMax() {
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
	public BigDecimal getPrecipProbability() {
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
	public BigDecimal getPrecipAccumulation() {
		return precipAccumulation;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getTemperature() {
		return temperature;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getTemperatureMin() {
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
	public BigDecimal getTemperatureMax() {
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
	public BigDecimal getApparentTemperature() {
		return apparentTemperature;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getApparentTemperatureMin() {
		return apparentTemperatureMin;
	}

	/**
	 * {@inheritDoc}
	 */
	public Date getApparentTemperatureMinTime() {
		return UnixTimeUtils.toDate(apparentTemperatureMinTime);
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getApparentTemperatureMax() {
		return apparentTemperatureMax;
	}

	/**
	 * {@inheritDoc}
	 */
	public Date getApparentTemperatureMaxTime() {
		return UnixTimeUtils.toDate(apparentTemperatureMaxTime);
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getDewPoint() {
		return dewPoint;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getWindSpeed() {
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
	public BigDecimal getCloudCover() {
		return cloudCover;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getHumidity() {
		return humidity;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getPressure() {
		return pressure;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getVisibility() {
		return visibility;
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal getOzone() {
		return ozone;
	}

}
