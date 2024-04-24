package com.Agrimax.Agrimax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServices {
	
	@Autowired
	private LocationRepository repo;
	
	public Location get(String location)
	{
		return repo.findByLocation(location);
	}
	
	
}