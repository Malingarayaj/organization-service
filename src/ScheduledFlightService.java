package com.organization.organizationservice.service;

import java.math.BigInteger;

import com.organization.organizationservice.entity.ScheduledFlight;
import com.organization.organizationservice.execption.RecordNotFoundException;
import com.organization.organizationservice.execption.ScheduledFlightNotFoundException;

public interface ScheduledFlightService {

	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);

	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);

	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;

	public Iterable<ScheduledFlight> viewAllScheduledFlights();

	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
	// boolean cancelBookings(BigInteger flightId) throws RecordNotFoundException;
}
