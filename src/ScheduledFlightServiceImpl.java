package com.organization.organizationservice.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.entity.Schedule;
import com.organization.organizationservice.entity.ScheduledFlight;
import com.organization.organizationservice.execption.RecordNotFoundException;
import com.organization.organizationservice.execption.ResourceNotFoundException;
import com.organization.organizationservice.execption.ScheduledFlightNotFoundException;
import com.organization.organizationservice.repository.BookingRepository;
import com.organization.organizationservice.repository.Scheduled;
import com.organization.organizationservice.repository.ScheduledFlightRepository;

@Service
public class ScheduledFlightServiceImpl implements ScheduledFlightService {

	@Autowired
	private ScheduledFlightRepository scheduledFlightRepository;

	@Autowired
	private BookingRepository bookingRepository;

	private Scheduled scheduled;

	@Override
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight) {
		return scheduledFlightRepository.save(scheduledFlight);
	}

	@Override
	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight) {
		ScheduledFlight updateScheduleFlight = scheduledFlightRepository.findById(scheduledFlight.getScheduleFlightId())
				.get();
		updateScheduleFlight.setAvailableSeats(scheduledFlight.getAvailableSeats());
		Schedule updateSchedule = scheduled.findById(scheduledFlight.getSchedule().getScheduleId()).get();
		updateSchedule.setSrcAirport(scheduledFlight.getSchedule().getSrcAirport());
		updateSchedule.setDstnAirport(scheduledFlight.getSchedule().getDstnAirport());
		updateSchedule.setDeptDateTime(scheduledFlight.getSchedule().getDeptDateTime());
		updateSchedule.setArrDateTime(scheduledFlight.getSchedule().getArrDateTime());
		scheduledFlightRepository.save(updateScheduleFlight);
		return scheduledFlight;
	}

	@Override
	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException {
		if (id == null) {
			throw new RecordNotFoundException("Enter flight Id");

		}
		Optional<ScheduledFlight> scheduleFlight = scheduledFlightRepository.findById(id);
		if (!scheduleFlight.isPresent()) {
			throw new RecordNotFoundException("Enter a valid Flight Id");

		} else
			scheduledFlightRepository.deleteById(id);
		return "Scheduled flight with ID " + id + " is not found";
	}

	@Override
	public Iterable<ScheduledFlight> viewAllScheduledFlights() {
		return scheduledFlightRepository.findAll();
	}

	@Override
	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException {
		if (id == null) {
			throw new RecordNotFoundException("no flghts");
		}
		Optional<ScheduledFlight> findFlight = scheduledFlightRepository.findById(id);
		if (!findFlight.isPresent()) {
			throw new RecordNotFoundException("no flghts");

		} else
			return findFlight.get();
	}

}
