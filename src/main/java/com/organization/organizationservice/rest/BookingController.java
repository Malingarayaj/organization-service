package com.organization.organizationservice.rest;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.entity.Booking;
import com.organization.organizationservice.execption.RecordAlreadyPresentException;
import com.organization.organizationservice.execption.RecordNotFoundException;
import com.organization.organizationservice.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired(required = true)
	BookingService bookingService;

	@PostMapping("/createBooking")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addBooking(@RequestBody Booking newBooking) {

		bookingService.createBooking(newBooking);
	}

	@GetMapping("/readAllBooking")
	public Iterable<Booking> readAllBookings() {

		return bookingService.displayAllBooking();
	}

	@PutMapping("/updateBooking")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyBooking(@RequestBody Booking updateBooking) {

		bookingService.updateBooking(updateBooking);
	}

	@GetMapping("/searchBooking/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> searchBookingByID(@PathVariable("id") BigInteger bookingId) {

		return bookingService.findBookingById(bookingId);
	}

	@DeleteMapping("/deleteBooking/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void deleteBookingByID(@PathVariable("id") BigInteger bookingId) {

		bookingService.deleteBooking(bookingId);
	}

}
