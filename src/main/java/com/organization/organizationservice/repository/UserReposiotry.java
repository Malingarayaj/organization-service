package com.organization.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.organizationservice.entity.User;
@Repository
public interface UserReposiotry extends JpaRepository<User, String> {

}
