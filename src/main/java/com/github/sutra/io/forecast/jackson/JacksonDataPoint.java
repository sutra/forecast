package com.github.sutra.io.forecast.jackson;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sutra.io.forecast.DataPoint;

/**
 * @author Sutra Zhou
 */
public class JacksonDataPoint implements DataPoint {

	@JsonProperty
	private Long time;

	@JsonProperty
	private String summary;

	@JsonProperty
	private String icon;

	@JsonProperty
	private Long sunriseTime;

	@JsonProperty
	private Long sunsetTime;

	@JsonProperty
	private Float precipIntensity;

	@JsonProperty
	private Float precipIntensityMax;

	@JsonProperty
	private Long precipIntensityMaxTime;

	@JsonProperty
	private Float precipProbability;

	@JsonProperty
	private String precipType;

	@JsonProperty
	private Float precipAccumulation;

	@JsonProperty
	private Float temperature;

	@JsonProperty
	private Float temperatureMin;

	@JsonProperty
	private Long temperatureMinTime;

	@JsonProperty
	private Float temperatureMax;

	@JsonProperty
	private Long temperatureMaxTime;

	@JsonProperty
	private Float dewPoint;

	@JsonProperty
	private Float windSpeed;

	@JsonProperty
	private Integer windBearing;

	@JsonProperty
	private Float cloudCover;

	@JsonProperty
	private Float humidity;

	@JsonProperty
	private Float pressure;

	@JsonProperty
	private Float visibility;

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