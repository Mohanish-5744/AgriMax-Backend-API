package com.Agrimax.Agrimax;

import org.springframework.data.repository.CrudRepository;


public interface LocationRepository extends CrudRepository<Location,Integer>{

	Location findByLocation(String location);

}