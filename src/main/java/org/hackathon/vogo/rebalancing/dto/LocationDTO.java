package org.hackathon.vogo.rebalancing.dto;

import java.io.Serializable;

public class LocationDTO implements Serializable {

	double longitude;
	double latitude;
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public LocationDTO(double latitude, double longitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	
	
	
	
}
