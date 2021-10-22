package com.springRest.Assignment3;

public class State {

	private String stateName;
	private String cityName;

	private String countryName;

	public State() {

	}

	public State(String stateName, String cityName, String countryName) {
		super();

		this.stateName = stateName;
		this.cityName = cityName;
		this.countryName = countryName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}