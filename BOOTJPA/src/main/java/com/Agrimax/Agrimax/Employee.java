package com.Agrimax.Agrimax;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String adharno;
	
	public Employee()
	{
		super();
	}
	
	public Employee(int id, String name, String email, String password, String adharno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.adharno = adharno;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	
	
	

}
