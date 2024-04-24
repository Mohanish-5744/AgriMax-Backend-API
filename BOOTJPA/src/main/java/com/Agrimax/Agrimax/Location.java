package com.Agrimax.Agrimax;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {

	public String location;
	public Integer temperature;
	public String land;
	public String region;
	public String rain;
	
	public Location()
	{
		super();
	}
	
	public Location(String location, Integer temperature, String land, String region, String rain) {
		super();
		this.location = location;
		this.temperature = temperature;
		this.land = land;
		this.region = region;
		this.rain = rain;
	}
	
	@Id
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRain() {
		return rain;
	}
	public void setRain(String rain) {
		this.rain = rain;
	}
	
	
}
