package com.Agrimax.Agrimax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostServices {
	
	@Autowired
	private CostRepository repo;
	
	public List<Cost> listAll()
	{
		return (List<Cost>)repo.findAll();
	}
	
	public void save(Cost student)
	{
		repo.save(student);
	}
	
	public Cost get(String crop)
	{
		return repo.findByCrop(crop);
	}
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
//	public boolean auth(String Name) {
//    	if(repo.existsByName(Name) != null) {
//    		return true;
//    	}
//    	return false;
//    }
	
}
