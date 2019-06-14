package com.tourism.util;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.tourism.request.FetchTouristSpotRequest;


public class Utility {

	
	public static FetchTouristSpotRequest parseFetchTouristSpotRequest(String reqXML) throws JAXBException {
		FetchTouristSpotRequest fetchTouristSpotRequest = new FetchTouristSpotRequest();
		JAXBContext jaxbContext = JAXBContext.newInstance(FetchTouristSpotRequest.class);
		StringReader sw = new StringReader(reqXML);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		fetchTouristSpotRequest = (FetchTouristSpotRequest) jaxbUnmarshaller.unmarshal(sw);
		return fetchTouristSpotRequest;
	}
	
}
