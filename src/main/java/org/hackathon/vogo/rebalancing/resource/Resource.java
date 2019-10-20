package org.hackathon.vogo.rebalancing.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Set;
 
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hackathon.vogo.rebalancing.dto.LocationDTO;
import org.hackathon.vogo.rebalancing.dto.SearchResponse;
import org.hackathon.vogo.rebalancing.dto.User;
import org.hackathon.vogo.rebalancing.service.Service;

import com.fasterxml.jackson.databind.util.JSONPObject;



@Path("/vogo")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {
 
    private final Validator validator;
 
    Service service = new Service();
    
    public Resource(Validator validator) {
        this.validator = validator;
    }
 
    
    
 
   
   @GET
   @Path("getAvailableStations/{user}/{location}")
   public Response getAvailableStations(@PathParam("user")String user,@PathParam("location")String location) {
   
   		return Response.ok(service.getAvailableStations(user,location)).build();
   }
   
   @GET
   @Path("getAvailableStation/{user}/{location}/{destination}")
   public Response getAvailableStation(@PathParam("user")String user,@PathParam("location")String location,@PathParam("destination")String destination) {
   
   		return Response.ok(service.getAvailableStation(user,location,destination)).build();
   }
   
   @GET
   @Path("searchPool/{user}/{role}")
   public Response searchPool(@PathParam("user") String user,@PathParam("role") String role) {
      
   		
   		String match  = service.poolMatch(user,role);
   		
   		if(match== null || match.equals("")) {
   			
   			
   		 
   			
   			return Response.ok(new SearchResponse("No Match")).build();
   		}else {
   			return Response.ok(new SearchResponse("Hurray!! You got a match with User-"+match)).build();
   		}
   
    
   }
   
   @GET
   @Path("accept/{user}")
   public Response searchPool(@PathParam("user") String user) {
      
   		
   	service.accept(user);
   		
   		
   			return Response.ok(new SearchResponse("Accepted")).build();
   		
   
    
   }
    
  
    

    
    @GET
    @Path("removeSurge/{key}")
    public Response removeSurge(@PathParam("key")int key) {
       
    		//LocationDTO dto = new LocationDTO(lat, lon);
    	service.removeSurge(null, key);
    	return Response.ok(service.getStation(null,key)).build();
    }
    
    @GET
    @Path("addSurge/{key}")
    public Response addSurge(@PathParam("key")int key) {
       
    		//LocationDTO dto = new LocationDTO(lat, lon);
    		service.addSurge(null, key);
    		return Response.ok(service.getStation(null,key)).build();
    }
    
    
    @POST
    @Path("getAvailableStations/{lat}/{lon}")
    public Response getStations(@PathParam("lat") float lat,@PathParam("long") float lon, User user) {
    LocationDTO dto = new LocationDTO(lat, lon);    
    	return Response.ok(service.getAvailableStations(dto, user)).build();
    }
    
    @GET
    @Path("getStation/{key}")
    public Response getStation(@PathParam("key")int key) {
       
    		//LocationDTO dto = new LocationDTO(lat, lon);
    		return Response.ok(service.getStation(null,key)).build();
    }
    
    @GET
    @Path("getStation/{lat}/{lon}/{key}")
    public Response getStation(@PathParam("lat") float lat,@PathParam("long") float lon,@PathParam("key")int key) {
       
    		LocationDTO dto = new LocationDTO(lat, lon);
    		return Response.ok(service.getStation(dto, key)).build();
    }
    
    @GET
    @Path("removeSurge/{lat}/{lon}/{key}")
    public Response removeSurge(@PathParam("lat") float lat,@PathParam("long") float lon,@PathParam("key")int key) {
       
    		LocationDTO dto = new LocationDTO(lat, lon);
    		return Response.ok(service.getStation(dto, key)).build();
    }
    
    @GET
    @Path("/temp")
    public Response getEmployees() {
        return Response.ok(new LocationDTO(1,2)).build();
    }
    
    
    
    
    
    
    
 
  
}