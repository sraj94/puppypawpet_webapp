package com.niit.backend.model;

import java.sql.Date;

/**
 * 
 * @author hp
 *
 */
public class LoginCredentials {

	private int id;
	private String userEmail;
	private Date loggedOnDate;
	private Date loggedOffDate;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}
	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	/**
	 * @return the loggedOnDate
	 */
	public Date getLoggedOnDate() {
		return loggedOnDate;
	}
	/**
	 * @param loggedOnDate the loggedOnDate to set
	 */
	public void setLoggedOnDate(Date loggedOnDate) {
		this.loggedOnDate = loggedOnDate;
	}
	/**
	 * @return the loggedOffDate
	 */
	public Date getLoggedOffDate() {
		return loggedOffDate;
	}
	/**
	 * @param loggedOffDate the loggedOffDate to set
	 */
	public void setLoggedOffDate(Date loggedOffDate) {
		this.loggedOffDate = loggedOffDate;
	}
	
}