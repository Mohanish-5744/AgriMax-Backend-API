package com.Agrimax.Agrimax;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
	boolean existsByEmailAndPassword(String email, String password);
}