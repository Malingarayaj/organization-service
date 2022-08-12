package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class RouteNameWithRouteNumberDTO {
	
	private String response;
	
	private List<RouteNameWithNumbers> routes=new ArrayList<RouteNameWithNumbers>();

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<RouteNameWithNumbers> getRoutes() {
		return routes;
	}

	public void setRoutes(List<RouteNameWithNumbers> routes) {
		this.routes = routes;
	}
	
	

}
