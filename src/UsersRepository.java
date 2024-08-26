package com.organization.organizationservice.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.Users;

public interface UsersRepository  extends JpaRepository<Users, BigInteger>{

}
