package com.organization.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.StudentRecords;

public interface StudentRecordsRepo extends JpaRepository<StudentRecords, Long> {

}
