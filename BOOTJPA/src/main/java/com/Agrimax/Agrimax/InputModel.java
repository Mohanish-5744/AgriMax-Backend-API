package com.Agrimax.Agrimax;

public class InputModel {
	
	public String Crop1;
	public String Crop2;
	public String Crop3;
	public String Area1;
	public String Area2;
	public String Area3;
	public String Location;
	
	public InputModel()
	{
		super();
	}
	
	public InputModel(String crop1, String crop2, String crop3, String area1, String area2, String area3,
			String location) {
		super();
		Crop1 = crop1;
		Crop2 = crop2;
		Crop3 = crop3;
		Area1 = area1;
		Area2 = area2;
		Area3 = area3;
		Location = location;
	}
	
	public String getCrop1() {
		return Crop1;
	}

	public void setCrop1(String crop1) {
		Crop1 = crop1;
	}

	public String getCrop2() {
		return Crop2;
	}

	public void setCrop2(String crop2) {
		Crop2 = crop2;
	}

	public String getCrop3() {
		return Crop3;
	}

	public void setCrop3(String crop3) {
		Crop3 = crop3;
	}

	public String getArea1() {
		return Area1;
	}

	public void setArea1(String area1) {
		Area1 = area1;
	}

	public String getArea2() {
		return Area2;
	}

	public void setArea2(String area2) {
		Area2 = area2;
	}

	public String getArea3() {
		return Area3;
	}

	public void setArea3(String area3) {
		Area3 = area3;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}
	

	
	
}
