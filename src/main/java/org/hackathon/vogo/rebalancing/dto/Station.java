package org.hackathon.vogo.rebalancing.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Station implements Serializable{

	Integer key; 
	LocationDTO location;
	Integer numberOfBikes;
	String name;
	
	
	
	
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocationDTO getLocation() {
		return location;
	}
	public void setLocation(LocationDTO dto) {
		this.location = dto;
	}
	public Integer getNumberOfBikes() {
		return numberOfBikes;
	}
	public void setNumberOfBikes(Integer numberOfBikes) {
		this.numberOfBikes = numberOfBikes;
	}
	
	
	public Station(LocationDTO location) {
		super();
		this.location = location;
		
		
	}
	
	
	
}
