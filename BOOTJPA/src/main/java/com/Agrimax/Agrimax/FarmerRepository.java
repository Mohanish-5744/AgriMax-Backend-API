package com.Agrimax.Agrimax;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FarmerRepository extends CrudRepository<Farmer,Integer>{

	List<Farmer> findByFnameContainingIgnoreCase(String fname);

	Farmer findByFnameAndLname(String fname, String lname);

}