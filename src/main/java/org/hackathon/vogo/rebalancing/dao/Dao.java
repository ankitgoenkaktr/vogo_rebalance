package org.hackathon.vogo.rebalancing.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hackathon.vogo.rebalancing.dto.LocationDTO;
import org.hackathon.vogo.rebalancing.dto.RideOptions;
import org.hackathon.vogo.rebalancing.dto.SolutionDTO;
import org.hackathon.vogo.rebalancing.dto.Station;
import org.hakathon.vogo.rebalancing.common.Constant;

public class Dao {

	public static List<SolutionDTO> stationListUser1 = new ArrayList<SolutionDTO>();
	public static 	List<SolutionDTO> stationListUser2 = new ArrayList<SolutionDTO>();
	
	
	public static RideOptions pool = new RideOptions("POOL", 6);
	public static RideOptions normal = new RideOptions("GO", 4);
	
	
	public static LocationDTO bellandurLocation = new LocationDTO(12.9248371,77.672818);
	public static LocationDTO kadubhinalhalili = new LocationDTO(12.9393442,77.6880849);
	public static LocationDTO HAL = new LocationDTO(12.9558897,77.6719065);
	public static LocationDTO kundanhalli = new LocationDTO(12.956844,77.7128443);
	public static LocationDTO mahadevpura = new LocationDTO(12.9869233,77.6687653);
	public static LocationDTO krPuram = new LocationDTO(13.0050837,77.655442);
	public static LocationDTO marathaliLocation = new LocationDTO(12.9582364,77.7019889);
	public static LocationDTO whitefieldLocation = new LocationDTO(12.9852905,77.7449562);
	
	public static Station bellandurStation = new Station(bellandurLocation);
	public static Station marathaliStation = new Station(marathaliLocation);
	public static Station whitefieldStation = new Station(whitefieldLocation);
	public static Station kadubhinalhaliliStation = new Station(kadubhinalhalili);
	public static Station HALStation = new Station(HAL);
	public static Station kundanhalliStation = new Station(kadubhinalhalili);
	public static Station mahadevpuraStation = new Station(mahadevpura);
	public static Station krPuramStation = new Station(krPuram);
	
	public static Map<String,String> poolWaiting = new HashMap();
	public static String accepted ="";
	
	static {
		
		
		stationListUser1.add(new SolutionDTO(marathaliStation, bellandurStation, 3, 6));
		stationListUser1.get(0).getRideOptions().put("POOL",4);
		stationListUser1.get(0).getRideOptions().put("GO",6);
		
		stationListUser1.add(new SolutionDTO(marathaliStation, kadubhinalhaliliStation, 3, 6));
		stationListUser1.get(1).getRideOptions().put("POOL",4);
		stationListUser1.get(1).getRideOptions().put("GO",6);
		
		stationListUser1.add(new SolutionDTO(marathaliStation, HALStation, 3, 6));
		
		stationListUser1.get(2).getRideOptions().put("GO",6);
		
		stationListUser1.add(new SolutionDTO(marathaliStation, kundanhalliStation, 3, 5));
		stationListUser1.get(3).getRideOptions().put("POOL",4);
		stationListUser1.get(3).getRideOptions().put("GO",6);
		
		stationListUser1.add(new SolutionDTO(marathaliStation, mahadevpuraStation, 3, 5));
		stationListUser1.get(4).getRideOptions().put("POOL",4);
	
		
		stationListUser1.add(new SolutionDTO(marathaliStation, whitefieldStation, 3, 4));
		stationListUser1.get(5).getRideOptions().put("POOL",4);
		stationListUser1.get(5).getRideOptions().put("GO",6);
		
		stationListUser1.add(new SolutionDTO(marathaliStation, krPuramStation, 3, 6));
		
		stationListUser1.get(6).getRideOptions().put("GO",6);
		
		
		
		stationListUser2.add(new SolutionDTO(whitefieldStation, bellandurStation, 3, 9));
		stationListUser2.get(0).getRideOptions().put("POOL",6);
		stationListUser2.get(0).getRideOptions().put("GO",9);
		
		stationListUser2.add(new SolutionDTO(whitefieldStation, kadubhinalhaliliStation, 3, 9));
		stationListUser2.get(1).getRideOptions().put("POOL",7);
		stationListUser2.get(1).getRideOptions().put("GO",9);
		
		stationListUser2.add(new SolutionDTO(whitefieldStation, HALStation, 3, 10));
	
		stationListUser2.get(2).getRideOptions().put("GO",10);
		
		stationListUser2.add(new SolutionDTO(whitefieldStation, kundanhalliStation, 3, 7));
		stationListUser2.get(3).getRideOptions().put("POOL",5);
		
		
		stationListUser2.add(new SolutionDTO(whitefieldStation, mahadevpuraStation, 3, 8));
		stationListUser2.get(4).getRideOptions().put("POOL",6);
		stationListUser2.get(4).getRideOptions().put("GO",8);
		
		stationListUser2.add(new SolutionDTO(whitefieldStation, krPuramStation, 3, 10));
		
		stationListUser2.get(5).getRideOptions().put("POOL",7);
		
		stationListUser2.add(new SolutionDTO(whitefieldStation, marathaliStation, 3, 8));
		stationListUser2.get(6).getRideOptions().put("POOL",6);
		stationListUser2.get(6).getRideOptions().put("GO",8);
		
		
		
		
		
		
		
		bellandurStation.setKey(1);
		marathaliStation.setKey(2);
		whitefieldStation.setKey(3);
		kadubhinalhaliliStation.setKey(4);
		HALStation.setKey(5);
		kundanhalliStation.setKey(6);
		mahadevpuraStation.setKey(8);
		krPuramStation.setKey(7);
		
		
		bellandurStation.setName(Constant.Bellandur);
		marathaliStation.setName(Constant.Marathali);
		whitefieldStation.setName(Constant.Whitefield);
		kadubhinalhaliliStation.setName(Constant.Kadubeesanahalli);
		HALStation.setName(Constant.HAL);
		kundanhalliStation.setName(Constant.Kundalahalli);
		mahadevpuraStation.setName(Constant.Mahadevapura);
		krPuramStation.setName(Constant.KRPuram);
		
		
	
		
		
	}
	
	
	
	
	
}
