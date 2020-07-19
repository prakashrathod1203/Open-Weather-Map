package com.pr.example.weather.payload;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/**
 * 
 * @author Prakash Rathod
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "coord", "weather", "base", "main", "visibility", "wind",
		"clouds", "dt", "sys", "id", "name", "cod" })
public class WeatherMapper {

	@JsonProperty("coord")
	private Coord coord;
	@JsonProperty("weather")
	private List<Weather> weather;
	@JsonProperty("base")
	private String base;
	@JsonProperty("main")
	private GroupWeather groupWeather;
	@JsonProperty("visibility")
	private Integer visibility;
	@JsonProperty("wind")
	private Wind wind;
	@JsonProperty("clouds")
	private Clouds clouds;
	@JsonProperty("dt")
	private Integer dt;
	@JsonProperty("sys")
	private Sys sys;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("cod")
	private Integer cod;

	@JsonProperty("coord")
	public Coord getCoord() {
		return coord;
	}

	@JsonProperty("coord")
	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	@JsonProperty("weather")
	public List<Weather> getWeather() {
		return weather;
	}

	@JsonProperty("weather")
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	@JsonProperty("base")
	public String getBase() {
		return base;
	}

	@JsonProperty("base")
	public void setBase(String base) {
		this.base = base;
	}

	@JsonProperty("main")
	public GroupWeather getGroupWeather() {
		return groupWeather;
	}

	@JsonProperty("main")
	public void setGroupWeather(GroupWeather groupWeather) {
		this.groupWeather = groupWeather;
	}
	@JsonProperty("visibility")
	public Integer getVisibility() {
		return visibility;
	}

	@JsonProperty("visibility")
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	@JsonProperty("wind")
	public Wind getWind() {
		return wind;
	}

	@JsonProperty("wind")
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	@JsonProperty("clouds")
	public Clouds getClouds() {
		return clouds;
	}

	@JsonProperty("clouds")
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	@JsonProperty("dt")
	public Integer getDt() {
		return dt;
	}

	@JsonProperty("dt")
	public void setDt(Integer dt) {
		this.dt = dt;
	}

	@JsonProperty("sys")
	public Sys getSys() {
		return sys;
	}

	@JsonProperty("sys")
	public void setSys(Sys sys) {
		this.sys = sys;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("cod")
	public Integer getCod() {
		return cod;
	}

	@JsonProperty("cod")
	public void setCod(Integer cod) {
		this.cod = cod;
	}
}
