//package com.organization.organizationservice.dto;
//
//import io.swagger.annotations.ApiModelProperty;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonInclude.Include;
//
//
//@JsonInclude(Include.NON_NULL)
//public class LoginCredentialsDTO {
//
//    @ApiModelProperty(value = "userName of the person", notes = "userName", required = true, dataType = "String")
//    private String userName;
//   
//    @ApiModelProperty(value = "password of the person", notes = "password", required = true)
//    private String password;
//  
//    /**
//     * Default Constructor
//     */
//    public LoginCredentialsDTO(){
//      
//    }
//
//	/**
//	 * @param psId
//	 * @param userName
//	 * @param password
//	 */
//	public LoginCredentialsDTO(String userName, String password) {
//		super();
//		this.userName = userName;
//		this.password = password;
//	}
//
//	/**
//	 * @return the userName
//	 */
//	public String getUserName() {
//		return userName;
//	}
//
//	/**
//	 * @param userName the userName to set
//	 */
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	/**
//	 * @return the password
//	 */
//	public String getPassword() {
//		return password;
//	}
//
//	/**
//	 * @param password the password to set
//	 */
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//}
