package com.Agrimax.Agrimax;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CropInfo {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

		private String name;
		private String sciname;
	    private String description;
	    private String season;
	    private String Infection;
	    @Override
		public String toString() {
			return "CropInfo [id=" + id + ", name=" + name + ", sciname=" + sciname + ", description=" + description
					+ ", season=" + season + ", Infection=" + Infection + ", getId()=" + getId() + ", getName()="
					+ getName() + ", getSciname()=" + getSciname() + ", getDescription()=" + getDescription()
					+ ", getSeason()=" + getSeason() + ", getInfection()=" + getInfection() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		public CropInfo(int id, String name, String sciname, String description, String season, String infection) {
			super();
			this.id = id;
			this.name = name;
			this.sciname = sciname;
			this.description = description;
			this.season = season;
			Infection = infection;
		}
		public CropInfo() {
			super();
			// TODO Auto-generated constructor stub
		}
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
		public String getSciname() {
			return sciname;
		}
		public void setSciname(String sciname) {
			this.sciname = sciname;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getSeason() {
			return season;
		}
		public void setSeason(String season) {
			this.season = season;
		}
		public String getInfection() {
			return Infection;
		}
		public void setInfection(String infection) {
			Infection = infection;
		}
		

}