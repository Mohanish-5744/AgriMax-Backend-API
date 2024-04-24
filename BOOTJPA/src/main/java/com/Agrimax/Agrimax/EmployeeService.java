package com.Agrimax.Agrimax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> listAll()
	{
		return (List<Employee>)repo.findAll();
	}
	
	public void save(Employee student)
	{
		repo.save(student);
	}
	
	public Employee get(Integer id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	public boolean auth(String email, String password) {
    	if(repo.existsByEmailAndPassword(email,password)==true) {
    		return true;
    	}
    	return false;
    }
	
}
