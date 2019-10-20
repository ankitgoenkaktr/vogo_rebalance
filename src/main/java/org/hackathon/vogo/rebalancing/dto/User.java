package org.hackathon.vogo.rebalancing.dto;

import java.io.Serializable;

public class User implements Serializable{

	LocationDTO locationDTO;
	String userName;
	
	
	public LocationDTO getLocationDTO() {
		return locationDTO;
	}
	public void setLocationDTO(LocationDTO locationDTO) {
		this.locationDTO = locationDTO;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
}
