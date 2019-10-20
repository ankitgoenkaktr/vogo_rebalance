package org.hackathon.vogo.rebalancing.dto;

import java.io.Serializable;

public class RideOptions implements Serializable{

	
	
	String name;
	int price;
	
	public RideOptions(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
