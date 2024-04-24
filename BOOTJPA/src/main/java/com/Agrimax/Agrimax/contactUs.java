package com.Agrimax.Agrimax;

public class contactUs {

	public String fname;
    public String lname;
    public String email;
    public String phoneNumber;
    public String message;
    public String selectSubject;
	
	public contactUs()
	{
		super();
	}

	public contactUs(String fname, String lname, String email, String phoneNumber, String message,
			String selectSubject) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.message = message;
		this.selectSubject = selectSubject;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSelectSubject() {
		return selectSubject;
	}

	public void setSelectSubject(String selectSubject) {
		this.selectSubject = selectSubject;
	}

	
}
