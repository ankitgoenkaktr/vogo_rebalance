package org.hackathon.vogo.rebalancing.service;

import java.util.List;

import org.hackathon.vogo.rebalancing.dao.Dao;
import org.hackathon.vogo.rebalancing.dto.LocationDTO;
import org.hackathon.vogo.rebalancing.dto.SolutionDTO;
import org.hackathon.vogo.rebalancing.dto.Station;
import org.hackathon.vogo.rebalancing.dto.User;
import org.hakathon.vogo.rebalancing.common.Constant;



public class Service {

	
	
	

	
	
	public List<SolutionDTO> getAvailableStations(String user, String key){
		
		if( Constant.user1.equals(user)  && Constant.Marathali.equals(key)) {
			
			return Dao.stationListUser1;
			
			
			
		}else if(Constant.user2.equals( user )  &&  Constant.Whitefield.equals(key)) {
			
			
			return Dao.stationListUser2;
		}
		return null;
				
	}
	
	
public SolutionDTO getAvailableStation(String user, String key,String destination){
		
		if( Constant.user1.equals(user)  && Constant.Marathali.equals(key)) {
			
			return Dao.stationListUser1
					.stream()
					.filter(solution->solution.getDestination().getName().equals(destination))
					.findFirst()
					.get();
			
			
			
		}else if(Constant.user2.equals( user )  &&  Constant.Whitefield.equals(key)) {
			
			return Dao.stationListUser2
					.stream()
					.filter(solution->solution.getDestination().getName().equals(destination))
					.findFirst()
					.get();
		
		}
		return null;
				
	}




	public String poolMatch(String user,String role) {
		
		if(Constant.DRIVER.equals(role)) {
			
			
			
			if(!Dao.poolWaiting.containsKey(Constant.REQUEST) ) {
				
				Dao.poolWaiting.put(Constant.DRIVER, user);
				return null;
				
			}else if(!Dao.accepted.toString().equals("")){
				return null;
			}else {
				return Dao.poolWaiting.get(Constant.REQUEST);
				
			}
		}else {
			
			
			String returnS= Dao.accepted.toString();
			Dao.accepted = "".toString();
			
			Dao.poolWaiting.put(Constant.REQUEST, user);
			
			
			if(!returnS.equals("")) {
				
				Dao.poolWaiting.clear();
			}
			return returnS;
		}
	}
	
	public void accept(String user) {
		
		Dao.poolWaiting.clear();
		Dao.accepted=user;
		
	}






	
	public Station getStation(LocationDTO locationDTO, int key){
		
		if(key ==1)  {
			return Constant.dao.bellandurStation;
		}else if (key==2) {
			return Constant.dao.marathaliStation;
		}else if(key==3) {
		return 	Constant.dao.whitefieldStation;
		}
		return null;
				
	}
	
	public void removeSurge(LocationDTO locationDTO, int key){
		
		
	
				
	}
	
	public void addSurge(LocationDTO locationDTO, int key){
		
		
	
				
	}
	
	public List<SolutionDTO> getAvailableStations(LocationDTO locationDTO, User user){
		
		if(Constant.user1.equals(user.getUserName()) ) {
			return Constant.dao.stationListUser1;
		}else {
			return Constant.dao.stationListUser2;
		}
				
	}
	
	
	
}
