package com.organization.organizationservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.entity.Airport;
import com.organization.organizationservice.execption.RecordAlreadyPresentException;
import com.organization.organizationservice.execption.RecordNotFoundException;
import com.organization.organizationservice.service.AirportService;

@RestController
@RequestMapping("/")
public class AirportController {
	
	@Autowired
	private AirportService airportService;
	
	
	@GetMapping("/viewAirport/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public Airport viewAirport(@PathVariable("id") String airportCode) {
		return airportService.viewAirport(airportCode);
	}

	@GetMapping("/allAirport")
	public Iterable<Airport> viewAllAirport() {
		return airportService.viewAllAirport();
	}

	@PostMapping("/addAirport")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addAirport(@RequestBody Airport airport) {
		airportService.addAirport(airport);
	}

	@PutMapping("/updateAirport")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyAirport(@RequestBody Airport airport) {
		airportService.modifyAirport(airport);
	}

	@DeleteMapping("/deleteAirport/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void removeAirport(@PathVariable("id") String airportCode) {
		airportService.removeAirport(airportCode);
	}

}
