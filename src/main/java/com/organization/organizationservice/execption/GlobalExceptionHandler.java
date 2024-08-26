package com.organization.organizationservice.execption;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.organization.organizationservice.dto.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExeptionHandler(ResourceNotFoundException ex) {
		String mes = ex.getMessage();
		ApiResponse response = new ApiResponse(mes, false);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(FacultyLevaeNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExeptionHandler1(FacultyLevaeNotFoundException ex) {
		String mes = ex.getMessage();
		ApiResponse response = new ApiResponse(mes, false);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.BAD_REQUEST);
		//return ResponseEntity.(response,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		Map<String, String> resp = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String filedName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			resp.put(filedName, message);
		});
		return new ResponseEntity<Map<String, String>>(resp, HttpStatus.BAD_REQUEST);

	}
}
