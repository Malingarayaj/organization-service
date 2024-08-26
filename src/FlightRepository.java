package com.organization.organizationservice.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, BigInteger>{

}
