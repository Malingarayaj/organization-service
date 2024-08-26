package com.organization.organizationservice.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, BigInteger> {

}
