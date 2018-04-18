package com.niit.backend.model;

import java.util.Date;

/**
 * @author hp
 *
 */
public class SignInDetails {

	private String logInID;

	private String logInUserName;
	private String logInEmail;
	private String logInPassword;
	private Date logOnDate;	
	private Date logOffDate;
	/**
	 * @return the logInID
	 */
	public String getLogInID() {
		return logInID;
	}
	/**
	 * @param logInID the logInID to set
	 */
	public void setLogInID(String logInID) {
		this.logInID = logInID;
	}
	/**
	 * @return the logInUserName
	 */
	public String getLogInUserName() {
		return logInUserName;
	}
	/**
	 * @param logInUserName the logInUserName to set
	 */
	public void setLogInUserName(String logInUserName) {
		this.logInUserName = logInUserName;
	}
	/**
	 * @return the logInEmail
	 */
	public String getLogInEmail() {
		return logInEmail;
	}
	/**
	 * @param logInEmail the logInEmail to set
	 */
	public void setLogInEmail(String logInEmail) {
		this.logInEmail = logInEmail;
	}
	/**
	 * @return the logInPassword
	 */
	public String getLogInPassword() {
		return logInPassword;
	}
	/**
	 * @param logInPassword the logInPassword to set
	 */
	public void setLogInPassword(String logInPassword) {
		this.logInPassword = logInPassword;
	}
	/**
	 * @return the logOnDate
	 */
	public Date getLogOnDate() {
		return logOnDate;
	}
	/**
	 * @param logOnDate the logOnDate to set
	 */
	public void setLogOnDate(Date logOnDate) {
		this.logOnDate = logOnDate;
	}
	/**
	 * @return the logOffDate
	 */
	public Date getLogOffDate() {
		return logOffDate;
	}
	/**
	 * @param logOffDate the logOffDate to set
	 */
	public void setLogOffDate(Date logOffDate) {
		this.logOffDate = logOffDate;
	}	
	
}