package org.hackathon.vogo.rebalancing.dto;

import java.io.Serializable;

public class RequestDTO implements Serializable{

	User user;
	LocationDTO source;
	LocationDTO destination;
	Boolean readyForPool;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocationDTO getSource() {
		return source;
	}
	public void setSource(LocationDTO source) {
		this.source = source;
	}
	public LocationDTO getDestination() {
		return destination;
	}
	public void setDestination(LocationDTO destination) {
		this.destination = destination;
	}
	public Boolean getReadyForPool() {
		return readyForPool;
	}
	public void setReadyForPool(Boolean readyForPool) {
		this.readyForPool = readyForPool;
	}
	public RequestDTO(User user, LocationDTO source, LocationDTO destination, Boolean readyForPool) {
		super();
		this.user = user;
		this.source = source;
		this.destination = destination;
		this.readyForPool = readyForPool;
	}
	public RequestDTO(User user, LocationDTO source, LocationDTO destination) {
		super();
		this.user = user;
		this.source = source;
		this.destination = destination;
		this.readyForPool=false;
	}
	
	
	
	
	
	
}
