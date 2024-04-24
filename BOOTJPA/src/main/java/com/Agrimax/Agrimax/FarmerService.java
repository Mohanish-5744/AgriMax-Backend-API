package com.Agrimax.Agrimax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmerService {
	@Autowired
	private FarmerRepository repo;
	
	public List<Farmer> listAll()
	{
		return (List<Farmer>)repo.findAll();
	}
	
	public void save(Farmer student)
	{
		repo.save(student);
	}
	
	public Farmer get(Integer id)
	{
		return repo.findById(id).get();
	}
	
	public Farmer getSearch(String name)
	{
		String[] parts = name.split(" ");
		String fname = parts[0];
        String lname = parts[1];
		return repo.findByFnameAndLname(fname,lname);
	}
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

	
	public List<Farmer> SearchFname(String fname)
	{
//		System.out.print(fname);
		return (List<Farmer>)repo.findByFnameContainingIgnoreCase(fname);
	}
	
//	public boolean auth(String email, String password) {
//    	if(repo.existsByEmailAndPassword(email,password)==true) {
//    		return true;
//    	}
//    	return false;
//    }
	
}
