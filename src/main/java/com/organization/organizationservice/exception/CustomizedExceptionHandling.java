package com.organization.organizationservice.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.organization.organizationservice.execption.organizationNotFound;

@ControllerAdvice
public class CustomizedExceptionHandling extends ResponseEntityExceptionHandler{
	 @ExceptionHandler(AffiliationNumberAlreadyExist.class)
     public ResponseEntity<Object> handleExceptions(AffiliationNumberAlreadyExist ex, WebRequest webRequest) {
         ExceptionResponse response = new ExceptionResponse();
         response.setDateTime(LocalDateTime.now());
         response.setMessage("AffiliationNumber Already exist in database!!!");
         ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
         return entity;
     }
	 @ExceptionHandler(AlreadyOrganizationExist.class)
     public ResponseEntity<Object> handleExceptions(AlreadyOrganizationExist ex, WebRequest webRequest) {
         ExceptionResponse response = new ExceptionResponse();
         response.setDateTime(LocalDateTime.now());
         response.setMessage("AlreadyOrganizationExist Already exist in database!!!");
         ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
         return entity;
     }
	 @ExceptionHandler(BranchAlreadyExist.class)
     public ResponseEntity<Object> handleExceptions(BranchAlreadyExist ex, WebRequest webRequest) {
         ExceptionResponse response = new ExceptionResponse();
         response.setDateTime(LocalDateTime.now());
         response.setMessage("BranchAlreadyExist Already exist in database!!!");
         ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
         return entity;
     }
	 
	 @ExceptionHandler(organizationNotFound.class)
     public ResponseEntity<Object> handleExceptions(organizationNotFound ex, WebRequest webRequest) {
         ExceptionResponse response = new ExceptionResponse();
         response.setDateTime(LocalDateTime.now());
         response.setMessage("Organization is not found given Id!!!");
         ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
         return entity;
     }
	 
	 @ExceptionHandler(classRoomisAlreadyExist.class)
     public ResponseEntity<Object> handleExceptions(classRoomisAlreadyExist ex, WebRequest webRequest) {
         ExceptionResponse response = new ExceptionResponse();
         response.setDateTime(LocalDateTime.now());
         response.setMessage("class Room already found given by Id!!!");
         ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.FOUND);
         return entity;
     }
}
