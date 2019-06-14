package com.tourism.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FetchToursitSpotResponse")
public class FetchTouristSpotResponse {
	
	String destinations;
	String message;
	String responseCode;
	String result;
	
	
	
	@XmlElement
	public String getDestinations() {
		return destinations;
	}

	public void setDestinations(String destinations) {
		this.destinations = destinations;
	}
	@XmlElement
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@XmlElement
	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	@XmlElement
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
