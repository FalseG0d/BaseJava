package com.tourism.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import com.tourism.request.FetchTouristSpotRequest;
import com.tourism.response.FetchTouristSpotResponse;
import com.tourism.util.Utility;

@Path("/fetchTouristSpots")
public class FetchTouristSpotsService {
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_XML)
	
	public static FetchTouristSpotResponse fetchTouristSpots(String reqXML) {
		
		FetchTouristSpotResponse response = new FetchTouristSpotResponse();
		if (reqXML == null) {
			
			response.setMessage("Invalid Request XML");
			response.setResponseCode("P-201");
			response.setResult("N");
			response.setDestinations("");
			return response;
		}
		try {
			FetchTouristSpotRequest  request = Utility.parseFetchTouristSpotRequest(reqXML);
			// add your business rule 
			response.setMessage("Success");
			response.setResponseCode("200");
			response.setResult("Y");
			response.setDestinations("Shimla");
			return response;
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
		
		
	}
	

}
