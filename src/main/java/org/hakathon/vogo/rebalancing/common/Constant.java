package org.hakathon.vogo.rebalancing.common;

import org.hackathon.vogo.rebalancing.dao.Dao;

public interface Constant {

	String user1= "1";
	String user2 = "2";
	
	float longitudeMaxUser1=1;
	float longitudeMinUser1=0;
	
	float latitudeMaxUser1=1;
	float latitudeMinUser1=0;
	
	
	
	float longitudeMaxUser2=11;
	float longitudeMinUser2=10;

	
	float latitudeMaxUser2=11;
	float latitudeMinUser2=10;
	
	Dao dao = new Dao();
	
	
	int non_surge_price=4;
	int surge_price= 8;
	
	String Bellandur = "Bellandur";
	String Marathali= ("Marathali");
	String Whitefield=("Whitefield");
	String Kadubeesanahalli=("Kadubeesanahalli");
	String HAL=("HAL");
	String Kundalahalli=("Kundalahalli");
	String Mahadevapura=("Mahadevapura");
	String KRPuram="KRPuram";
	
	
	String DRIVER= "driver";
	String REQUEST="request";
}
