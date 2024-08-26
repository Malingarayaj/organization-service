package com.organization.organizationservice.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.ScheduledFlight;

public interface ScheduledFlightRepository extends JpaRepository<ScheduledFlight, BigInteger>{

}
