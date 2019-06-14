package com.tourism.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FetchToursitSpotRequest")
public class FetchTouristSpotRequest {
	
	String stateName;
	
	@XmlElement
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
