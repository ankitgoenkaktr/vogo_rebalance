package org.hackathon.vogo.rebalancing.dto;

import java.util.HashMap;
import java.util.Map;

public class SolutionDTO {

	
	Station destination;
	Integer surge;
	Integer price;
	Map<String,Integer> rideOptions ;
	
	
	
	public Map<String, Integer> getRideOptions() {
		return rideOptions;
	}
	public void setRideOptions(Map<String, Integer> rideOptions) {
		this.rideOptions = rideOptions;
	}
	
	public Station getDestination() {
		return destination;
	}
	public void setDestination(Station destination) {
		this.destination = destination;
	}
	public Integer getSurge() {
		return surge;
	}
	public void setSurge(Integer purge) {
		this.surge = purge;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public SolutionDTO(Station source, Station destination, Integer purge, Integer price) {
		super();
		
		this.destination = destination;
		this.surge = purge;
		this.price = price;
		rideOptions= new HashMap<String, Integer>();
	}
	
	
	
	
	
}
