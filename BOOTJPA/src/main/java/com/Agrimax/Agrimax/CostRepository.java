package com.Agrimax.Agrimax;

import org.springframework.data.repository.CrudRepository;


public interface CostRepository extends CrudRepository<Cost,Integer>{

	Cost findByCrop(String crop);

}