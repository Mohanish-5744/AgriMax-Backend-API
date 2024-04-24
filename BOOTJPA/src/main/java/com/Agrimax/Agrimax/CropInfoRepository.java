package com.Agrimax.Agrimax;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CropInfoRepository extends CrudRepository<CropInfo, Long> {
		List<CropInfo> findByNameContainingIgnoreCase(String name);
		CropInfo findByName(String name);
}