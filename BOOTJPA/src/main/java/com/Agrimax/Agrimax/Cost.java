package com.Agrimax.Agrimax;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cost {
	
	public String crop;
	public int fertilizers;
	public int perni;
	public int kapni;
	public int investment;
	
	public Cost()
	{
		super();
	}
	
	public Cost(String crop, int fertilizers, int perni, int kapni, int investment) {
		super();
		this.crop = crop;
		this.fertilizers = fertilizers;
		this.perni = perni;
		this.kapni = kapni;
		this.investment = investment;
	}
	@Id
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public int getFertilizers() {
		return fertilizers;
	}
	public void setFertilizers(int fertilizers) {
		this.fertilizers = fertilizers;
	}
	public int getPerni() {
		return perni;
	}
	public void setPerni(int perni) {
		this.perni = perni;
	}
	public int getKapni() {
		return kapni;
	}
	public void setKapni(int kapni) {
		this.kapni = kapni;
	}
	public int getInvestment() {
		return investment;
	}
	public void setInvestment(int investment) {
		this.investment = investment;
	}
	
	
	
}
