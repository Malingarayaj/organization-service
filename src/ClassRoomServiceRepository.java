package com.organization.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.ClassRoom;

public interface ClassRoomServiceRepository extends JpaRepository<ClassRoom, String> {

	

	//Optional<ClassRoom> findByClassRoomId(String classRoomId);

}
