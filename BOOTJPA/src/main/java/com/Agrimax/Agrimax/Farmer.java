package com.Agrimax.Agrimax;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Farmer {
	
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String adharno;
	private String crop1;
	private String crop2;
	private String crop3;
	private String address;
	private String category;
	private String areainacars;
	private String areacoordinates;
	private String contact;
		
	public Farmer()
	{
		super();
	}

	public Farmer(int id, String fname, String lname, String email, String adharno, String crop1, String crop2,
			String crop3, String address, String category, String areainacars, String areacoordinates, String contact) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.adharno = adharno;
		this.crop1 = crop1;
		this.crop2 = crop2;
		this.crop3 = crop3;
		this.address = address;
		this.category = category;
		this.areainacars = areainacars;
		this.areacoordinates = areacoordinates;
		this.contact = contact;
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getAdharno() {
		return adharno;
	}


	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}


	public String getCrop1() {
		return crop1;
	}


	public void setCrop1(String crop1) {
		this.crop1 = crop1;
	}


	public String getCrop2() {
		return crop2;
	}


	public void setCrop2(String crop2) {
		this.crop2 = crop2;
	}


	public String getCrop3() {
		return crop3;
	}


	public void setCrop3(String crop3) {
		this.crop3 = crop3;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getAreainacars() {
		return areainacars;
	}


	public void setAreainacars(String areainacars) {
		this.areainacars = areainacars;
	}


	public String getAreacoordinates() {
		return areacoordinates;
	}


	public void setAreacoordinates(String areacoordinates) {
		this.areacoordinates = areacoordinates;
	}
	
	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}

}
