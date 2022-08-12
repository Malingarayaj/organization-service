package com.organization.organizationservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.organizationservice.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, String> {

	Optional<Student> findByStudentId(String studentId);

	//Boolean deleteStudentById(String studentId);

	void deleteByStudentId(String studentId);

}
